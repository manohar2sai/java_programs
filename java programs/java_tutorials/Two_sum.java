

import java.util.*;
public class Two_sum {
    public static void main(String args[])
    {
        int arr[] = {2,6,5,8,11};
        int target = 14;
        Arrays.sort(arr);
        int left = 0,right = arr.length-1;
        while(left<right)
        {
            int sum = arr[left]+arr[right];
            if(sum==target)
            {
                System.out.println("yes");
                break;
            }
            else if(sum<target)
            {
                left++;
            }
            else{
                right--;
            }
        }
       
       
        /*for(int i=0;i<arr.length;i++)
        {
            
            for(int j=0;j<arr.length;j++)
            {                                                        Brute force solution;
                if(i==j) continue;
                if(arr[i]+arr[j]==target)
                {
                    System.out.println(i+" "+j);
                    break;
                }
            }
        }*/

       

    }
    
}
