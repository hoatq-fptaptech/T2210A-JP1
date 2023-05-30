package jv2.demo2;

public class Main {
    public static void main(String[] args){
        Order<Integer> orderI = new Order<>();
        orderI.setCode(6);

        Order<String> orderS = new Order<>();
        orderS.setCode("XYZABC");

        orderS.sayHello("Xin chao");
        orderS.sayHello(3.15);
    }
}
