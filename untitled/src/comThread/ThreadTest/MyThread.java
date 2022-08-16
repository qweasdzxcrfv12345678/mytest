package comThread.ThreadTest;

public class MyThread extends Thread{
    public MyThread(String name){
        super(name);
    }

    //Generate... => Override Methods... => run():void
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
//        super.run();
        for (int i = 0; i <= 10; i++) {
            System.out.println("小强"+i);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
