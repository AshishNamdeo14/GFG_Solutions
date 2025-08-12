class Solution {
    static List<Integer> firstNegInt(int arr[], int k) {
        // write code here
        int i=0;
        int j=0;
        ArrayList<Integer> temp = new ArrayList<>();
        ArrayList<Integer> res = new ArrayList<>();
        while(j<arr.length){
            if(arr[j] < 0){
                temp.add(arr[j]);
            }
            if(j-i+1 < k ){
                j++;
            }else if(j-i+1 == k){
                if(temp.isEmpty()){
                    res.add(0);
                }else{
                    res.add(temp.getFirst());
                    if (arr[i] == temp.getFirst()) {
                        temp.removeFirst();
                    }
                }
                i++;
                j++;
            }
        }
        return res;
    }
}
