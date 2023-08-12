public class Sorted_array_ornot {
    public static void main(String args[])
    {
        int arr[] = {3,1,98,23};
        int count = 0;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>arr[i-1])
            {
                count++;
            }
        }
        if(count==arr.length-1)
        {
            System.out.print(true);
        }
        else{
            System.out.print(false);
        }
    }
    
}
