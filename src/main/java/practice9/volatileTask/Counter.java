package practice9.volatileTask;

public class Counter implements Runnable {
    private volatile boolean isRunning = true;
    private int count = 0;


    @Override
    public void run() {
        while (isRunning) {
            count++;
        }
        System.out.println("Счетчик остановлен, count = " + count);
    }

    public void stop() {
        isRunning = false;
    }
}
