public class RemoveEle {
    public void removeElement(int[] nums, int val) {
        int k=0;
     for(int i=0;i<nums.length;i++){
        if(nums[i]!=val){
            nums[k]=nums[i];
            k++;
        }
     } 
    System.out.println(k);  
    }
    public static void main(String[] args){
    int nums[]={3,2,3,2};
    int val=3;
    RemoveEle obj=new RemoveEle ();
    obj.removeElement(nums,val);
    
    }
}

