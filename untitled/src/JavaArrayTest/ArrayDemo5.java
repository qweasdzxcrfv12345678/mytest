package JavaArrayTest;

import java.util.Arrays;

/*5.	假设有一个长度为5的数组 int [] array = new int[]{1,3,-1,5,-2}现创建一
		个新数组newArray[]，要求新数组中元素的存放顺序与原数组的元素逆序，并且如果原数组
		的元素值小于0，在新数组中按0存储。编程输出新数组数据*/
public class ArrayDemo5 {
    public static void main(String[] args) {
        int[] array = new int[]{1,3,-1,5,-2};
        for (int i= 0;i<array.length / 2;i++){
            int temp = array[i];
            array[i] = array[array.length - 1-i];
            array[array.length - i - 1] = temp;
        }
        int[] newArray = new int[array.length];
        for (int i = 0;i < newArray.length;i++){
            newArray[i] = array[i];
            if (newArray[i]<0){
                newArray[i]=0;
            }
        }
        System.out.println(Arrays.toString(newArray));
    }
}
