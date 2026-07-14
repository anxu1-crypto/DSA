class Solution {
    public int maximumCount(int[] nums) {
        int n = nums.length - 1;
        int i=0, j=n , pos = 0, neg = 0 ;
        
       while(i<=j){
        int mid = (i+j)/2;
        if(nums[mid] >= 0) j = mid - 1;
        else i = mid + 1;
       }
       neg = i;
       i = 0 ; j = n;
      while(i<=j){
        int mid = (i+j)/2;
        if(nums[mid] > 0) j = mid-1;
        else i = mid + 1;
       }
       pos =nums.length - i ;
       return Math.max(neg , pos);
       
    }
}