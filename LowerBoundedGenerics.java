import java.util.ArrayList;
public class LowerBoundedGenerics {

    public void print(ArrayList<? super Integer> arr)
        {
        for(Object i : arr)
            System.out.println(i);
        }
    public static void main(String args[]){
        LowerBoundedGenerics lb = new LowerBoundedGenerics();

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(100);
        arr.add(200);
        lb.print(arr);
        ArrayList<Number> num = new ArrayList<>();
        num.add(23.343);
        num.add(3232.32232);
        lb.print(num);
    }
}
