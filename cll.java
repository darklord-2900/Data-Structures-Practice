import java.util.*;
public class cll {
    node head,tail;
    class node{
        int data;
        node next;
        node tail;
        node(int data){
            this.data=data;
        }
    }
        void insele(int data){
            node nn=new node(data);
            if(head==null){
                head=nn;
                tail=nn;
                tail.next=nn;
            }
            else{
                tail.next=nn;
                tail=nn;
                tail.next=head;
            }
        }
        void dele(){
            if(tail!=head){
                head=head.next;
                tail.next=head;
            }
            else{
                head=tail=null;
            }
        }
        void display(){
            node n1=head;
            if(tail==null&&head==null){
                System.out.println("cll empty");
            }
            else{
                do{
                    System.out.print(n1.data+" ");
                    n1=n1.next;
                }while(n1!=head);
            }
        }
    public static void main(String[] args) {
        cll ob=new cll();
        try (Scanner ab = new Scanner(System.in)) {
            System.out.println("the limit ");
            int l=ab.nextInt();
            for (int i = 0; i < l; i++) {
                int ele=ab.nextInt();
                ob.insele(ele);       
            }
            ob.display();
            System.out.println("the number of elements to be deleted ");
            int dl=ab.nextInt();
        for (int i = 0; i < dl; i++) {
                ob.dele();       
            }
            ob.display();
        }
    }
    
}
