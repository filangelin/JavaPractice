package practice9.Task6;

public class SumThread implements Runnable {
    private final int[] array;
    private final int start;
    private final int end;
    private int sum = 0;
    private int count = 0;

    public SumThread(int[] array, int start, int end) {
        this.array = array;
        this.start = start;
        this.end = end;
    }

    public int getSum() {
        return sum;
    }

    public int getCount() {
        return count;
    }

    @Override
    public void run() {
        for (int i = start; i < end; i++) {
            sum += array[i];
            count++;
        }
    }
}
