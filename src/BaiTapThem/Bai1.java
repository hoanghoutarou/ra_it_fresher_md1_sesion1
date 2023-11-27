package BaiTapThem;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguyen ");
        int x = Integer.parseInt(sc.nextLine());
        int ketqua = x*x;
        System.out.println("Binh phuong: "+ketqua);
    }
}
