class Solution {
    public int findKthPositive(int[] arr, int k) {
        int i=0 , j = arr.length - 1;
        while(i<=j){
            int mid = (i+j)/2;
            int n = mid +1;
            int missing = arr[mid] - n;
            if(missing<k) i = mid+1;
            else j = mid - 1;
        }
        return i+k;
    }
}