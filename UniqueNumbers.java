import java.util.*;
public class UniqueNumbers {
    public static void main(String args[]){
        //ArrayList with Duplicates 
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(1);
        arr.add(2);
        arr.add(1);
        arr.add(2);
        
        //Set to store only Unique Values
        Set<Integer> s = new HashSet<>(arr);
        
        arr.clear();

        //Store all the unique values on ArrayList
        arr.addAll(s);
    
        System.out.println(arr);

    }
    
}
