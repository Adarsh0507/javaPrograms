import java.util.Scanner;

public class ProductOfTwo {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Multiplication of 2 Numbers ");
        System.out.print("Enter first Number : ");
        int a = sc.nextInt();
        System.out.print("Enter Second Number : ");
        int b = sc.nextInt();

        System.out.println("Multiplication of 2 given numbers are : " + (a*b));
    }
}
