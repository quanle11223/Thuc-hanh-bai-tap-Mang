import java.util.Scanner;

public class Demsoluongsinhvienthido {
    public static void main(String[] args) {
        int size;
        int[]array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhap so luong sinh vien (khong qua 30 nguoi): ");
            size = scanner.nextInt();
            if (size > 30)
                System.out.println("Qua gioi han can kiem tra");
        }while (size > 30);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.println("Nhap ten sinh vien: " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
        int count = 0;
        System.out.print("List of mark: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
            if (array[j] >= 5 && array[j] <= 10)
                count++;
        }
        System.out.print("\n The number of students passing the exam is " + count);


    }
}
