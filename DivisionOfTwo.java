import java.util.Scanner;

public class DivisionOfTwo {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Division of 2 Numbers ");
        System.out.print("Enter first Number : ");
        float a = sc.nextFloat();
        System.out.print("Enter Second Number : ");
        float b = sc.nextFloat();

        System.out.println("Division of given numbers are : " + (a/b));
    }
    
}
