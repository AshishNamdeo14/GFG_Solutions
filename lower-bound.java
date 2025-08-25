class Solution {
    int lowerBound(int[] arr, int target) {
        // code here
        int start =0;
        int end = arr.length - 1;
        int lowerBound = arr.length;
        while(start <= end){
            int mid=start+(end -start)/2;
            if(arr[mid] >= target){
               lowerBound = mid;
               end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return lowerBound;
    }
}
