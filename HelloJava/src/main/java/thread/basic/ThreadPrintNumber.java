package thread.basic;

public class ThreadPrintNumber extends Thread{

    private int lastNum;

    public ThreadPrintNumber(int lastNum) {
        this.lastNum = lastNum;
    }
    @Override
    public void run() {
        for (int i = 0; i < lastNum; i++) {
            System.out.println("i " + i);
        }
    }
}
