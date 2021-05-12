package CP;
import java.util.*;

public class april_cookoff_chocolateMonger_secondQues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int[] a = new int[n];
            for(int i=0 ; i<n ; i++){
                a[i] = sc.nextInt();
            }
            Set<Integer> set = new HashSet<Integer>();
            for(int i=0 ; i<n ; i++){
                set.add(a[i]);
            }
            int y =set.size();

            int z = n-x;
            if(y<=z){
                System.out.println(y);
            }
            else{
                System.out.println(z);
            }
        }
    }
}
