package JavaArrayTest;

/*2.  百货商场当日消费积分最高的8名顾客，他们的积分分别
是18、25、7、36、13、2、89、63。编程找出最低的积分和它在数组中的原始位置(下标)*/
public class ArrayDemo2 {
    public static void main(String[] args) {
        int[] arr={18,25,7,36,13,2,89,63};
        int min=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[min] > arr[i]){
                min = i;
            }
        }
        System.out.println("最低的积分:"+arr[min]+",它在数组中的原始位置(下标):"+min);
    }
}

