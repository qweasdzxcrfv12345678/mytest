package comThread.Baozi;

public class BaoZiPu extends Thread{
    private BaoZi baoZi;

    public BaoZiPu(String name , BaoZi baoZi) {
        super(name);
        this.baoZi = baoZi;
    }

    @Override
    public void run() {
        int count = 0;
        //造包子
        while (true){
            //同步
            synchronized (baoZi){
                if (baoZi.flag == true ){
                    try {
                        baoZi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //没有包子，做包子
                System.out.println("包子铺开始做包子");
                if (count % 2== 0){
                    baoZi.pi = "冰皮";
                    baoZi.xian = "猪肉馅";
                }else {
                    baoZi.pi = "薄皮";
                    baoZi.xian = "豆沙馅";
                }
                count++;

                baoZi.flag=true;
                System.out.println("包子造好了："+baoZi.pi+baoZi.xian);
                System.out.println("吃货来吃吧");
                //唤醒等待线程（吃货）
                baoZi.notify();
            }
        }
    }
}
