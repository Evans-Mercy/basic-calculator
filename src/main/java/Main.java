import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        String input = myScanner.nextLine();

        double firstNumber = Double.parseDouble(input);
        System.out.println("Enter the second number:");

        double secondNumber = Double.parseDouble(myScanner.nextLine());

        System.out.println("Possible calculations:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");

        //exercise1
        String option = myScanner.nextLine();
        if(option.equals("3")) {
            double multiplication = firstNumber * secondNumber;
            System.out.println("The multiplication is: " + multiplication);
        }
        else {
            System.out.println("Invalid option. You can only select 3");
        }
    }
}
/*
        String option = myScanner.nextLine();
        //noinspection IfCanBeSwitch
        if(option.equals("1")){
            //sum
            double sum = firstNumber + secondNumber;
            System.out.println("The sum is: " + sum);
        }
        else  if(option.equals("2")){
            //subtract
            double subtraction = firstNumber - secondNumber;
            System.out.println("The subtraction is: " + subtraction);
        }
        else if(option.equals("3")){
            //multiplication
            double multiplication = firstNumber * secondNumber;
            System.out.println("The multiplication is: " + multiplication);
        }
        else if(option.equals("4")){
            //division
            double division = firstNumber / secondNumber;
            System.out.println("The division is: " + division);
        }
        else{
            System.out.println("Invalid option");
        }
*/

