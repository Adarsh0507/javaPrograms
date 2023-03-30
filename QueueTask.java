import java.util.*;

public class QueueTask {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

       Queue<Integer> q = new LinkedList<>();
        
        System.out.print("Enter the numbers of element you want to add : ");
        int n = sc.nextInt();

        for(int i = 1 ; i <= n ; i++)
            q.add(i);
        
        System.out.print("Enter the number of element want to reverse : ");
        int ele = sc.nextInt();

        Stack<Integer> s = new Stack<>();

        for(int i = 0 ; i < ele ; i++)
            s.push(q.poll());

        Queue<Integer> ans = new LinkedList<>();
        
        for(int i = 0 ; i < ele ; i++)
            ans.add(s.pop());

        while(!q.isEmpty()){
            ans.add(q.poll());
        }

        
        System.out.println(ans);
        
    }
    
}
