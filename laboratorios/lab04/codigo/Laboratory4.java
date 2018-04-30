package Lab4;
import java.util.*;
public class Laboratory4 {
    public static void main(String args[]){
        BinaryTree genealogia = new BinaryTree();
        genealogia.root = new Node("Agustin");
        genealogia.root.left = new Node("Maria Elvira");
        genealogia.root.right = new Node("Andres");
        genealogia.root.left.right = new Node("Luis Fernando");
        genealogia.root.left.left = new Node("Eugenia Santamaria");
        genealogia.root.right.left = new Node("Mariela");
        genealogia.root.right.right = new Node("Fabian");
        genealogia.root.right.right.left = new Node("Ana");
        genealogia.root.right.right.right = new Node("Antonio Maria");
        genealogia.root.right.left.left = new Node("Maria Sofia");
        genealogia.root.right.left.right = new Node("Francisco");
        genealogia.root.left.left.left = new Node("Marta");
        genealogia.root.left.left.right = new Node("Tomas Ciprianp");
        genealogia.root.left.right.left = new Node("");
        genealogia.root.left.right.right = new Node("");
        
        genealogia.maxheight();
        genealogia.recursivePrint();

        System.out.println();
        System.out.println(abuelaMaterna(genealogia.root));
        
        
        System.out.println();
        ABB tree = new ABB();
        tree.insert(50);
        tree.insert(30);
        tree.insert(24);
        tree.insert(5);
        tree.insert(28);
        tree.insert(45);
        tree.insert(98);
        tree.insert(52);
        tree.insert(60);
        
        System.out.println(tree.toString());
        
    }
    public static String abuelaMaterna(Node n){
        return "Abuela Materna = "+n.left.left.data;
    }
}
