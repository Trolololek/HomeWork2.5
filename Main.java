import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введите вес груза (в кг): ");
            double cargoWeight = scanner.nextDouble();

            double fuelWeight = cargoWeight * 100;
            System.out.println("Необходимый вес топлива (в кг): " + fuelWeight);
        }
    }