package Baitapbuoi1;

public class Bai7 {
    public static int dequy(int n){
        if(n == 1){
            return 2;
        }
        return 2 * n + dequy(n - 1);
    }
    public static void main(String[] args) {
        System.out.println("" + Bai7.dequy(4));
    }

}
