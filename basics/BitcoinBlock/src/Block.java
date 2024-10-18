import crypto.Bytes;
import crypto.Hash256;

import java.util.ArrayList;
import java.util.Date;

public class Block {
    int version;
    String prvHash;
    String merkleRoot;
    long time;
    byte bits;
    int nonce;

    ArrayList<Transaction> transactionList = new ArrayList<>();

    public Block(int version, String prvHash, byte bits, int nonce, ArrayList<Transaction> txs) throws Exception {
        if(txs.isEmpty()) {
            throw new Exception("The transactions list must contain at least one transaction");
        }

        this.transactionList.addAll(txs);

        this.version    = version;
        this.prvHash    = prvHash;
        this.merkleRoot = this.computeMerkleRoot();
        this.time       = new Date().getTime();
        this.bits       = bits;
        this.nonce      = nonce;
    }

    private String computeMerkleRoot() {
        ArrayList<byte[]> leaves = new ArrayList<>();

        for(Transaction tx : this.transactionList) {
            leaves.add(tx.txId.getBytes());
        }

        if(leaves.size() == 1) {
            return Bytes.bytesToHex(leaves.getFirst());
        }

        while(leaves.size() > 1) {
            ArrayList<byte[]> newLevel = new ArrayList<>();

            for(int i = 0; i < leaves.size(); i+= 2) {
                byte[] left = leaves.get(i);
                byte[] right = (i + 1 < leaves.size()) ? leaves.get(i + 1) : left;

                byte[] concatenated = new byte[left.length + right.length];
                System.arraycopy(left, 0, concatenated, 0, left.length);
                System.arraycopy(right, 0, concatenated, left.length, right.length);

                newLevel.add(Hash256.digest(Bytes.bytesToHex(concatenated)));
            }

            leaves = newLevel;
        }

        return Bytes.bytesToHex(leaves.getFirst());
    }

    public static String findBlockHash(Block block, byte difficulty) {
        String hash = "";
        while(!hash.startsWith("0".repeat(difficulty))) {
            hash = Bytes.bytesToHex(Hash256.digest(block.toString()));
            System.out.println(block.nonce + " : " + hash);
            block.time = new Date().getTime();
            block.nonce++;
        }

        return hash;
    }

    @Override
    public String toString() {
        return this.version + this.prvHash + this.merkleRoot + this.time + this.bits + this.nonce;
    }
}