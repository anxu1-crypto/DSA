class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length - 1;
        if(nums.length == 1) return nums[0];
        if(nums[0] != nums[1]) return nums[0];
        if(nums[n] != nums[n-1]) return nums[n];
        int i = 0 , j = n , res = 0;
        while(i<=j){
            int mid = i + (j-i)/2;
            if(nums[mid] != nums[mid-1] && nums[mid] != nums[mid+1]) return nums[mid];
            int f = mid , s=mid;
            if(nums[mid] == nums[mid-1]) f = mid-1;
            else s = mid+1;
            if((f-i)%2==0) i = s+1;
            else j = f -1; 
        }
        return 1;
    }
}