public class Stack {
    Node first;
    int count=0;

    public void push(Object ele)
    {
        if(first==null){
            Node node=new Node(ele);
            count++;
            return;
        }
        first=new Node(ele,first);
        count++;
    }

    public int size(){
        return count;
    }

    public boolean isEmpty(){
        return count==0;
    }

    public Object peek(){
        if(isEmpty()){
            System.out.println("No elements found");
            return null;
        }
        return first.ele;
    }

    public Object pop(){
        if(isEmpty()){
            System.out.println("No elements found");
            return null;
        }
        Object ele=first.ele;
        first=first.next;
        count--;
        return ele;
    }

    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        System.out.println(s.size());
        System.out.println(s.isEmpty());
        System.out.println(s.peek());
    }
    class Node{
        Object ele;
        Node next;
        Node(Object ele){
            this.ele=ele;
        }
        Node(Object ele,Node next){
            this.ele=ele;
            this.next=next;
        }
    }
}
