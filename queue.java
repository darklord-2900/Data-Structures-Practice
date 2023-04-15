import java.util.*;
class queuearray{
    int r_q,f,limit;static int[] q1;
    queuearray(int size){
        limit=size;
        q1=new int[limit];
    }
void enqueue(int value){
    if(r_q==limit){
        System.out.println("queue full");
    }
    else
    {   
            q1[r_q]=value;
            r_q++;
     }
    }
     void dequeue(){
        if(r_q==0){
            System.out.println("queue empty");
        }
        else {
            for (int i=0;i<r_q-1;i++) {
                q1[i]=q1[i+1];
            }
            r_q--;
        }
       }
      void display(){
        if(r_q==0){
            System.out.println("queue empty");
        }
        else {
            for (int i=0;i<r_q;i++) {
                System.out.print(q1[i]+" ");
            }
        }
       }     
    }     
public class queue {
   static int f,r_q=0,limit,ele,n1;
   static int[] q1;
    public static void main(String[] args) {
        try (Scanner ab = new Scanner(System.in)) {
            System.out.println("limit: ");
            limit=ab.nextInt();
            queuearray ob=new queuearray(limit);
            for (int i=0; i<limit;i++) 
            {
                System.out.println("element no :"+(i+1));
                ele=ab.nextInt();
                ob.enqueue(ele);
            }
            ob.display();
            System.out.println("number of elements to dequeue");
             n1=ab.nextInt();
            for (int j=0;j<n1;j++){
                ob.dequeue();          
            }
            ob.display();
        }
    }
}
  