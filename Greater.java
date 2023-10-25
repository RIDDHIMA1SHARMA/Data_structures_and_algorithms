import java.util.*;
import java.util.Arrays;
import java.util.Collections;

public class Greater {
    public static boolean isPossible(Integer a[], int b[], int k, int n){
        Arrays.sort(a, Collections.reverseOrder());
        Arrays.sort(b);
        for(int i=0;i<n;i++)
            if(a[i]+b[i]<k)
               return false;
            return true ; 

        }
    
        
        

    
    public static void main(String[]args){
        Integer a[]={1,2,2,1};
        int b[]={3,3,3,4};
        int k=10;
        int n=a.length;
        if (isPossible(a, b, k, n))
        System.out.print("true");
        else
        System.out.print("false");
    }
    
}
