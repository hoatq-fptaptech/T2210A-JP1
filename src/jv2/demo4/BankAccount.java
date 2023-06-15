package jv2.demo4;

public class BankAccount {
    public int balance = 0;

    public synchronized void deposit(int amount){
        if(amount <=0) return;
        balance+= amount;
        System.out.println("Vừa nạp số tiền "+amount);
        notify();
    }

    public synchronized void withdraw(int amount){
        if(amount <=0) return;
        while (amount > balance){
            System.out.println("Số tiền cần rút vượt quá số tiền hiện có!");
            try{
//                Thread.sleep(1000);
                wait();
            }catch (Exception e){}
        }
        balance -= amount;
        System.out.println("Vừa rút số tiền "+amount);
    }
}
