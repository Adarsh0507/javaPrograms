import java.util.*;

public class SetTask {
    public static void main(String args[]){

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(1);
        arr.add(2);
        arr.add(2);
        arr.add(3);
        arr.add(3);

        //Passing the ArrayList in set
        Set<Integer> s = new TreeSet<>(arr);

        System.out.println(s);

    }
    
}
