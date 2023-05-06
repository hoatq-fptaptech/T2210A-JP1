package demo3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Student s = new Student(1,"Nam",18);
        s.learn();
        FPTStudent f = new FPTStudent(2,"Minh",19,"0987612345");
        f.learn();
        f.playFootball();
        ArrayList arrList =  new ArrayList();
        arrList.add(100);
        arrList.add("hello");
        arrList.remove("hello");
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("world");
       // stringArrayList.remove(0);// vị trí cần xóa
        ArrayList<Student> studentArrayList = new ArrayList<>();
        System.out.println(stringArrayList.get(0));// arr[0]
        for(String st: stringArrayList){
            //st <=> stringArrayList.get(i)
        }
    }
}
