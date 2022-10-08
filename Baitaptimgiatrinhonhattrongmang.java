import java.util.Scanner;

public class Baitaptimgiatrinhonhattrongmang {
    public static void main(String[] args) {
        int size;
        int[]array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhap chieu dai cua mang: ");
            size = scanner.nextInt();
            if (size > 10)
                System.out.println("Do dai gioi han la 10.");
        } while (size > 10);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.println("Nhap phan tu" + (i +  1) + " : ");
            array[i] = scanner.nextInt();
            i++;
        }
        int min = array[0];
        int index = 1;
        for (int j = 1 ; j < array.length ; j++) {
            if (array[j] < min ) {
                min = array[j];
                index = j + 1;
            }
        }
        System.out.println("Gia tri nho nhat cua mang da nhap la :" + min + " tai vi tri so: " + index);

    }
}
