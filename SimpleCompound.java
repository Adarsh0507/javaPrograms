import java.util.*;
import java.lang.*;
public class SimpleCompound {

    double SimpleInterest(double prin , double rate , double time){
        
        return (prin*rate*time)/100;
    }

    double CompoundInterest(double prin , double rate , double time ){
        double mul = 1-(rate/100);
        double temp = 1;
        
        for(int i = 0 ; i <time ; i++)
            temp = temp * mul;

        return prin * temp;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 0  for S.I. and 1 for C.I. : ");
        int in = sc.nextInt();
        
        System.out.print("Enter P : ");
        double prin = sc.nextDouble();

        System.out.print("Enter r :");
        double rate = sc.nextDouble();

        System.out.print("Enter t :");
        double time = sc.nextDouble();

        SimpleCompound s = new SimpleCompound();
        
        if(in == 0){
            System.out.println("Simple Interest is : "+s.SimpleInterest(prin , rate , time));
        }
        else if(in == 1){
            System.out.println("Compound Interest is : " + s.CompoundInterest(prin , rate , time));
        }
        else{
            System.out.println("Run again...");
        }


    }
    
}
