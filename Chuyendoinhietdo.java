import java.util.Scanner;

public class Chuyendoinhietdo {
    public static void main(String[] args) {
        double celsius;
        double fahrenhei;
        int choice = -1;
        Scanner scanner = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu: ");
            System.out.println("1. Fahrenhei to Celsius: ");
            System.out.println("2. Celsius to Fahrenhei: ");
            System.out.println("0. Exit: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Nhập F: ");
                    fahrenhei = scanner.nextDouble();
                    System.out.println("Độ F sang C là: " + fahrenheitToCelsius(fahrenhei));
                    break;
                case 2:
                    System.out.println("Nhập C: ");
                    celsius = scanner.nextDouble();
                    System.out.println("Độ C sang F là: " + celsiusToFahrenheit(celsius));
                    break;
                case 0:
                    System.exit(0);
            }

        }
    }

            public static double celsiusToFahrenheit(double celsius) {
                double fahrenhei = (9.0 / 5) * celsius + 32;
                return fahrenhei;
    }
            public static double fahrenheitToCelsius(double fahrenhei) {
                double celsius = (5.0 / 9) * (fahrenhei - 32);
                return celsius;
            }

}



