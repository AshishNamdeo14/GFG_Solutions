public class test {
    public static void main(String[] args) {
      int[] arr = {1,3,2,4,6,5};
      ArrayList<Integer> list = new ArrayList<>();
      Stack<Integer> stack = new Stack<>();
      for(int i=0;i<arr.length;i++){
          if(stack.isEmpty()){
              list.add(-1);
          }else if(stack.peek() <= arr[i]){
              while(!stack.isEmpty() &&  stack.peek() <= arr[i]){
                  stack.pop();
              }
              if(stack.isEmpty()){
                  list.add(-1);
              }else{
                  list.add(stack.peek());
              }
          }else if(!stack.isEmpty() && stack.peek() > arr[i]){
              list.add(stack.peek());
          }
          stack.add(arr[i]);
      }
      System.out.print(list);
    }
}
