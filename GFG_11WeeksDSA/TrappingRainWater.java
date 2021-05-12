package GFG_11WeeksDSA;
import java.lang.*;
import java.util.*;

public class TrappingRainWater {
    public static int waterMax(int[] a, int n){
        int ans = 0;// finding the left-most max element before the ith indexed element
        for(int i=1 ; i<n-1 ; i++){ // we are ignoring first and last indices
            int left = a[i];
            for(int j=0 ; j<=i ; j++){
                left = Math.max(left, a[j]);
            }

            int right = a[i];
            for(int j=i ; j<n ; j++){ // finding the right-most element after the ith indexed element
                right = Math.max(right, a[j]);
            }
            ans += Math.min(left, right) - a[i];  // formula : min(left-most_max, right-most_max) - array[i]
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements in the array:");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter elements:");
        for(int i=0 ; i<n ; i++){
            a[i]= sc.nextInt();
        }
        System.out.println("The amount of water contained by the pillars is : "+waterMax(a, n));
    }
}
