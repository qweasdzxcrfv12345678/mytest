package comThread.ThreadTest;

public class Test {
    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName());//main
        MyThread my=new MyThread("线程1");
        my.start();
        MyThread my1=new MyThread("线程2");
//        my.start();
        my1.start();

        //my.run(); //main
    }
}
