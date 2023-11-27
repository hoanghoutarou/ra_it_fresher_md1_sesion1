package BaiTapThem;

import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào năm sinh: ");
        int year = scanner.nextInt();
        int age = 2023 - year;
        System.out.println("Số tuổi của bạn: "+age);
        String a = (age%2==0)?"Là số chẵn":"Là số lẻ";
        System.out.println(a);
    }
}
