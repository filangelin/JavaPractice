package practice2;

public class BankAccount {
    String owner;
    Double balance;

    BankAccount(String owner, Double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    String getOwner() {
        return owner;
    }

    void setOwner(String owner) {
        this.owner = owner;
    }

    void deposit(Double amount) {
        balance += amount;
    }

    void withDraw(Double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Недостаточно средств");
        }
    }

    void printBalance() {
        System.out.println("Кол-во средств на аккаунте" + owner + " = " + balance);
    }


}
