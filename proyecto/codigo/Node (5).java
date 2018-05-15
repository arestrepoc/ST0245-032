 import java.util.*;
public class Node {
    
    Node q1;
    Node q2;
    Node q3;
    Node q4;
    int x;
    int y;
    int w;
    ArrayList<Bee> objects;
    boolean split = false;

    public Node(int x,int y,int w){
        this.x = x;
        this.y = y;
        this.w = w;
        objects = new ArrayList<>();
    }
    public void add(Bee b){
        if(split){
            if(b.x<x+w/2){
                if(b.y<y+w/2){
                    q2.add(b);
                }
                else{
                    q3.add(b);
                }
            }
            else{
                if(b.y<y+w/2){
                    q1.add(b);
                }
                else{
                    q4.add(b);
                }
            }
        }
        else{
            if(w==1000)objects.add(b);
            else{
                if(objects.size()==0) objects.add(b);
                else{        
                    split = true;
                    q1 = new Node(x+w/2,y,w/2);
                    q2 = new Node(x,y,w/2);
                    q3 = new Node(x,y+w/2,w/2);
                    q4 = new Node(x+w/2,y+w/2,w/2);
                    if(objects.get(0).x<x+w/2){
                        if(objects.get(0).y<y+w/2){
                            q2.add(objects.remove(0));
                        }
                        else{
                            q3.add(objects.remove(0));
                        }
                    }
                    else{
                        if(objects.get(0).y<y+w/2){
                            q1.add(objects.remove(0));
                        }
                        else{
                            q4.add(objects.remove(0));
                        }
                    }
                    add(b);
                }
            }
        }
    }
    public String toString(){
        return objects.toString();
    }
}
