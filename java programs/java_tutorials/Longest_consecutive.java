import java.util.Arrays;

public class Longest_consecutive {
   /* public static int longestConsecutive(int[] nums) {
        if(nums.length == 0 || nums == null){
            return 0;
        }
        
        Arrays.sort(nums);
                                                 OPTIMAL SOLUTION;
        int ans = 1;
        int prev = nums[0];
        int cur = 1;
        
        for(int i = 1;i < nums.length;i++){
            if(nums[i] == prev+1){
                cur++;
            }
            else if(nums[i] != prev){
                cur = 1;
            }
            prev = nums[i];
            ans = Math.max(ans, cur);
        }
        return ans;
    }*/
    public static void main(String args[])
    {
        int arr[]={100,200,1,2,3,4};
        Arrays.sort(arr);
        int longest = 1;
        int count = 0;
        int least_num = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]-1!=least_num)
            {
                count = 1;
            }
            else if(arr[i]-1==least_num)
            {
                count++;
            }
            least_num = arr[i];
            longest = Math.max(count,longest);
        }
        System.out.print(longest);
        /*int lon=longestConsecutive(arr);
        System.out.println("The longest consecutive sequence is "+lon);*/
        
    }
    
}
