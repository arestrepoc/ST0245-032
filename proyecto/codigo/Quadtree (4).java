import java.util.ArrayList;

/**
 *
 * @author Mariaelvira
 */
public class Quadtree {
    
    Node root;
    private ArrayList<Colision> colisions = new ArrayList<>();
    private ArrayList<Bee> beeCloseToBreak = new ArrayList<>();
    
    
    public Quadtree(int w){
        int i = 1000;
        while(i<w){
            i = i*2;
        }
        w = i;
        this.root = new Node(0,0,w);
    }
    public String print(Node node){
        if(node.split){
            return "1"+print(node.q1)+"\n 2 "+print(node.q2)+"\n 3"+
                    print(node.q3)+"\n 4 "+print(node.q4)+"\n";
        }
        else{
            return node.toString();
        }
        
    }
    public void add(Bee b){
        root.add(b);
    }
    public void add(ArrayList<Bee> list){
        for(Bee b : list){
            add(b);
        }
    }
    public boolean search(Bee b){
        Node temp = root;
        while(!temp.split){
            if(b.x<temp.x+temp.w/2){
                if(b.y<temp.y+temp.w/2){
                    temp = temp.q2;
                }
                else{
                    temp = temp.q3;
                }
            }
            else{
                if(b.y<temp.y+temp.w/2){
                    temp = temp.q1;
                }
                else{
                    temp = temp.q4;

                }
            }
        }
        return temp.objects.contains(b);
    }
    public int size(){
        return auxsize(root);
    }
    public int auxsize(Node node){
        if(node.split){
            return auxsize(node.q1)+auxsize(node.q2)+auxsize(node.q3)+auxsize(node.q4);
        }
        else{
            return node.objects.size();
        }
    }
    public void delete(Bee b){
        Node temp = root;
        while(!temp.split){
            if(b.x<temp.x+temp.w/2){
                if(b.y<temp.y+temp.w/2){
                    temp = temp.q2;
                }
                else{
                    temp = temp.q3;
                }
            }
            else{
                if(b.y<temp.y+temp.w/2){
                    temp = temp.q1;
                }
                else{
                    temp = temp.q4;

                }
            }
        }
        temp.objects.remove(b);
    }
    
    public ArrayList<Colision> colision(){
	colisions = new ArrayList<>();
	beeCloseToBreak = new ArrayList<>();
        nodeColision(root);
        colisions.addAll(staticColision(beeCloseToBreak));
        return colisions;
    }
    private void nodeColision(Node node){
        if(node.split){
            nodeColision(node.q1);
            nodeColision(node.q2);
            nodeColision(node.q3);
            nodeColision(node.q4);
        }
        else{
            colision(node.objects);
        }
    }
    private void colision(ArrayList<Bee> list){
        for(int i = 0; i<list.size(); i++){
            boolean b1cb = false;
            int b1x = list.get(i).x;
            int b1y = list.get(i).y;
            if((b1x%1000<100||b1x%1000>900)||(b1y%1000<100||b1y%1000>900)){
                beeCloseToBreak.add(list.get(i));
                b1cb = true;
            }
            for(int j = i+1; j<list.size();j++){
                boolean b2cb = false;
                int b2x = list.get(j).x;
                int b2y = list.get(j).y;
                if((b2x%1000<100||b2x%1000>900)||(b2y%1000<100||b2y%1000>900)){
                    b2cb = true;
                }
                if(((b1x-b2x)*(b1x-b2x)+(b1y-b2y)*(b1y-b2y))<10000&&!(b1cb&&b2cb)){
                    colisions.add(new Colision(list.get(i),list.get(j)));
                }
            }
        }
    }
    public static ArrayList<Colision> staticColision(ArrayList<Bee> list){
        ArrayList<Colision> clist = new ArrayList<>();
        for(int i = 0; i<list.size(); i++){
            for(int j = i+1; j<list.size();j++){
                int b1x = list.get(i).x;
                int b1y = list.get(i).y;
                int b2x = list.get(j).x;
                int b2y = list.get(j).y;
                if(((b1x-b2x)*(b1x-b2x)+(b1y-b2y)*(b1y-b2y))<10000){
                    if(Math.abs(b1x-b2x)<100&&Math.abs(b1x-b2x)<100
                            &&Math.abs(b1y-b2y)<100&&Math.abs(b1y-b2y)<100){
                            clist.add(new Colision(list.get(i),list.get(j)));
                    }
                }
            }
        }
        return clist;
    }
    
}
