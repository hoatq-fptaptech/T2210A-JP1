package demo2;

public class Main {
    public static void main(String args[]){
        int x = 10;
        Customer c = new Customer();
        Customer k = new Customer();
        c.setId(100);
        k.setId(90);
        System.out.println(c.getId());
        c.buyCart();
        k.buyCart();
        c.sayHello("HaNoi");
        k.sayHello("SaiGon");
        c.printInfo();
        k.printInfo();

        PhanSo p = new PhanSo();
        PhanSo p1 = new PhanSo(5,7);

        p.inPhanSo("hello");
        p.inPhanSo();
    }
}
