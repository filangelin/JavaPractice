package practice9.volatileTask;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        Counter counter = new Counter();
        Thread thread = new Thread(counter);
        thread.start();
        Thread.sleep(2000);
        counter.stop();
    }
}
