import java.util.*;
import java.io.*;

public class atm {

    public static boolean validateInputAmount(int amount) {
        return amount > 0;
    }

    public static final String FILE_NAME = "accounts.txt";

    public static int getBalanceFromFile(int accNo) {
        try {
            Scanner file = new Scanner(new File(FILE_NAME));
            while (file.hasNext()) {
                int fileAcc = file.nextInt();
                int fileBal = file.nextInt();
                if (fileAcc == accNo) {
                    file.close();
                    return fileBal;
                }
            }
            file.close();
        } catch (Exception e) {}
        return -1;
    }

    public static void updateAccountInFile(int accNo, int newBal) {
        File file = new File(FILE_NAME);
        File temp = new File("temp.txt");
        boolean found = false;

        try {
            Scanner sc = new Scanner(file);
            PrintWriter pw = new PrintWriter(temp);
            while (sc.hasNext()) {
                int fileAcc = sc.nextInt();
                int fileBal = sc.nextInt();
                if (fileAcc == accNo) {
                    pw.println(accNo + " " + newBal);
                    found = true;
                } else {
                    pw.println(fileAcc + " " + fileBal);
                }
            }
            if (!found) {
                pw.println(accNo + " " + newBal);
            }
            sc.close();
            pw.close();
            file.delete();
            temp.renameTo(file);
        } catch (Exception e) {
            try {
                PrintWriter pw = new PrintWriter(new FileWriter(FILE_NAME, true));
                pw.println(accNo + " " + newBal);
                pw.close();
            } catch (Exception ignored) {}
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 0, withdraw, deposit, accountNumber;

        System.out.println("========== Welcome to ATM ==========");

        while (true) {
            System.out.print("Enter your Account Number: ");
            accountNumber = sc.nextInt();
            balance = getBalanceFromFile(accountNumber);
            if (balance == -1) {
                System.out.println("Account not found!");
                System.out.print("Do you want to create a new account? (y/n): ");
                char ch = sc.next().charAt(0);
                if (ch == 'y' || ch == 'Y') {
                    System.out.print("Create your new Account Number: ");
                    accountNumber = sc.nextInt();
                    System.out.print("Enter initial deposit: ");
                    balance = sc.nextInt();
                    updateAccountInFile(accountNumber, balance);
                    System.out.println("Account created successfully!");
                    break;
                } else {
                    System.out.println("Please retype your account number.");
                }
            } else {
                System.out.println("Login Successful!");
                System.out.println("Your Current Balance: ₹" + balance);
                break;
            }
        }

        while (true) {
            System.out.println("\n1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to withdraw: ");
                    withdraw = sc.nextInt();
                    if (!validateInputAmount(withdraw)) {
                        System.out.println("Enter amount greater than zero!");
                        break;
                    }
                    if (balance >= withdraw) {
                        balance -= withdraw;
                        updateAccountInFile(accountNumber, balance);
                        System.out.println("Please collect your money.");
                    } else {
                        System.out.println("Insufficient Balance!");
                    }
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ");
                    deposit = sc.nextInt();
                    if (!validateInputAmount(deposit)) {
                        System.out.println("Enter amount greater than zero!");
                        break;
                    }
                    balance += deposit;
                    updateAccountInFile(accountNumber, balance);
                    System.out.println("Amount deposited successfully!");
                    break;

                case 3:
                    System.out.println("Balance: ₹" + balance);
                    break;

                case 4:
                    System.out.println("Thank you for using ATM!");
                    System.exit(0);

                default:
                    System.out.println("Invalid option!");
            }
        }
    }
}
