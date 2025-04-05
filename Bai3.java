package Baitapbuoi1;

public class Bai3 {
    public static int dequy(int n){
        if (n == 1){
            return 1;
        }
        if (n % 3 == 0){
            return n + dequy(n-1);
        }
        return dequy(n - 1);
    }
    public static void main(String[] args) {
        System.out.println("tong la: " + Bai3.dequy(12));
    }
}

