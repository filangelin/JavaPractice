package practice9.reentrantLock;

import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private final int id;
    private int balance;
    ReentrantLock lock = new ReentrantLock();

    public BankAccount(int id, int sum) {
        this.id = id;
        balance = sum;
    }

    public void transfer(BankAccount account, int sum) {
        BankAccount first = this;
        BankAccount second = account;

        if (first.hashCode() > second.hashCode()) {
            first = account;
            second = this;
        }

        first.lock.lock();
        try {
            second.lock.lock();
            try {
                if (sum <= this.balance) {
                    this.balance -= sum;
                    account.balance += sum;
                }
            } finally {
                second.lock.unlock();
            }
        } finally {
            first.lock.unlock();
        }
    }

    public int getBalance() {
        return balance;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }
}
