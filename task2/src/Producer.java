import java.util.Random;

public class Producer implements Runnable {
    private Drop drop;

    public Producer(Drop drop) {
        this.drop = drop;
    }
    public void run() {
        int infoSize = 100;
        int importantInfo[] = new int[infoSize];
        for (int i = 0; i < infoSize; i++) {
            importantInfo[i] = i;
        }
        Random random = new Random();

        for (int i = 0;
             i < importantInfo.length;
             i++) {
            drop.put(importantInfo[i]);
            try {
                Thread.sleep(random.nextInt(50));
            } catch (InterruptedException e) {}
        }
        drop.put(-42);
    }
}