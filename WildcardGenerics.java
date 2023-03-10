import java.util.ArrayList;
public class WildcardGenerics {
    public void print(ArrayList<?> arr){
        for(Object i : arr)
            System.out.println(i);
    }

    public static void main(String args[]){
        WildcardGenerics wc = new WildcardGenerics();
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);

        wc.print(arr);

        ArrayList<String> ada = new ArrayList<>();
        ada.add("Adarsh");
        ada.add("Singh");
        ada.add("Parihar");

        wc.print(ada);
    }
}
