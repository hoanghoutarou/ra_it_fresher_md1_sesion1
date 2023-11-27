package BaiTapThem;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập điểm toán:");
        double toan = sc.nextDouble();
        System.out.println("Nhâp điểm Van:");
        double van = sc.nextDouble();
        System.out.println("Nhap diem tieng Anh");
        double english = sc.nextDouble();
        double total= toan+van+english;
        System.out.printf("Tong diem: %f \n",total);
        double tb = total/3;
        System.out.printf("Diem trung binh: %f",tb);

    }
}
