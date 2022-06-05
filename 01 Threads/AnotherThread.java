class AnotherThread extends Thread {
    @Override
    public void run() {
        // TODO Auto-generated method stub
        super.run();
        for (int i = 10; i >= 0; i--) {
            System.out.println("Another : " + i);
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println(e);
            }
            ;
        }
    }
}
