package Tool;
import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Tree {
      

    public static Node<Integer> test2(Node<Integer> root, Node<Integer> rud,Node<Integer> hf, Node<Integer> ds) {
      //  Node<Integer> root = new Node<Integer>(2);
        //Node<Integer> n11 = new Node<Integer>(7);
      //  Node<Integer> n12 = new Node<Integer>(5);
      //  Node<Integer> n21 = new Node<Integer>(2);
       // Node<Integer> n22 = new Node<Integer>(6);
     //   Node<Integer> n23 = new Node<Integer>(9);
     //   Node<Integer> n31 = new Node<Integer>(5);
     //   Node<Integer> n32 = new Node<Integer>(8);
    //    Node<Integer> n33 = new Node<Integer>(4);

    	//Node<Integer> r=(Node)root;
    	
       root.left = rud;
       rud.left = hf;
       rud.right = ds;
        
        return root;
    }
    public static Node<Integer> test(Node<Integer> root, Node<Integer> rde,Node<Integer> cs) {
        //  Node<Integer> root = new Node<Integer>(2);
          //Node<Integer> n11 = new Node<Integer>(7);
        //  Node<Integer> n12 = new Node<Integer>(5);
        //  Node<Integer> n21 = new Node<Integer>(2);
         // Node<Integer> n22 = new Node<Integer>(6);
       //   Node<Integer> n23 = new Node<Integer>(9);
       //   Node<Integer> n31 = new Node<Integer>(5);
       //   Node<Integer> n32 = new Node<Integer>(8);
      //    Node<Integer> n33 = new Node<Integer>(4);

      	//Node<Integer> r=(Node)root;
      	
         root.right = rde;
         rde.right = cs;
         
          
          return root;
      }
    public Node1 search1(Node1 root1, int level)
    {
         if (root1.level==0)
            return search1(root1.left1,0);
        return search1(root1.right1,0);
    }

    public static void main(String[] args) {

    	Node<Integer> r = new Node<Integer>(2);
    	Node<Integer> d = new Node<Integer>(2);
    	Node<Integer> f = new Node<Integer>(2);
    	Node<Integer> g = new Node<Integer>(2);
    	//TreePrinter.printNode(test2(r,d,f,g));
    	
       // BTreePrinter.printNode(test2(null,null,null,null));

    }
}

class Node<T extends Comparable<?>> {
    Node<T> left, right;
    T data;

    public Node(T data) {
        this.data = data;
    }
}
class Node1 {
    int level;
    Node1 left1, right1;
    public Node1(int item) {
    	level = item;
        left1 = right1 = null;
    }
    }
