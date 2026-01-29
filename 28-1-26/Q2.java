import java.util.*;


public class Q2 {
  static  void sort(Stack <Integer> st){
    if(st.isEmpty()){
      return;
    }
    int top=st.pop();
    sort(st);
    insert(st,top);

}

static void insert(Stack <Integer> st,int x){

    if(st.isEmpty() || st.peek()<=x){
      st.push(x);
      return ;
    }
    int temp=st.pop();
    insert(st,  x);
    st.push(temp);

}
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
Stack<Integer> s1=new Stack<>();
  for(int i=0;i<5;i++){
    s1.push(sc.nextInt());
}
  sort(s1);
  System.out.println();
  for(int i=0;i<s1.size();i++){

    System.out.println("Stack after sort is "+s1.get(i));
  }

 } 
}
