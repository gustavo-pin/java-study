import com.gustavo.bank.User;

public class Main {
    public static void main(String[] args) {
         User usuario = new User("Gustavo", 17);
         usuario.speak();

         com.gustavo.bank.User gustavo = new com.gustavo.bank.User("Gustavo", 17);

         gustavo.speak();
    }
}