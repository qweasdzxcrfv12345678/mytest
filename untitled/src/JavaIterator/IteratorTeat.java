package JavaIterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTeat {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("wang");
        list.add("wei");
        list.add("deng");
        list.add("xiao");

        // 获取迭代器
        Iterator<String> iterator=list.iterator();
        // 输出集合中的第一个元素
        System.out.println(iterator.next()); //  wang



    }
}
