import java.io.*;

public class Program {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // fields that contains the transient keyword are not detected
        User user = new User();
        User userD = null;

        user.name = "John";
        user.password = "password";

        FileOutputStream fileOut = new FileOutputStream("UserInfo.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);

        out.writeObject(user);
        out.close();
        fileOut.close();

        System.out.println("Obj info saved");

        FileInputStream fileIn = new FileInputStream("UserInfo.ser");
        ObjectInputStream in = new ObjectInputStream(fileIn);

        userD = (User) in.readObject();
        in.close();
        fileIn.close();

        userD.sayHello();
    }
}
