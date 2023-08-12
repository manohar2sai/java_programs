public class Rearrange_array_elements {
    public static void main(String args[])
    {
        int arr[] = {3,1,-2,-5,2,-4};
        int ans[] = new int[arr.length];
        int pos_index = 0;
        int neg_index = 1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>0)
            { 
                ans[pos_index] = arr[i]; 
                pos_index+=2;
            }
            else
            {
                ans[neg_index] = arr[i];
                neg_index+=2;
            }
            
        }
        for(int x:ans)
        {
            System.out.print(x+" ");
        }

    }
    
}
