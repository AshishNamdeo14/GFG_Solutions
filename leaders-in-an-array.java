class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        int n = arr.length-1;
        ArrayList<Integer> list = new ArrayList<>();
        int max = arr[n];
         list.add(max);
        for(int i=n-1;i>=0;i--){
            if(arr[i] >= max){
                max = arr[i];
                list.add(max);
            }
        }
        Collections.reverse(list);
        return list;
    }
}
