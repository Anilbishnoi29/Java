public class MyThread extends Thread implements Runnable {
    @Override
    public void run() {
        // TODO Auto-generated method stub
        super.run();
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
            ;
        }
    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread t1 = new Thread(myThread);
        AnotherThread t2 = new AnotherThread();
        t1.start();
        t2.start();
    }
}