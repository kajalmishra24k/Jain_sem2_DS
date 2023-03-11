import java.util.*;

class calculator {
    public static void main(String a[]) {

         int number1 = 0;
        int  number2 = 0;
         int option = 0;
        int  example= 0;
        while (true) {
            {
                Scanner sc = new Scanner(System.in);
                // Asking the user to enter the choice
                System.out.println("Input your choice from the following menu:");
                System.out.println("1.Addition 2.Subtraction 3.Multiplication 4.Division 5.Exit");
                option = sc.nextInt();
                // If the option is less than 5 we are performing operations
                if (option != 5) {
                    System.out.println("Input the first number");
                    number1 = sc.nextInt();
                    System.out.println("Input the second number");
                    number2 = sc.nextInt();
                }
                switch (option) {
                    case 1:
                        // Here we are adding two numbers
                        System.out.println("Addition of " + number1 + " and " + number2 + " is " + (number1 + number2));
                        break;
                    case 2:
                        // Here we are subtracting two numbers
                        System.out.println("Subtraction of " + number1 + " and " + number2 + " is " + (number1 - number2));
                        break;
                    case 3:
                        // Here we are multiplying two numbers
                        System.out.println("Addition of " + number1 + " and " + number2 + " is " + (number1 + number2));
                        break;
                    case 4:
                        // Here we are dividing two numbers
                        if (number2 == 0)
                            System.out.println("Error In division the denominator cannot be 0!");
                        else {
                            System.out.println("The division of " + number1 + " by " + number2 + " quotient is " + (number1 / number2) + " and remainder is " + (number1 % number2));
                        }
                        break;
                    case 5:
                    // Here we are breaking out of the loop if the choice is invalid
                    break;
                    default:
                        System.out.println("Invalid choice");
                }
            }
        }
    }
}
