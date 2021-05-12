package GFG_11WeeksDSA;
import java.util.*;
import java.lang.*;

public class RotateTheArrayBy_d {
    public static void rotateArray(int[] a, int n, int d){
        int[] temp = new int[d];
        for(int i=0 ; i<d ; i++){   // coping the first d elements in the temporary array named as temp.
            temp[i] = a[i];
        }

        for(int i=0 ; i<n-d ; i++){ // shifting left the primary array named a[] by d.
            a[i] = a[i+d];
        }

        for(int i=(n-d), j=0 ; i<n ; i++,j++){
            a[i] = temp[j];
        }

        System.out.println("After rotation of array by "+d);
        for(int i=0 ; i<n ; i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n:");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter n elements of the array:");
        for(int i=0 ; i<n ; i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Enter value of d:");
        int d = sc.nextInt();
        rotateArray(a, n, d);
    }
}
