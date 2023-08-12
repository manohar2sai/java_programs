public class Second_larget_ele {
    public static void main(String args[])
    {
        int arr[] = {23,45,12,90,24};
        int max = arr[0];
        int second = -1;
        for(int i=1;i<arr.length;i++)
        {
            if(max<arr[i])
            {
                second = max;
                max = arr[i];
            }
        }
        /*for(int i=1;i<arr.length;i++)
        {
            if(max<arr[i])
            {
                max = arr[i];
            }
        }
        int second_Max=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(second_Max<arr[i] && max>arr[i])
            {
                second_Max = arr[i];
            }
            else{
                second_Max = -1;
            }
        }*/
        System.out.println(second);


    }
    
}
