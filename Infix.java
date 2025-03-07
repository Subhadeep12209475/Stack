import java.util.*;
public class Infix{
  public static void main(String args[]){
    String str= "9*(3+4)-3*4/2";
    Stack<Integer> st= new Stack<>();
    Stack<Character> c= new Stack<>();
    for(int i=0;i<str.length();i++){
      char ch= str.charAt(i);
      int aschii = (int)ch;
      if(ch>=48 && ch<=57){
          st.push(aschii-48);
      }
      else if(c.size()==0 || ch=='(' || c.peek()=='('){
        c.push(ch);
      }
      else if(ch==')'){
        while(c.peek()!='('){
          //work
          int val1=st.pop();
          int val2=st.pop();
          if(c.peek()=='+') st.push(val2+val1);
          if(c.peek()=='-') st.push(val2-val1);
          if(c.peek()=='*') st.push(val2*val1);
          if(c.peek()=='/') st.push(val2/val1);
          c.pop();
        }
        c.pop();
      }
      else{
        if(ch=='+' || ch=='-'){
          //work
          int val1=st.pop();
          int val2=st.pop();
          if(c.peek()=='+') st.push(val2+val1);
          if(c.peek()=='-') st.push(val2-val1);
          if(c.peek()=='*') st.push(val2*val1);
          if(c.peek()=='/') st.push(val2/val1);
          c.pop();
          //push
          c.push(ch);
        }
        if(ch=='*' || ch=='/'){
          if(c.peek()=='*' || c.peek()=='/'){
            int val1=st.pop();
          int val2=st.pop();
          if(c.peek()=='*') st.push(val2*val1);
          if(c.peek()=='/') st.push(val2/val1);
          c.pop();
          //push
          c.push(ch);
          }else{
            c.push(ch);
          }
        }
      }

    }
      while(st.size()>1){
        int val1=st.pop();
          int val2=st.pop();
          if(c.peek()=='+') st.push(val2+val1);
          if(c.peek()=='-') st.push(val2-val1);
          if(c.peek()=='*') st.push(val2*val1);
          if(c.peek()=='/') st.push(val2/val1);
          c.pop();
      }
    System.out.println(st.peek());
  }
}