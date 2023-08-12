
import java.util.*;
public class Intersection {
    public static void main(String args[])
    {
        int arr1[] = {1,1,2,2,3,3};
        int arr2[] = {2,2,3,3,4,4};
        Vector<Integer> res = new Vector<Integer>();
        int i=0,j=0;
        while(i<arr1.length|| j<arr2.length)
        {
            if(arr1[i]<arr2[j])
            {
               

                i++;
            }
            else if(arr1[i]>arr2[j])
            {
                
                j++;
            }
            else{
                res.add(arr1[i]);
                i++;
                j++;
            }
         }
         System.out.print(res);
        

    }
    
}
