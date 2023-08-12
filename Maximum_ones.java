class Maximum_ones{
    public static void main(String args[])
    {
        int arr[] = {0,0,0,0};
        int count = 0,max = 0;
        for(int i =0;i<arr.length;i++)
        {
            if(arr[i]==1)
            {
                count++;
            }
            else{
                count = 0;
            }
            if(max<count)
            {
                max = count;
            }
        }
        System.out.println(max);
    }
}
