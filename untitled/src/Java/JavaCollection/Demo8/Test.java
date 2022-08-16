package Java.JavaCollection.Demo8;

import java.util.LinkedList;

/*5.写个测试类：在此类中创建一个LinkedList对象，
(1).用addFirst方法，指定添加1-10之间的10个数字
  (2).获取集合的大小;
  (3).指定移除集合的第1个元素；
  (4).指定移除集合的最后1个元素;
  (5).指定获取第1个元素，获取最后1个元素;*/
public class Test {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<Integer>();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.addFirst(5);
        list.addFirst(6);
        list.addFirst(7);
        list.addFirst(8);
        list.addFirst(9);
        list.addFirst(10);
        System.out.println(list);

        System.out.println(list.size());

        list.removeFirst();
        list.removeLast();
        System.out.println(list);

        System.out.println("第1个元素:"+list.getFirst()+",最后1个元素:"+list.getLast());
    }
}
