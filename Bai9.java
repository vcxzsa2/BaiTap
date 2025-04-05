package Baitapbuoi1;
import java.util.Scanner;
public class Bai9 {
    public static int dequy(int n){
        if(n == 1){
            return 1;
        }
        return (int) Math.pow(n, 3) + dequy(n - 1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = scanner.nextInt();
        System.out.println("" + Bai9.dequy(n));
    }

}
