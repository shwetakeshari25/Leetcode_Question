public class MaxTotalSubarrrayValue {
    public long maxTotalValue(int[] nums, int k) {
     int max=Integer.MIN_VALUE; 
     int min=Integer.MAX_VALUE;  
     for(int i=0;i<nums.length;i++){
       max=Math.max(max,nums[i]);
       min=Math.min(min,nums[i]);
     }
     return 1l* k*(max-min);
    }
public static void main(String[] args) {
    int nums[]={1,3,2};
    int k=2;
    MaxTotalSubarrrayValue obj= new MaxTotalSubarrrayValue();
    System.out.println(obj.maxTotalValue(nums,k));
}    
}    

