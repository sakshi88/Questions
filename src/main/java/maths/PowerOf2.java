package maths;

import java.util.Scanner;

public class PowerOf2 {

    private static boolean checkIfPowerOf2(int n){
        return n>=0 && (n&n-1)==0;
    }

    private static boolean method2(int n){
        if(n<=0)
            return false;
        while (n>2) {
            int t = n>>1;
            int c = n<<1;
            if(n-c!=0)
                return false;
            n = n>>1;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the number to check-");
        int n = scanner.nextInt();
        System.out.println(checkIfPowerOf2(n));
        System.out.println(method2(n));
    }
}
