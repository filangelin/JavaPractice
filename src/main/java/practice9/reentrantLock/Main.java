package practice9.reentrantLock;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        BankAccount account1 = new BankAccount(1000);
        BankAccount account2 = new BankAccount(1000);

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                account1.transfer(account2, 100);
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                account2.transfer(account1, 1);
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Баланс первого аккаунта = " + account1.getBalance());
        System.out.println("Баланс второго аккаунта = " + account2.getBalance());
    }
}
