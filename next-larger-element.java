class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
      ArrayList<Integer> list = new ArrayList<>();            
      Stack<Integer> stack = new Stack<>();
      for(int i=arr.length-1;i>=0;i--){
          if(stack.isEmpty()){
              list.add(-1);
          }else if(!stack.isEmpty() && arr[i] < stack.peek()){
              list.add(stack.peek());
          }else if(!stack.isEmpty() && arr[i] >= stack.peek() ){
              while(!stack.isEmpty() && arr[i] >= stack.peek()){
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
      Collections.reverse(list);
      return list;
    }
}
