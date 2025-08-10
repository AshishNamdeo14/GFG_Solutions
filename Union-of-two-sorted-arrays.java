class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // code here
        TreeSet<Integer> union = new TreeSet<>();
        for(int i : a){
              union.add(i);
        }
        for(int num:b){
              union.add(num);
        }
        return new ArrayList<Integer>(union);
    }
}
