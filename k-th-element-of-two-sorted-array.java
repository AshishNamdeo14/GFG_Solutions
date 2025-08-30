class Solution {
    public int kthElement(int a[], int b[], int k) {
        int m = 0;
        int i=0;
        int j=0;
        int[] arr = new int[a.length+b.length];
        // code here
       while(i<a.length){
           arr[m++] = a[i++];
       }
       while(j<b.length){
           arr[m++] = b[j++];
       }
       Arrays.sort(arr);
    //   System.out.print(Arrays.toString(arr));
       return arr[k-1];
    }
}
