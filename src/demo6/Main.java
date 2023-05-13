package demo6;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws Exception{
        demoException();
       try {
           int x = 10;
           int y = 2;
           if(y < 5){
               throw new Exception("Không đúng giá trị");
           }
           int z = x / y;
           System.out.println("z = " + z);

       }catch (ArithmeticException e) {
           System.out.println("Ari:"+e.getMessage());
       }catch (Exception e){
           System.out.println("Excep:"+e.getMessage());
       }finally {

       }
        System.out.println("Done");
    }

    public static void demoException() throws Exception
    {
        ///
    }
}
