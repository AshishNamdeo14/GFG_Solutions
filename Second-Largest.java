class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        if(arr.length<2){
            return -1;
        }
        int largestNo = Integer.MIN_VALUE;
        int secLargest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(largestNo < arr[i]){
                secLargest = largestNo;
                largestNo = arr[i];
            }else if(arr[i] != largestNo && arr[i] > secLargest){
                secLargest = arr[i];
            }
        }
        return secLargest;
    }
}
