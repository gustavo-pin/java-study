import crypto.Bytes;
import crypto.Hash256;

public class Transaction {
    String prvTxId;
    String txId;
    String from;
    String to;
    int amount;

    public Transaction(String from, String to, int amount, String prvTx) {
        this.from = from;
        this.to = to;
        this.amount = amount;
        this.prvTxId = prvTx;

        this.txId = this.createTxId();
    }

    private String createTxId() {
        return Bytes.bytesToHex(Hash256.digest(this.toString()));
    }

    @Override
    public String toString() {
        return this.from+this.to+this.amount+this.prvTxId;
    }
}
