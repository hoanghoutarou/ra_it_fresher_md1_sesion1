import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập điểm toán:");
        int toan = Integer.parseInt(sc.nextLine());
        System.out.println("Nhâp điểm Lý:");
        int ly = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập điểm hóa:");
        int hoa = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap diem tieng Anh");
        int english = Integer.parseInt(sc.nextLine());
        int tb = (toan+ly+hoa+english)/4;
        System.out.printf("Diem trung binh: %d",tb);
        if (0<=tb || tb<5){
            System.out.println("Xếp loại yếu");
        }else if (5<=tb || tb<6.5){
            System.out.println("Xếp loại trung bình");
        }else if (6.5<=tb || tb<8){
            System.out.println("Xếp loại kha");
        }else if (8<=tb || tb<9){
            System.out.println("Xếp loại gioi");
        }else if (9<=tb ){
            System.out.println("Xếp loại xuat sac");
        }
    }
}
