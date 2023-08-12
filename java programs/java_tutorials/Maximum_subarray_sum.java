public class Maximum_subarray_sum
{
    public static void main(String args[])
    {
       int arr[] = {-2,-3,4,-1,-2,1,5,-3};
       int sum = 0;
       int max = 0;
       for(int i=0;i<arr.length;i++)
       {
            for(int j=i;j<arr.length;j++)
            {
                sum+=arr[j];
            }
            if(max<sum)
            {
                max = sum;
            }
       }
       System.out.println(max);
       /*int sum = 0;
        int max = -2322;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            if(sum<0)
            {
                sum = 0;
            }
            if(max<sum)
            {
                max = sum;
            }
            
        }
        System.out.println(max);*/

        
    }
}