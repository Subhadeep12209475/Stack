import java.util.*;
public class insertBottom{
    public static void insert(Stack<Integer> s,int data){
       // int top=0;
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.peek();
        s.pop();
        insert(s,data);
        s.push(top);
    }
    public static void main(String args[]){
        Stack<Integer> s= new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        insert(s,5);
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }




    }
}