class Solution {
    public ArrayList<Integer> calculateSpan(int[] arr) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Pair> stack = new Stack<>();
        for(int i=0;i<arr.length;i++){
            if(stack.isEmpty()){
                list.add(-1);
            }else if(!stack.isEmpty() && arr[i] < stack.peek().num1 ){
                list.add(stack.peek().num2);
            }else if(!stack.isEmpty() && arr[i] >= stack.peek().num1 ){
                while(!stack.isEmpty() && arr[i] >= stack.peek().num1 ){
                    stack.pop();
                }
                if(stack.isEmpty()) {
                    list.add(-1);
                }else{
                    list.add(stack.peek().num2);
                }
            }
            stack.push(new Pair(arr[i],i));
        }
        
        for(int i=0;i<list.size();i++){
            int val = i - list.get(i);
            list.set(i, val); 
        }
        return list;
    }
    
    private static class Pair {
    int num1;
    int num2;

    Pair(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
}
}
