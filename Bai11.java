package Baitapbuoi1;
import java.util.Scanner;
public class Bai11 {
    public static int dequy(int x, int y){
        if(y == 0){
            return 1;
        }
        if(x < 0 || y < 0){
            System.out.println("Vui long nhap so duong");
            return 0;
        }
        return x * dequy(x, y - 1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap x: ");
        int x = scanner.nextInt();
        System.out.println("Nhap y: ");
        int y = scanner.nextInt();
        System.out.println("" + Bai11.dequy(x, y));
    }

}
