package Baitapbuoi1;

public class Bai1 {
        public static int dequy(int n){
            if (n == 1){
                return 1;
            }
            return n + dequy(n - 1);
        }
        public static void main(String[] args) {
            System.out.println("tong la: " + Bai1.dequy(5));
        }
    }