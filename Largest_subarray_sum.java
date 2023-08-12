public class Largest_subarray_sum {
    public static void main(String args[])
    {
        int arr[] = {1,2,3,1,1,1,1,4,2,3};
        int val = 8;
        int len = 0;
        /*for(int i=0;i<arr.length;i++)
        {
            sum = 0;
            for(int j=i;j<arr.length;j++)                     //brute force solution
            {
                sum+=arr[j];
                if(sum==val)
                {
                    len = Math.max(len,j-i+1);
                }
                
            }
        }
        System.out.println(len);*/
       /* int right=0,left=0;
        int sum = arr[0],k=8;
        while(right<arr.length)
        {
            while(left<=right && sum>k)
            {
                sum-=arr[left];
                left++;
            }                                                    //optimal solution
            if(sum==k)
            {
                len = Math.max(len,right-left+1);
            }
            right++;
            if(right<arr.length) sum+=arr[right];
        }
        System.out.print(len);*/



    }
    
}
