package day7;

class BankAccount {
    private double balance;  // private balance
    public void deposit(double amount) {
        balance += amount;
    }
    public double getBalance() {
        return balance;
    }
}
public class Main {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.deposit(1000);
        System.out.println("Balance: " + acc.getBalance());
//        System.out.println(acc.balance); //error because balance is private
    }
}
