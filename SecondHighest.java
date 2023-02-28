public class SecondHighest {
    public static void main(String args[]){
        //Assuming that evey number in array is positive integer
        int[] arr = {23,43,56,7,13,24,46,88};
        int highest = arr[0];
        int secondHi = 0;

        for(int i :arr){
            if(highest <= i){
                secondHi = highest;
                highest = i;
            }
        }
        System.out.println(secondHi);
    }
    
}
