package Sep24.ex_1309;
import java.util.Scanner;

/*
    * Write a program to print the table of number which user will give( int num 10)
    output will be like this (by using the printf()
    10 × 1 = 10
    10 × 2 = 20
    10 × 3 = 30….
    10 × 10 = 100.
    *
    * */

public class Lab010 {
    public static void main(String[] args) {
        System.out.println("Enter a number for which you want to print a Table");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.printf("The table for number %d is :", num);
        System.out.println();
        System.out.printf(" %d x %d = %d ", num, 1, num*1);
        System.out.println();
        System.out.printf(" %d x %d = %d ", num, 2, num*2);
        System.out.println();
        System.out.printf(" %d x %d = %d ", num, 3, num*3);
        System.out.println();
        System.out.printf(" %d x %d = %d ", num, 4, num*4);
        System.out.println();
        System.out.printf(" %d x %d = %d", num, 5, num*5);
        System.out.println();
        System.out.printf(" %d x %d = %d", num, 6, num*6);
        System.out.println();
        System.out.printf(" %d x %d = %d", num, 7, num*7);
        System.out.println();
        System.out.printf(" %d x %d = %d", num, 8, num*8);
        System.out.println();
        System.out.printf(" %d x %d = %d", num, 9, num*9);
        System.out.println();
        System.out.printf(" %d x %d = %d", num, 10, num*10);
        System.out.println();
    }

}
