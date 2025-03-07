import java.util.*;
public class InfixtoPrefix{
  public static void main(String args[]){
    String str="9-(5+3)*4/6";
    Stack<Character> c= new Stack<>();
    Stack<String> s= new Stack<>();
    for(int i=0;i<str.length();i++){
      char ch= str.charAt(i);
      int Aschii= (int)ch;
      String x= ""+ch;
      if(Aschii >=48 && Aschii <=57){
        s.push(x);
      }
      else if(c.size()==0 || ch=='(' || c.peek()=='('){
        c.push(ch);
      }else if(ch==')'){
        while(c.peek() != '('){
          String val1=s.pop();
          String val2=s.pop();
          char o= c.pop();
          String ans= o+val2+val1;

          s.push(ans);
        }
        c.pop();
      }
      else{
        if(ch=='+' || ch=='-'){
          String val1=s.pop();
          String val2=s.pop();
          char o= c.pop();
          String ans= o+val2+val1;

          s.push(ans);
          c.push(ch);
        }
        else{
          if(c.peek()=='*' || c.peek()=='/'){
            String val1=s.pop();
          String val2=s.pop();
          char o= c.pop();
          String ans= o+val2+val1;

          s.push(ans);
          c.push(ch);
          }else{
            c.push(ch);
          }
        }
      }
    }
    while(s.size()>1){
      String val1=s.pop();
          String val2=s.pop();
          char o= c.pop();
          String ans= o+val2+val1;

          s.push(ans);
    }
    System.out.println(s.peek());
  }
}