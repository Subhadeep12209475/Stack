import java.util.*;
public class PushAtBottom{
  public static void show(Stack<Integer> s,int n){
    if(s.size()==0){
      return;
    }
    int a= s.pop();
    show(s,n);
    s.push(a);
  }
  public static void main(String args[]){
    int n=6;
    Stack<Integer> s= new Stack<>();
    s.push(1);
    s.push(2);
    s.push(3);
    s.push(4);
    s.push(5);
    show(s,n);
    System.out.println(s);
  }
}