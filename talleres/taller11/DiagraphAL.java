package Talleres;
import java.util.*;
import java.util.ArrayList;

/**
 *
 * @author Mariaelvira
 */
public class DiagraphAL extends Graph{
    
    LinkedList<Pareja>[] list;
    public DiagraphAL(int vertices){
        super(vertices);
        list = new LinkedList[vertices];
    }
    @Override 
    public  void addArc(int source, int destination, int weight){
        list[source].add(new Pajera(destination,weight));
    }
    @Override 
    public ArrayList<Integer> getSuccessors(int vertice){
        ArrayList<Integer> alist = new ArrayList();
        for(Pareja n : list[vertice]){
            alist.add(n.vertice);
        }
        return alist;
    }
    @Override 
    public int getWeight(int source, int destination){
        for(Pareja n : list[source]){
            if(n.vertice==destination) return n.peso;
        }
        return 0;
    }
    @Override 
    public  int size() {return size;}
}
