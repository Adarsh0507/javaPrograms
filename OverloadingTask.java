public class OverloadingTask {

    public void add(int a , int b){
        System.out.println("Addition of provided 2 numbers are : " + (a+b));
    }

    public void add(int a , int b , int c){
        System.out.println("Addition of provided 3 numbers are : " + (a+b+c));
    }
    public void add(String firstName , String SecName){
        System.out.println("Concat 2 String : " + firstName.concat(SecName));
    }
   public static void main(String args[]){
        OverloadingTask ot = new OverloadingTask();
        ot.add(1,2);
        ot.add(1,2,3);
        ot.add("Adarsh" , "Singh");

   }
    
}
