class Solution {
    public void sortColors(int[] nums) {
        int i=-1;
        int j= nums.length;
        int k=0;

        while(k<j){
            if(nums[k]==0){
                swap(nums, ++i,k++);
            }
            else if(nums[k]==2){
                swap(nums, --j,k);
            }
            else{
                ++k;
            }
        }
        
    }

    private void swap(int []nums, int i, int j){
        int temp = nums[i];
        nums[i]= nums[j];
        nums[j]= temp;
    }
}
