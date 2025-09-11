class Solution {
    public static ArrayList<Integer> preSmallerEle(int[] arr) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<arr.length;i++){
            if(stack.isEmpty()){
                list.add(-1);
            }else if(!stack.isEmpty() && arr[i] > stack.peek()){
                list.add(stack.peek());
            }else if(!stack.isEmpty() && arr[i] <= stack.peek()){
                while(!stack.isEmpty() && arr[i] <= stack.peek()){
                    stack.pop();
                }
                if(stack.isEmpty()){
                    list.add(-1);
                }else{
                    list.add(stack.peek());
                }
            }
            stack.push(arr[i]);
        }
        return list;
    }
}
