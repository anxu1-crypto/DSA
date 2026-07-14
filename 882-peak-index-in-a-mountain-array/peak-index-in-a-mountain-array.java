class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int idx = 0, lo = 1, hi = arr.length -2;
        while(lo<=hi){
            int mid = (lo +hi)/2;
            if (arr[mid] > arr[mid + 1] && arr[mid] >arr[mid - 1]){
                idx = mid;
                break;
            }
            else if(arr[mid] >arr[mid + 1] && arr[mid] < arr[mid - 1]) hi = mid - 1;
           
            else lo = mid+1;
        }
        return idx;
    }
}