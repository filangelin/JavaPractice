package practice9.reentrantLock;

import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private int balance;
    ReentrantLock lock = new ReentrantLock();

    public BankAccount(int sum) {
        balance = sum;
    }

    public void transfer(BankAccount account, int sum) {
        lock.lock();
        try {
            if (sum <= balance) {
                this.balance -= sum;
                account.balance += sum;
            }
        } finally {
            lock.unlock();
        }
    }

    public int getBalance() {
        return balance;
    }
}
