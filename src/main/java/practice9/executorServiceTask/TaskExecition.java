package practice9.executorServiceTask;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TaskExecition {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(4);


        for (int i = 0; i < 10; i++) {
            executorService.submit(new Task(i));
        }

        executorService.shutdown();
    }
}
