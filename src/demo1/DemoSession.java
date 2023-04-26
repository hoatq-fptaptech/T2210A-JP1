package demo1;

import java.util.Scanner;

public class DemoSession {
    public static void main(String args[]){
        int x = 10;
        x++;// 11
        if(x>10){
            // A
        }else if(x > 5){
            // B
        }else if(x > 15){
            // C
        }else{
            // D
        }
        switch (x){
            case 1: break; //A ;
            case 5: break; //B ;
            case 10: break; //C ;
            case 15: break; //D ;
            default: break; // E
        }
        int y=0;
        while (y>0){
            // A
            x++;
        }
        do{
            x++;
        }while(y>0);

        for(int i=0;i<10;i++){

        }

        int arr[] = new int[5];// mảng 5 số nguyên
        arr[0] = 10;
        arr[1] = 2;
        arr[2] = 21;
        arr[3] = 11;
        arr[4] = 56;

        for(int i=0;i<arr.length;i++){
            // arr[i]
        }
        // foreach
        for(int a: arr){
            System.out.println(a);
        }

        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap 1 số từ bàn phím:");
        n = sc.nextInt();
        System.out.println("So vua nhap:"+n);
        // Kiểm tra n có phải số nguyên tố hay không?

        // đã đếm xong số ước
        if(checkSNT(n)){
            System.out.println(n+" la so nguyen to");
        }else{
            System.out.println(n+" khong phai nguyen to");
        }
        // Nhập 1 mảng n số nguyên, tìm các số nguyên tố trong mảng
        int arrSNT[] = new int[n];
        for(int i=0;i<arrSNT.length;i++){
            arrSNT[i] = sc.nextInt();
        }

        for(int a: arrSNT){
            if(checkSNT(a)){
                System.out.println("SNT: "+a);
            }
        }
    }

    public static boolean checkSNT(int a){
        if(a < 2) return false;
        if(a < 4) return true;
        for(int i=2;i<=a/2;i++){
            if(a%i==0){
                return false;
            }
        }
        return true;
    }
// Bài tập
//    Viết các chương trình thực hiện các công việc sau:
//    1. Nhập 1 số nguyên n, kiểm tra nó có phải số hoàn hảo hay không.
//    2. Nhập 1 số nguyên n, tìm số có vị trí thứ n của dãy Fibonaci.
//    3. Nhập 2 số nguyên, tìm ước chung lớn nhất và bội chung nhỏ nhất của 2 số đó.
}
