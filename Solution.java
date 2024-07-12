class Solution {
    public boolean can(int[] nums, int id){
        int current = Integer.MIN_VALUE;

        for(int i=0; i<nums.length; i++){
            if(i==id){
                continue;
            }
            if(nums[i] > current){
                current = nums[i];
            }else{
                return false;
            }
        }
        return true;
    }
    public boolean canBeIncreasing(int[] nums) {
        
        for(int i=0; i<nums.length; i++){
            if(can(nums,i)){
                return true;
            }
        }
        return false;
    }
}
