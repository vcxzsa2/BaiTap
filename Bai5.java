package Baitapbuoi1;

public class Bai5 {
    public static double dequy(int n){
        if (n == 1){
            return 1;
        }
        return 1.0 / (2 * n) + dequy(n - 1);
    }
    public static void main(String[] args) {
        System.out.printf("tong la: %.2f", Bai5.dequy(8));
    }

}
