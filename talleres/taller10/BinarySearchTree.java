/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Talleres;
public class BinarySearchTree {
    Node root;
    public BinarySearchTree () {
        root = null;
    }
    public void insertar(int n) {
        if(root==null){
            root = new Node(n);
        }
        else{
            Node temp = root;
            boolean end = false;
            while(!end){
                if(temp.data>=n){
                    if(temp.left==null){
                        temp.left = new Node(n);
                        end = true;
                    }
                    else{
                        temp = temp.left;
                    }
                }
                else if(temp.data<=n){
                    if(temp.right==null){
                        temp.right = new Node(n);
                        end = true;
                    }
                    else{
                        temp = temp.right;
                    }
                }
            }
        }
    }

    public boolean buscar(int n) {
        if(n == root.data) return true;
        Node temp = root;
        while(temp!=null){
            if(temp.data==n) return true;
            if(temp.data<n&&temp.left==null) return false;
            if(temp.data>n&&temp.right==null) return false;
            if(temp.data<n) temp=temp.right;
            if(temp.data>n) temp=temp.left;
        }
        return false;
    }
    
    public void borrar(int n){
        Node temp = root;
        boolean stop = false;
        if(buscar(n)!=false){
            while(!stop){
                if(temp.data==n){
                    borrar(temp);
                    stop = true;
                }
                if(temp.data<n&&temp.right!=null) temp=temp.right; 
                if(temp.data>n&&temp.left!=null) temp=temp.left; 
            }
        }
    }
    public void borrar(Node node){
        System.out.println(node.data);
        if(node.left==null&&node.right!=null){
            node.data = node.right.data;
            borrar(node.right);
        }
        if(node.right==null&&node.left!=null){
            node.data = node.left.data;
            borrar(node.left);
        }
        if(node.left!=null&&node.right!=null){
            if(node.left.data>node.right.data){
                node.data = node.left.data;
                borrar(node.left);
            }
            else{
                node.data = node.right.data;
                borrar(node.right);
            }
        }
        if(node.left==null&&node.right==null){
            node = null;
        }
    }
}