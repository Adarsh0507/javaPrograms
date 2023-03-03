import java.util.Scanner;
public class OverLoading {
    public int add(int a , int b){
        return a+b;
    }

    public int add(int a , int b , int c){
        return a+b+c;
    }

    public int add(int a , int b ,int c  ,int d){
        return a+b+c+d;
    }
    public static void main(String args[]){

       OverLoading ol = new OverLoading();

       System.out.println(ol.add(1,2));
       System.out.println(ol.add(1,2,3));
       System.out.println(ol.add(1,2,3,4));
    }
}
