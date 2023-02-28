import java.util.Scanner;
public class HighestOf3 {

    int Highest(int first , int second , int third){
        if(first > second && first > third)
            return first;

        else if(second>first && second > third)
            return second;

        return third;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st number :");
        int first = sc.nextInt();

        System.out.print("Enter 2nd number :");
        int second = sc.nextInt();

        System.out.print("Enter 3rd number :");
        int third = sc.nextInt();

        HighestOf3 h = new HighestOf3();

        System.out.println("Gretest between 3 is : " + h.Highest(first , second , third));
    }
    
}
