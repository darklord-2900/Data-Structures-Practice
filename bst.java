class node {
    char key;
    node left;
    node right;

    node(char key) {
        this.key = key;
    }
}

class bsol {
    node root;

    void insele(char key) {
        root = instree(root, key);

    }

    node instree(node root, char key) {
        if (root == null) {
            root = new node(key);
            return root;
        }
        if (key < root.key) {
            root.left = instree(root.left, key);
        } else if (key > root.key) {
            root.right = instree(root.right, key);
        }
        return root;
    }

    void pretrav(node n) {
        if (n != null) {
            System.out.print(n.key + " ");
            pretrav(n.left);
            pretrav(n.right);
        }
    }

    void postrav(node n) {
        if (n != null) {
            postrav(n.left);
            postrav(n.right);
            System.out.print(n.key + " ");
        }
    }

    void inotrav(node n) {
        if (n != null) {
            inotrav(n.left);
            System.out.print(n.key + " ");
            inotrav(n.right);
        }
    }
}

public class bst {
    public static void main(String[] args) {
        bsol ob = new bsol();
        ob.insele('e');
        ob.insele('a');
        ob.insele('d');
        ob.insele('c');
        ob.insele('f');
        ob.insele('b');
        ob.pretrav(ob.root);

    }

}
