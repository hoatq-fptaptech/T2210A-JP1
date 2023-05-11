package demo5;

public class Main {
    public static void main(String[] args){
      //  IMale ii = new IMale();
        IMale im = new IMale() { // Anonymous class
            @Override
            public void drink() {
                System.out.println("Drink Vodka");
            }
        };
        // up casting - down casting

        // lambda expression
        IMale im2 = ()->{
            System.out.println("Drink Beer");
        };

    }
}
