package Sep24.ex_1309;
import java.util.Scanner;
    /*
    * Prepare a small calculator, which supports +, - , , / and %(?) - Modulus operator
    double a = 34;
    double b = 10;
    Print - a+b, a-b, ab, a/b, a%b all the outputs.
    * */

public class Lab011 {
    public static void main(String[] args) {
        System.out.println("Program start");
        System.out.println();

        Scanner sc = new Scanner(System.in);

        System.out.println("This gives you all mathematical operation of tow number.");

        System.out.println("Enter the first number:");
        double num1 =sc.nextDouble();

        System.out.println("Enter the second number:");
        double num2 =sc.nextDouble();

//        char div = '\u00F7';
        System.out.println();

        System.out.println("The addition of two number is:");
        System.out.printf("%.2f + %.2f = %.2f", num1, num2, num1+num2);
        System.out.println();
        System.out.println();

        System.out.println("The subtraction of two number is:");
        System.out.printf("%.2f - %.2f = %.2f", num1, num2, num1-num2);
        System.out.println();
        System.out.println();

        System.out.println("The multiplication of two number is:");
        System.out.printf("%.2f x %.2f = %.2f", num1, num2, num1*num2);
        System.out.println();
        System.out.println();

        System.out.println("The division of two number is:");
        System.out.printf("%.2f \u00F7 %.2f = %.2f ", num1, num2, num1/num2);
        System.out.println();
        System.out.println();

        System.out.println("The modulus of two number is:");
        System.out.printf("%.2f mod of %.2f = %.2f", num1, num2, num1%num2);
        System.out.println();
        System.out.println();

        System.out.println("Program end");

    }


}
