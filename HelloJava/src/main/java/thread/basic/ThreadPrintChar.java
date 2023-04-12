package thread.basic;

public class ThreadPrintChar extends Thread{
    private char charToPrint;
    private int times;

    public ThreadPrintChar(int times, char charToPrint) {
        this.times = times;
        this.charToPrint= charToPrint;
    }
    @Override
    public void run() {
        for (int i = 0; i < times; i++) {
            System.out.println(charToPrint);
        }
    }
}
