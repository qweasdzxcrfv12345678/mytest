package Java.JavaHashMap.Test1;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        HashMap<String,String> hashMap=new HashMap<>();
        hashMap.put("长沙","0731");
        hashMap.put("北京","010");
        hashMap.put("常德","0736");

        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入城市名：");
        String string=scanner.next();
        System.out.println("区号:"+hashMap.get(string));

        Set<String> set=hashMap.keySet();
        for (String key:set){
            System.out.println(key+"--"+hashMap.get(key));
        }

        Collection<String> values = hashMap.values();
        for (String value : values) {
            System.out.println(value);
        }

        Set<Map.Entry<String, String>> entries = hashMap.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

    }
}
