import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chiều dài:");
        int dai = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập chiều rộng:");
        int rong = Integer.parseInt(sc.nextLine());
        int chuvi=dai*rong*2;
        int dientich=dai*rong;
        System.out.printf("Chu vi: %d \n Dien tich: %d", chuvi,dientich);
    }
}
