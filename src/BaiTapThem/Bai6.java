package BaiTapThem;

import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số thứ nhất: ");
        int num1 = scanner.nextInt();
        System.out.println("Nhập vào số thứ hai: ");
        int num2 = scanner.nextInt();
        System.out.println("Nhập vào số thứ ba: ");
        int num3 = scanner.nextInt();
        if( num1 >= num2 && num1 >= num3)
            System.out.println(num1+" là số lớn nhất!!");

        else if (num2 >= num1 && num2 >= num3)
            System.out.println(num2+" là số lớn nhất!!");
        else
            System.out.println(num3+" là số lớn nhất!!");
    }
}
