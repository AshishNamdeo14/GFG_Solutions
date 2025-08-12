class Solution {
    public int maximumSumSubarray(int[] arr, int k) {
        // Code here
        int start=0;
        int end=0;
        int sum =0;
        int max =0;

      //Loop will run till the end of the array
        while(end<arr.length){
            sum += arr[end];
            if(end-start+1 < k){
              //sliding the pointer 1 step head from end to reach the len given 
                end++;
            }else if(end-start+1 == k){
                max = Math.max(max,sum);
                sum -= arr[start];
                start++;
                end++;
            }
        }
        return max;
    }
}
