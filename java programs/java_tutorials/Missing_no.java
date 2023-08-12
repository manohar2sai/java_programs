
public class Missing_no {
    public static void main(String args[])
    {
        int arr[] = {1,2,4,5,6};
        int sum = 0,sum_arr = 0;
        for(int i=0;i<=arr.length+1;i++)
        {
            sum+=i;
        }
        for(int i=0;i<arr.length;i++)
        {
            sum_arr+=arr[i];

        }
        System.out.println(sum-sum_arr);
    }
    
}
