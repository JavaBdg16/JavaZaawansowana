package oop.encapsulation;

public class Account {

    private String accountNumber;
    private int accountBalance;

    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void showData() {
        // kof obsługującu wyświetlanie danych
    }

    public void deposit(int amount) {
        if (amount < 0) {
            // show error
        } else {
            this.accountBalance = amount;
        }
    }
}
