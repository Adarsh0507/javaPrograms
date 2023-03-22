import java.util.Scanner;

public class AllOperation {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Addition ,Substraction , Multiplication , Division , Remainder of 2 Numbers");
        System.out.print("Enter first Number : ");
        int a = sc.nextInt();
        System.out.print("Enter Second Number : ");
        int b = sc.nextInt();

        System.out.println("Addition of given numbers are : " + (a+b));
        System.out.println("Substraction of given numbers are : " + (a-b));
        System.out.println("Division of given numbers are : " + (a/b));
        System.out.println("Multiplication of given numbers are : " + (a*b));
        System.out.println("Remainder of given numbers are : " + (a%b));
    }
    
}
