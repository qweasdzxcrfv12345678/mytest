package comThread.threadRunnable;

public class ThreadTest {
    public static void main(String[] args) {
//        Thread thread=new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i <= 5; i++) {
//                    System.out.println(Thread.currentThread().getName());
//                }
//            }
//        });
//        thread.start();

        Thread thread= new Thread(()-> System.out.println(Thread.currentThread().getName()));thread.start();

    }
}
