package proyecto;
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
        if(w>100){
            if(objects.size()==0) objects.add(b);
            if(objects.size()==1){
                split = true;
                q1 = new Node(x+w/2,y,w/2);
                q2 = new Node(x,y,w/2);
                q3 = new Node(x,y+w/2,w/2);
                q4 = new Node(x+w/2,y+w/2,w/2);
                if(b.x<x+w/2){
                    if(b.y<y+w/2){
                        q2.add(objects.get(1));
                    }
                    else{
                        q3.add(objects.get(1));
                    }
                }
                else{
                    if(b.y<y+w/2){
                        q1.add(objects.get(1));
                    }
                    else{
                        q4.add(objects.get(1));
                    }
                }
            }

            if(objects.size()>=1){
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
        }
        else{
            objects.add(b);
        }
    }
}
