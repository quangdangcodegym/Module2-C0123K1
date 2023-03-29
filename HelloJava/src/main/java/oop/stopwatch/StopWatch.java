package oop.stopwatch;

public class StopWatch {
    private  long startTime;    // 0L
    private long endTime;   //OL

    public StopWatch() {
        this.startTime = System.currentTimeMillis();        //1678872278963
    }

    public void start() {
        this.startTime = System.currentTimeMillis();
    }
    public void stop() {
        this.endTime = System.currentTimeMillis();
    }
    public long getElapsedTime() {
        return this.endTime - this.startTime;
    }


    public static void main(String[] args) throws InterruptedException {
        StopWatch stopWatch = new StopWatch();
        //..........
        Thread.sleep(5000);
        stopWatch.start();
        Thread.sleep(2000);
        stopWatch.stop();

        System.out.println(stopWatch.getElapsedTime());

    }
    /**
     System.out.println( System.currentTimeMillis());

     Thread.sleep(3000);

     System.out.println( System.currentTimeMillis());
     */
}
