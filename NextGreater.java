import java.util.*;
public class NextGreater{
  public static void check(int arr[]){
    Stack<Integer>st= new Stack<>();
    int ans[] = new int[arr.length];

    for(int i=arr.length-1;i>=0;i--){
      while(!st.isEmpty() && st.peek()<=arr[i]){
        st.pop();
      }
      if(st.isEmpty()){
        ans[i]=-1;
      }else{
        ans[i]=st.peek();
      }

      st.push(arr[i]);
    }

    for(int i=0;i<ans.length;i++){
      System.out.print(ans[i]+" ");
    }
  }
  public static void main(String args[]){
    int arr[]={6,8,0,1,3};
    check(arr);
  }
}