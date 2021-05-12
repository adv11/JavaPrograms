package CP;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.lang.*;

import static java.lang.Math.pow;

public class Akash {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(bf.readLine());
            int sum = (n/2)+1;
            System.out.println((((int)Math.pow(10,9)+7) % sum)+1);
        }
    }
}