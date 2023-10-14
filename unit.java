import java.util.Scanner;

public class unit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an option:");
            System.out.println("Enter 1. for Kilograms to Pounds");
            System.out.println("enter 2. Grams to Kilograms");
            System.out.println("enter 3. Kilometers to Miles");
            System.out.println("enter 4. Millimeters to Inches");
            System.out.println("enter 0. to Terminate the program");
            System.out.print("Please enter your choice here : ");

            int choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("You are now leaving the program. Have a good day :).");
                break;
            }
            
            if (choice < 1 || choice > 4) {
                System.out.println("Not possible.");
            }

            double result = 0.0;

            switch (choice) {
                case 1:
                    System.out.print("Please Enter the weight in kilograms: ");
                    double kg = scanner.nextDouble();
                    result = kgToLb(kg);
                    System.out.println("Weight in pounds: " + result);
                    break;
                case 2:
                    System.out.print("Please Enter the weight in grams: ");
                    double grams = scanner.nextDouble();
                    result = gramsToKg(grams);
                    System.out.println("Weight in kilograms: " + result);
                    break;
                case 3:
                    System.out.print("Please Enter the distance in kilometers: ");
                    double km = scanner.nextDouble();
                    result = kmToMiles(km);
                    System.out.println("Distance in miles: " + result);
                    break;
                case 4:
                    System.out.print("Please Enter the length in millimeters: ");
                    double mm = scanner.nextDouble();
                    result = mmToInches(mm);
                    System.out.println("Length in inches: " + result);
                    break;
                default:
                    System.out.println("Invalid try another .");
            }
        }
    }

    public static double kgToLb(double kg) {
        return kg * 2.20462;
    }

    public static double gramsToKg(double grams) {
        return grams * 0.001;
    }

    public static double kmToMiles(double km) {
        return km * 0.621371;
    }

    public static double mmToInches(double mm) {
        return mm * 0.0393701;
    }
}
