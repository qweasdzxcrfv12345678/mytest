package comThread.RunnableTest;

public class Test {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        MyRunnable my=new MyRunnable();
        my.run();


    }
}
