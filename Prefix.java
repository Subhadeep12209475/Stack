import java.util.*;
public class Prefix{
  public static void main(String args[]){
    String str="-9/*+5346";
    Stack<Integer> val= new Stack<>();

    for(int i=str.length()-1;i>=0;i--){
      char ch= str.charAt(i);
      int Aschii= (int)ch;
      if(Aschii >= 48 && Aschii <= 57){
        val.push(Aschii-48);
      }
      else{
        int val1=val.pop();
        int val2=val.pop();
        if(ch=='+') val.push(val1+val2);
        if(ch=='-') val.push(val1-val2);
        if(ch=='*') val.push(val1*val2);
        if(ch=='/') val.push(val1/val2);

      }
      }
    System.out.println(val.peek());
    }
  }
