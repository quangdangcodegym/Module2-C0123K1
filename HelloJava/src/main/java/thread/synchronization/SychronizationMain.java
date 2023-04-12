package thread.synchronization;

public class SychronizationMain {
    public static void main(String[] args) {
        Table obj = new Table();// tao mot object
        /**
        MyThread1 t1 = new MyThread1(obj);      // 5

        MyThread2 t2 = new MyThread2(obj);      // 100
        t1.start();
        t2.start();
         **/
        Thread a1 = new Thread(){
            @Override
            public void run() {
                obj.printTable(5);
            }
        };
        a1.start();
        Thread a2 = new Thread(new Runnable() {
            @Override
            public void run() {
                obj.printTable(100);
            }
        });
        a2.start();
    }
}
