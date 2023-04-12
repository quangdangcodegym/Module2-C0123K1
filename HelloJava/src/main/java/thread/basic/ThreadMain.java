package thread.basic;

public class ThreadMain {
    public static void main(String[] args) {
        // Code.... Tải video 2GB: 1h      --> Thread khác
        // Code .. upload fb: 0.5h ---> Thread
        // Code tiep theo

        /**
         Tạo Thread thông qua Runnale
        Runnable runnable1 = new PrintNumber(100);
        Runnable runnable2 = new PrintChar(50, 'a');
        Runnable runnable3 = new PrintChar(50, 'b');
        Thread t1 = new Thread(runnable1);
        Thread t2 = new Thread(runnable2);
        Thread t3 = new Thread(runnable3);

        t1.start();
        t2.start();
        t3.start();
         **/

        /**
        Thread t1 = new ThreadPrintNumber(100);
        Thread t2 = new ThreadPrintChar(50, 'a');
        Thread t3 = new ThreadPrintChar(50, 'b');

        t1.start();
        t2.start();
        t3.start();


         new Thread(){
        @Override
        public void run() {
        for (int i = 0; i < 100; i++) {
        System.out.println("i " + i);
        }
        }
        }.start();

         Thread a1 = new Thread(){
        @Override
        public void run() {
        for (int i = 0; i < 100; i++) {
        System.out.println("i " + i);
        }
        }
        };
         a1.start();

         new Thread(){
        @Override
        public void run() {
        for (int i = 0; i < 50; i++) {
        System.out.println('a');
        }
        }
        }.start();

         new Thread(){
        @Override
        public void run() {
        for (int i = 0; i < 50; i++) {
        System.out.println('b');
        }
        }
        }.start();
        **/



        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("i " + i);
                }
            }
        });
    }
}
