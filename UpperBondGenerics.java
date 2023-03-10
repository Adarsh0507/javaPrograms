import java.util.ArrayList;
public class UpperBondGenerics {
    public void print(ArrayList<? extends Number> arr){
        
        for(Number n : arr){
            System.out.println(n);
        }
        System.out.println();
    }


    public static void main(String args[]){
        UpperBondGenerics ub = new UpperBondGenerics();

        ArrayList<Integer> in = new ArrayList<>();
        in.add(33);
        in.add(77);
        in.add(101);
        ub.print(in);


        ArrayList<Double> d = new ArrayList<>();
        d.add(23.23232);
        d.add(34.3434343);
        ub.print(d);
    }
}
