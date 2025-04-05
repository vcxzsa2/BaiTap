package Baitapbuoi1;

public class Bai8 {
    public static int dequy(int n){
        if(n == 1){
            return 1;
        }
        return 2 * n - 1 + dequy(n - 1);
    }
    public static void main(String[] args) {
        System.out.println("" + Bai8.dequy(4));
    }

}
