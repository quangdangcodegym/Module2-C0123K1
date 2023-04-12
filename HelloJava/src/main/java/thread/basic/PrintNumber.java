package thread.basic;

public class PrintNumber implements Runnable{
    private int lastNum;

    public PrintNumber(int lastNum) {
        this.lastNum = lastNum;
    }

    @Override
    public void run() {
        for (int i = 0; i < lastNum; i++) {
            System.out.println("i " + i);
        }
    }
}
