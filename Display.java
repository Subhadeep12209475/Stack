import java.util.*;
public class Display{
  public static void show(Stack<Integer> s){
    if(s.size()==0) return;
    int a= s.pop();
    System.out.print(a+" ");
    show(s);
    s.push(a);
  }
  public static void rev(Stack<Integer> s){
    if(s.size()==0) return;
    int a= s.pop();
    rev(s);
    System.out.print(a+" ");
    s.push(a);
  }
  public static void main(String args[]){
    Stack<Integer> s= new Stack<>();
    s.push(1);
    s.push(2);
    s.push(3);
    s.push(4);
    s.push(5);
    show(s);
    rev(s);
  }
}