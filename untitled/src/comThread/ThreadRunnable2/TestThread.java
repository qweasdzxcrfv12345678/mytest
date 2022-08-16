package comThread.ThreadRunnable2;

public class TestThread {
    public static void main(String[] args) {
        RunnableDemo r1=new RunnableDemo("Thread - 1");
        r1.start();
        r1.run();
        RunnableDemo r2=new RunnableDemo("Thread - 2");
        r2.start();
        r2.run();
    }
}
