package Basics;
import java.util.Scanner;

class Multiply{

    public int algo(int a, int b){
        int c = a*b;
        return c;
    }
}

public class ObjPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        Multiply mul = new Multiply();
        int r = mul.algo(a,b);
        System.out.println(r);




    }
}
