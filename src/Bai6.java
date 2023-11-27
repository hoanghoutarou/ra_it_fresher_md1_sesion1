import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập một số bất kì: ");
        int x = sc.nextInt();
        String notify;
        notify = (x % 3 == 0 && x % 5 == 0) ? "Số nguyên chia hêết cho 3 và 5" : (x % 3 == 0) ? "Số nguyên chỉ chia hết cho 3" : (x % 5 == 0) ? "Só nguyeen chi chia hết cho 5" : "Sô nguyên không chia hết cho 3 và 5";
        System.out.println(notify);
    }
}
