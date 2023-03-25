import java.util.Scanner;

public class Main {
    //instantiating static objects
    static Account account = new Account();
    static Scanner scanner = new Scanner(System.in);
    static int withdrawLimit = account.getWithdrawLimit();
    public static void main(String[] args) {
        //instance variables
        int choice = 0;
        int flag = 3;
        int deposit = 0;
        int withdraw = 0;

        while (choice < flag) {
            int balance = account.getBalance();
            //printing menu
            System.out.println("-----------------------------");
            System.out.println("Welcome to your bank account!");
            System.out.println("Your current balance is: " + balance);
            System.out.println("\nType \n1 for Withdrawal\n2 for Deposit\n3 to quit");
            System.out.println("Your choice?");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    withdrawBalance(withdraw);
                    break;
                case 2:
                    depositBalance(deposit);
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("not a valid number, please try again");
                    System.out.println("-----------------------------");
            }
        }
    }
    public static void withdrawBalance(int withdraw) {
        int currentBalance = account.getBalance();
        System.out.println("How much do you wanna withdraw?");
        withdraw = scanner.nextInt();
        scanner.nextLine();

        //withdraw limit validation
        if (withdraw > currentBalance) {
            System.out.println("The amount you wish to withdraw exceeds your current balance. Transaction will not proceed, please try again.");
        } else {
            int formula  = currentBalance - withdraw;
            account.setBalance(formula);
            int newBalance = account.getBalance();
            System.out.println("Your current balance is " + newBalance);
        }
    }
    public static void depositBalance(int deposit) {
        System.out.println("How much do you wanna deposit?");
        deposit = scanner.nextInt();
        scanner.nextLine();
        account.setBalance(deposit);
        int newBalance = account.getBalance();
        System.out.println("Your current balance is " + newBalance);
    }
}
