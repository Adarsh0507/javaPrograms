import java.util.Scanner;
public class SumOfTwo {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Addition of 2 Numbers ");
        System.out.print("Enter first Number : ");
        int a = sc.nextInt();
        System.out.print("Enter Second Number : ");
        int b = sc.nextInt();

        System.out.println("Sum of two given nummbers are : " + (a+b));
    }
    
}
