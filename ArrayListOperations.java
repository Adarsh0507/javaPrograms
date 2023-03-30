import java.util.*;
public class ArrayListOperations {

    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> arr = new ArrayList<>();



        while(true){
        System.out.println("Enter 1 to add the element \n 2 to remove a element \n 3 to show all the elements present in ArrayList \n 4 to exit ");

        int x = sc.nextInt();
        
        
            if(x == 1) {
                System.out.print("Enter the element you want to add : ");
                int num = sc.nextInt();
                arr.add(num);
                System.out.println("Element added");
                
            }
            else if(x ==2) {
                System.out.println("Enter index of the element you want to delete : ");
                int idx = sc.nextInt();
                
                arr.remove(idx);
                
            }
            else if(x == 3){
                System.out.print("Elements Present in ArrayList are : ");
                
                for(int i : arr){
                    System.out.print(i + " ");
                }
                System.out.println();
                
            }
            else if(x ==4){
                break;
            }
            else System.out.println("Enter correct key");
        }
    }
    
}
