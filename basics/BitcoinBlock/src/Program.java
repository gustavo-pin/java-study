import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws Exception {
        Block block;

        ArrayList<Transaction> transactions = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Do you wanna create a block? (Y or N)");

        String answer = scanner.next().toUpperCase();
        if(answer.equals("Y")) {
            int    version;
            String prvBlock;
            byte   bits;
            int    nonce = 0;

            String sender, recipient, prvTx;
            int    amount;

            System.out.print("Enter the block version: ");
            version = scanner.nextInt();
            System.out.print("Enter the previous block hash: ");
            prvBlock = scanner.next();

            System.out.println("Enter the transactions data:");

            answer = "";
            while(!answer.equals("N")) {
                System.out.println("\nEnter the sender:");
                sender = scanner.next();
                System.out.println("Enter the recipient:");
                recipient = scanner.next();
                System.out.println("Enter the amount:");
                amount = scanner.nextInt();
                System.out.println("Enter the previous tx:");
                prvTx = scanner.next();


                Transaction tx = new Transaction(sender, recipient, amount, prvTx);
                transactions.add(tx);

                System.out.println("\nTransaction hash: "+tx.txId+"\n");

                System.out.println("Want to add more transactions? (Y or N)");
                answer = scanner.next().toUpperCase();
            }

            System.out.print("Enter the difficulty: ");
            bits = scanner.nextByte();

            answer = "";
            System.out.print("\nFinalize the block by: (A = enter the nonce, B = mine): ");
            answer = scanner.next().toUpperCase();

            block = new Block(
                    version,
                    prvBlock,
                    bits,
                    nonce,
                    transactions);

            if(answer.equals("A")) {
                System.out.print("Enter the nonce: ");
                nonce = scanner.nextInt();
            } else if(answer.equals("B")) {
                String hash = Block.findBlockHash(block, bits);
                System.out.println(hash);
            }
        }

        System.out.println();
    }
}
