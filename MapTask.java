import java.util.*;

public class MapTask {
    public static void main(String args[]){

        ArrayList<String> arr = new ArrayList<>();
        arr.add("Adarsh");
        arr.add("Singh");
        arr.add("Parihar");
        arr.add("Adarsh");
        arr.add("Singh");
        arr.add("Adarsh");

        Map<Object,Integer> map = new TreeMap<>();

        for(Object i : arr){
            if(!map.containsKey(i)){
                map.put(i , 1);
                continue;
            }
            int temp = map.get(i);
            temp++;
            map.put(i,temp);
        }

        System.out.println(map);
    }    
}
