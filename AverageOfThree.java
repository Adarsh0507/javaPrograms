import java.util.Scanner;

public class AverageOfThree {
        public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Average of three numbers ");
        System.out.print("Enter first Number : ");
        int a = sc.nextInt();
        System.out.print("Enter Second Number : ");
        int b = sc.nextInt();
        System.out.print("Enter Third Number : ");
        int c = sc.nextInt();

        System.out.println("Average of Given three Numbers are : " + ((a+b+c)/3) );
    }
}
