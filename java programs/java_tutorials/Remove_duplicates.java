public class Remove_duplicates {
    public static void main(String args[])
    {
        int arr[] = {1,1,1,2,2,2,3,3};
        int j=0;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[j]!=arr[i])
            {

                arr[j+1] = arr[i];
                j++;
            }
        }
        System.out.println(j+1);
        for(int x:arr)
        {
            System.out.print(x+" ");
        }
    }
    
}
