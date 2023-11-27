import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rate =23000;
        System.out.println("Nhâp giá trị USD:");
        int usd = Integer.parseInt(sc.nextLine());
        int vnd = usd*rate;
        System.out.println("Giá trị VND = "+vnd);
    }
}
