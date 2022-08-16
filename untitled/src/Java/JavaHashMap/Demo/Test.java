package Java.JavaHashMap.Demo;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        ArrayList<Student> t20=new ArrayList<>();
        ArrayList<Student> t21=new ArrayList<>();
        ArrayList<Student> t22=new ArrayList<>();
        Collections.addAll(t20,new Student("小明",19,89),new Student("张三",18,88));
        Collections.addAll(t21,new Student("小敏",19,89),new Student("张四",18,88));
        Collections.addAll(t22,new Student("小光",19,89),new Student("张五",18,88));

        HashMap<Teacher,ArrayList> hashMap=new HashMap<>();
       hashMap.put (new Teacher("松哥",18),t20);
       hashMap.put (new Teacher("龙哥",28),t21);
       hashMap.put (new Teacher("敏哥",38),t22);

        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入教员姓名：");
        String name=scanner.next();

        Set<Teacher> teachers=hashMap.keySet();
        for (Teacher teacher:teachers){
            if (teacher.getName().equals(name)){
                ArrayList<Student> list = hashMap.get(teacher);
                Collections.sort(list, new Comparator<Student>() {
                    @Override
                    public int compare(Student o1, Student o2) {
                        return(int) (o1.getScore() - o2.getScore());
                    }
                });
                System.out.println(list);
            }
        }
    }
}
