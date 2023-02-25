import java.util.Scanner;

public class Addition {
    int i;
    int j;

    Addition(int i , int j){
        this.i = i;
        this.j = j;
    }

    //Addition of two Numbers  
    int add(){
        return i+j;
    }
    //Substraction 
    int sub(){
        if(i>j) return i-j;
        return j-i;
    }
    //Multiplication 
    int mul(){
        return i*j;
    }

    //Division
    float div(){
        if(i>j) return i/j;
        return j/i;
    }

    public static void main(String args[]){
       
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st number : ");
        int i = sc.nextInt();

        System.out.print("Enter 2nd number : ");
        int j = sc.nextInt();


        Addition aa = new Addition(i , j);

        

        System.out.println("Addition of these two numbers are : " + aa.add());

        System.out.println("Substraction of these two numbers are : " + aa.sub());

        System.out.println("Multiplication of these two numbers are : " + aa.mul());

        System.out.println("Division of these two numbers are : " + aa.div());
    }
    
}
