import java.util.Scanner;

class NumberComparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number1;
        boolean validInput = false;

        do {
            System.out.print("Enter the first number: ");
            String input1 = scanner.nextLine();

            System.out.print("Enter the second number: ");
            String input2 = scanner.nextLine();

            double number2;
            try {
                number1 = Double.parseDouble(input1);
                number2 = Double.parseDouble(input2);
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter numeric values.");
                continue;
            }

            if (number1 == number2) {
                System.out.println("The numbers are equal.");
            } else if (number1 < number2) {
                System.out.println("The first number is less than the second number.");
            } else {
                System.out.println("The second number is less than the first number.");
            }
        } while (!validInput);
    }
}