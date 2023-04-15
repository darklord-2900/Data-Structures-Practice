class node{
    char key;
    node left;
    node right;
    node(char key){
        this.key=key;
    }
}
class treetraversal{
    node root;
    void pretrav(node n){
        if(n!=null){
            System.out.print(n.key+" ");
            pretrav(n.left);
            pretrav(n.right);
        }
    }
    void postrav(node n){
        if(n!=null){
            postrav(n.left);
            postrav(n.right);
            System.out.print(n.key+" ");
        }
    }
    void inotrav(node n){
        if(n!=null){
            inotrav(n.left);
            System.out.print(n.key+" ");
            inotrav(n.right);
        }
    }
}
public class bintree {
    public static void main(String[] args) {
        treetraversal ob=new treetraversal();
        ob.root=new node('a');
        ob.root.right=new node('b');
        ob.root.left=new node('c');
        ob.root.right.left=new node('d');
        ob.root.right.right=new node('e');
        ob.root.left.left=new node('f');
        ob.root.left.right=new node('g');
        ob.pretrav(ob.root);
        System.out.println();
        ob.inotrav(ob.root);
        System.out.println();
        ob.postrav(ob.root);
    }

    
}
