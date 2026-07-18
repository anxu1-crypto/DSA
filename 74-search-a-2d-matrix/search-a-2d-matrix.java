class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        int m=arr.length , i=0, j=arr[0].length-1;
        while(i<m && j>=0){
            if(arr[i][j] == target) return true;
            if(arr[i][j] < target) i++;
            else j--;
        }
        return false;
    }
}