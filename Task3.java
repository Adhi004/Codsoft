import java.util.Scanner;
class ATM{
    private int balance;
    public ATM(int balance) {
        this.balance = balance;
    }
    public void withdraw(int amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. Your new balance is: " + balance);
        } else {
            System.out.println("Insufficient funds. Your balance is: " + balance);
        }
    }
    public void deposit(int amount) {
        balance += amount;
        System.out.println("Deposit successful. Your new balance is: " + balance);
    }
    public void checkBalance() {
        System.out.println("Your balance is: " + balance);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the ATM.");
        System.out.println("Please enter your PIN:");
        int pin = scanner.nextInt();
        if (pin == 1234) {
            ATM atm = new ATM(1000);
            while (true) {
                System.out.println("Please choose an option:");
                System.out.println("1. Withdraw");
                System.out.println("2. Deposit");
                System.out.println("3. Check balance");
                System.out.println("4. Exit");
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Enter the amount you want to withdraw:");
                        int amountToWithdraw = scanner.nextInt();
                        atm.withdraw(amountToWithdraw);
                        break;
                    case 2:
                        System.out.println("Enter the amount you want to deposit:");
                        int amountToDeposit = scanner.nextInt();
                        atm.deposit(amountToDeposit);
                        break;
                    case 3:
                        atm.checkBalance();
                        break;
                    case 4:
                        System.out.println("Thank you for using the ATM.");
                }
            }
        }
    }
}
