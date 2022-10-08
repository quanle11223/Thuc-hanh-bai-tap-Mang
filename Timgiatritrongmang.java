import java.util.Scanner;

public class Timgiatritrongmang {

    public static void main(String[] args) {
        String[]namestudents = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory"};
        System.out.println("Nhập tên cần kiểm tra: ");
        Scanner scanner = new Scanner(System.in);
        String inputname = scanner.nextLine();
        boolean isExist = false;
        for (int i = 0 ; i < namestudents.length ; i++) {
            if (namestudents[i].equals(inputname)) {
                System.out.println("Trùng khớp giữa: " + inputname + " và " + i );
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("Không khớp");
        }
    }
}
