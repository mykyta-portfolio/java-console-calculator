import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;

        while(!exit){
            System.out.println("\n=== Console Calculator ===");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Cube volume");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();
            double a, b;

            switch(choice){
                case 1:
                    System.out.print("Enter first number: ");
                    a = sc.nextDouble();
                    System.out.print("Enter second number: ");
                    b = sc.nextDouble();
                    System.out.println("Sum: " + (a + b));
                    break;
                case 2:
                    System.out.print("Enter first number: ");
                    a = sc.nextDouble();
                    System.out.print("Enter second number: ");
                    b = sc.nextDouble();
                    System.out.println("Difference: " + (a - b));
                    break;
                case 3:
                    System.out.print("Enter first number: ");
                    a = sc.nextDouble();
                    System.out.print("Enter second number: ");
                    b = sc.nextDouble();
                    System.out.println("Product: " + (a * b));
                    break;
                case 4:
                    System.out.print("Enter numerator: ");
                    a = sc.nextDouble();
                    System.out.print("Enter denominator: ");
                    b = sc.nextDouble();
                    if(b == 0){
                        System.out.println("Error: division by zero");
                    } else {
                        System.out.println("Division: " + (a / b));
                    }
                    break;
                case 5:
                    System.out.print("Enter cube side length: ");
                    a = sc.nextDouble();
                    System.out.println("Cube volume: " + (a * a * a));
                    break;
                case 0:
                    exit = true;
                    System.out.println("Exiting calculator...");
                    break;
                default:
                    System.out.println("Invalid choice, try again.");
            }
        }

        sc.close();
    }
}
