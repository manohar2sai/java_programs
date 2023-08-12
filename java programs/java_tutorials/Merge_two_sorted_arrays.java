import java.util.*;
public class Merge_two_sorted_arrays {
    public static void main(String args[])
    {
        int arr1[] = {1,3,5,7}; 
        int n1 = arr1.length;
        int arr2[] = {0,2,6,8,9};
        int n2 = arr2.length;
        int i=0,j=0;
        i = n1-1;
        while(i>=0 && j<n2)
        {
            if(arr1[i]>arr2[j])                                   //optimal solution
            {
                int temp = arr1[i];
                arr1[i] = arr2[j];
                arr2[j] = temp;
            }
            i--;
            j++;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for(int x:arr1)
        {
            System.out.print(x+" ");
        }
        System.out.println();
        for(int y:arr2)
        {
            System.out.print(y+" ");
        }
      /*  Vector<Integer> ans = new Vector<Integer>();
        int i=0,j=0;
        while(i<n1 && j<n2)
        {
            if(arr1[i]<arr2[j])
            {
                ans.add(arr1[i]);
                i++;
            }
            else
            {
                ans.add(arr2[j]);                                brute force;
                j++;
            }
        }
        while(i<n1)
        {
            ans.add(arr1[i]);
            i++;
        }
        while(j<n2)
        {
            ans.add(arr2[j]);
            j++;
        }
        System.out.print(ans);*/




    }
}
