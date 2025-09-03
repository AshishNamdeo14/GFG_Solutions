class Solution {
    public static int sumSubstrings(String s) {
        int sum =0;
        // code here
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                 sum += Integer.parseInt(s.substring(i,j));
            }
        }
        return sum;
    }
}
