import java.util.*;
public class PrefixtoPostfix{
  public static void main(String args[]){
    String str="-9*+5346";
     Stack<String> ss= new Stack<>();

     for(int i=str.length()-1;i>=0;i--){
      char ch= str.charAt(i);
      int Aschii= (int)ch;

      if(Aschii>=48 && Aschii <=47){
        String val= ""+ch;
        ss.push(val);
      }
      else{
        String val1=ss.pop();
        String val2=ss.pop();
        char o= ch;
        String ans= val1+val2+o;
        ss.push(ans);
      }
     }
     System.out.println(ss.peek());
  }
}