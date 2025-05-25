import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.AccountException;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account data:");
            
        System.out.print("Number: ");
        Integer number = sc.nextInt();

        System.out.print("Holder: ");
        sc.nextLine();
        String holder = sc.nextLine();

        System.out.print("Initial balance: ");
        Double startingBalance = sc.nextDouble();
        
        System.out.print("Withdraw limit: ");
        Double limit = sc.nextDouble();

        Account acc = new Account(number, holder, startingBalance, limit);
        // System.out.println("\n" + acc);

        System.out.print("\nEnter amount to withdraw: ");
        double amount = sc.nextDouble();

        
        
        try {
            acc.withdraw(amount);
            System.out.printf("New balance: %.2f%n" + acc.getBalance());

        } catch (AccountException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
