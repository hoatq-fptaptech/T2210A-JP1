package jv2.demo1;

import javafx.Student;

import java.util.*;

public class Main {
    public static void main(String[] args){
        HashSet<String> hs = new HashSet<>();
        hs.add("hello");
        hs.add("hello");
        hs.add("world");
        System.out.println("Count: "+hs.size());
        // viết chương trình nhập vào 10 số nguyên khác nhau.
//        HashSet<Integer> inths = new HashSet<>();
//        Scanner sc = new Scanner(System.in);
//        while (inths.size() < 10){
//            System.out.println("Nhap 1 so nguyen:");
//            inths.add(sc.nextInt());
//        }

        PriorityQueue<Integer> ps = new PriorityQueue<>();
        ps.add(4);
        ps.add(8);
        ps.add(1);
        ps.add(5);
        while (ps.size()>0){
            int i=0;
            i = ps.poll();
            System.out.println("queue:"+i);
        }
        PriorityQueue<Student> spt = new PriorityQueue<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("B10",20);
        hm.put("A5",18);
        System.out.println(hm.get("B10"));
        System.out.println(hm.get("A5"));
    }
}
