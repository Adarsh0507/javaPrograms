import java.util.Scanner;
public class Average {

    //Average between three Numbers 
    public float avg(int i , int j  , int k ){
        return (i+j+k)/3;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three numbers : ");

        int i = sc.nextInt();
        int j = sc.nextInt();
        int k = sc.nextInt();

        Average av = new Average();
        System.out.println("Average of these three numbers are : " + av.avg(i,j,k));
    }
    
}
