class Solution {
    public void sortColors(int[] nums) {
     int l,m,r,t;
     l=0;m=0;r=nums.length-1;
     while(l<=r&&m<=r){
        if(nums[m]==0){
            t=nums[m];
            nums[m]=nums[l];
            nums[l]=t;
            l++;m++;
        }
        else if(nums[m]==2){
            t=nums[m];
        nums[m]=nums[r];
        nums[r]=t;
        r--;    

        }
        else{
            m++;
        }
     }
    }
}