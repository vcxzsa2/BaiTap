package Baitapbuoi1;

public class Bai6 {
    public static int dequy(int n){
        if(n == 1){
            return -1;
        }
        return (int) Math.pow(-1, n) * n + dequy(n-1);
    }
    public static void main(String[] args) {
        System.out.println("" + Bai6.dequy(5));
    }

}
