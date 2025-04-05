package Baitapbuoi1;

public class Bai2 {
        public static int dequy(int n){
            if (n == 1){
                return 1;
            }
            return n * n + dequy(n - 1);
        }
        public static void main(String[] args) {
            System.out.println("tong la: " + Bai2.dequy(6));
        }
    }
