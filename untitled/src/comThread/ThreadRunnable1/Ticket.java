package comThread.ThreadRunnable1;

import sun.misc.Lock;

public class Ticket implements Runnable{

    private int ticket = 100;
//    Object obj=new Object();
//    Lock lock=new Lock();
    @Override
    public void run() {
        while (true){
            synchronized (this){
                if (ticket > 0){
                    try {
//                        lock.lock();
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+"正在卖票："+ticket--);
                }
//                lock.unlock();
            }

        }
    }
}
