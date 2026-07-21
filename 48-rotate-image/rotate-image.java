class Solution {
    public void rotate(int[][] nums) {
        int n = nums.length - 1;
        for(int i = 0; i<nums.length; i++){
            for(int j=0; j<i; j++){
              int x = nums[i][j];
              nums[i][j] = nums[j][i];
              nums[j][i] = x;
            }
        }
        int a  = 0;
        int k=0;
        while(a<n){
            for(k=0; k<nums.length; k++){
                int temp = nums[k][a];
                nums[k][a] = nums[k][n];
                nums[k][n] = temp;
            }
            a++;
            n--;
        }
        
    }
}