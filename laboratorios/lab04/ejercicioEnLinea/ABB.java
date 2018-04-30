/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab4;
public class ABB {
    public ABB left = null;
    public ABB right = null;
    public int data;
    private boolean datanull = false;
    public ABB(int data){
        this.data = data;
    }
    public ABB(){
        datanull = true;
    }
    public void insert(int n) {
        if(datanull){
            data = n;
            datanull = false;
        }
        else{
            if(n<data){
                if(left == null) left = new ABB(n);
                else left.insert(n);
            }
            else{
                if(right == null) right = new ABB(n);
                else right.insert(n);
            }
        }
    }
    @Override
    public String toString(){
        String r = "";
        if(left!=null) r= r+left.toString();
        if(right!=null) r = r+right.toString();
        r = r+data+"\n";
        return r;
    }
}
