import java.util.*;
public class Postfix{
  public static void main(String args[]){
    String str="953+4*6/-";
    Stack<Integer> s= new Stack<>();
    for(int i=0;i<str.length();i++){
      char ch= str.charAt(i);
      int Aschii= (int)ch;
      if(Aschii>=48 && Aschii<=57){
        s.push(Aschii-48);
      }
      else{
        int val1=s.pop();
        int val2=s.pop();
        if(ch=='-') s.push(val2-val1);
        if(ch=='+') s.push(val2+val1);
        if(ch=='*') s.push(val2*val1);
        if(ch=='/') s.push(val2/val1);
      }
    }
    System.out.println(s.peek());
  }
}