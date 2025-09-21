package practice9.executorServiceTask;

public class Task implements Runnable {
    private int taskNumber;

    public Task(int num) {
        taskNumber = num;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Задача - " + taskNumber + " Пул - " + Thread.currentThread().getId());

    }
}
