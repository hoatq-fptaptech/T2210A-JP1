package demo3;

public class FPTStudent extends Student{
    String telephone;

    public FPTStudent(int id, String name, int age, String telephone) {
        super(id, name, age);
        this.telephone = telephone;
    }

    public void playFootball(){
        System.out.println("Play Football");
        super.learn();// super - doi tuong ngam dinh cua lop cha trong lop con
        this.learn();
    }

    @Override
    public void learn(){
        System.out.println("FPT student learning...");
    }
}
