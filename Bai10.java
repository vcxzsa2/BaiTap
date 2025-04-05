package Baitapbuoi1;
import java.util.Scanner;
public class Bai10 {
    public static int dequy(int n){
        if(n == 1){
            return 1;
        }
        if(n < 0){
            System.out.println("Vui long nhap so duong");
            return 0;
        } else {
            System.out.println("");
        }
        return n * dequy(n - 1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = scanner.nextInt();
        System.out.println("" + Bai10.dequy(n));
    }

}
