import java.io.FileNotFoundException;
import java.util.Random;
import java.util.ArrayList;

/**
 *
 * @author Mariaelvira
 */
public class Main{
    public static void main(String[] args)throws FileNotFoundException{
        int memCounter=0;
        int timeCounter=0;
        
        ArrayList<Bee> bee1 = TextReader.Bee1M();
        Quadtree quad1 = new Quadtree(9000);
        quad1.add(bee1);
        
        for(int i=0; i<=9; i++){
        System.out.println("Trial "+i);
        long beforeMem = Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
        long startTime = System.currentTimeMillis();
        ArrayList<Colision> s1 = quad1.colision();;
        long afterMem = Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
        long estimatedTime = System.currentTimeMillis()-startTime;
        timeCounter += estimatedTime;
        System.out.println("The time this trial toook was: " + estimatedTime);
        System.out.println("Quad "+estimatedTime);
        System.out.println("Memory used in trial is: "+ (afterMem-beforeMem));
        memCounter += (afterMem-beforeMem);
        
        beforeMem = Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
        startTime = System.currentTimeMillis();
        ArrayList<Colision> s2 = Quadtree.staticColision(bee1);
        afterMem = Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
        estimatedTime = System.currentTimeMillis()-startTime;
        System.out.println("The time this trial toook was: " + estimatedTime);
        System.out.println("Static "+estimatedTime);
        timeCounter += estimatedTime;
        System.out.println("Memory used in trial is: "+ (afterMem-beforeMem));
        memCounter += (afterMem-beforeMem);
        
        System.out.println(s1.size());
        System.out.println(s2.size());
        beforeMem=0;
        startTime=0;
        afterMem=0;
        estimatedTime=0;
        }
        System.out.println("The average time taken during these trials was: "+(timeCounter/10));
        System.out.println("The average memory used during these trials was: "+(memCounter/10));
    }
    public static ArrayList<Bee> randomBees(int n, int w){
        ArrayList<Bee> b = new ArrayList<>();
        Random rand = new Random();
        for(int i = 0; i<n ; i++){
            b.add(new Bee(rand.nextInt(w),rand.nextInt(w)));
        }
        return b;
    }
}
