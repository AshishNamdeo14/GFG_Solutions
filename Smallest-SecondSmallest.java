class Solution {
    public ArrayList<Integer> minAnd2ndMin(int[] arr) {
        ArrayList<Integer> res = new ArrayList<>();
        // code here
        int smallest = Integer.MAX_VALUE;
        int second_Smallest = Integer.MAX_VALUE;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] < smallest){
                second_Smallest = smallest;
                smallest = arr[i];
            }else if(arr[i] != smallest && arr[i] < second_Smallest){
                second_Smallest = arr[i];
            }
        }
        if (second_Smallest == Integer.MAX_VALUE) {
            res.add(-1); // No second smallest found
        } else {
            res.add(smallest);
            res.add(second_Smallest);
        }

        return res;
    }
}
