package demo3;

public class Main {
    public static void main(String[] args){
        Student s = new Student(1,"Nam",18);
        s.learn();
        FPTStudent f = new FPTStudent(2,"Minh",19,"0987612345");
        f.learn();
        f.playFootball();

    }
}
