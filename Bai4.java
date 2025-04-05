package Baitapbuoi1;

public class Bai4 {
    public static double dequy(int n){
        if (n == 1){
            return 1;
        }
        return 1.0 / n + dequy(n - 1);
    }
    public static void main(String[] args) {
        System.out.printf("tong la: %.3f", Bai4.dequy(8));
    }

}
