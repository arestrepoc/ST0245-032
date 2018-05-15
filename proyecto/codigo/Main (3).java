import java.io.FileNotFoundException;
import java.util.Random;
import java.util.ArrayList;

/**
 *
 */
public class Main{
    public static void main(String[] args)throws FileNotFoundException{
        long memCounter=0;
        long timeCounter=0;
        long memCounters=0;
        long timeCounters=0;
        
        ArrayList<Bee> bee1 = TextReader.Bee1M();
        Quadtree quad1 = new Quadtree(9000);
        quad1.add(bee1);
        
        long beforeMem;
        long afterMem;
        long startTime;
        long endTime;
        long estimatedTime;
        long estimatedMem;
        long estimatedTimes;
        long estimatedMems;
        int memi = 0;
        int memis = 0;
        for(int i=1; i<=20; i++){
        
        System.out.println("Trial "+i);
        beforeMem = Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
        startTime = System.currentTimeMillis();
        ArrayList<Colision> s1 = quad1.colision();
        afterMem = Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
        endTime = System.currentTimeMillis();
        estimatedTime = endTime-startTime;
        estimatedMem = afterMem-beforeMem;
        timeCounter += estimatedTime;
        if(estimatedMem>=0){
            memi++;
        memCounter += estimatedMem;
        }
        System.out.println("Q T:" + estimatedTime+" M:"+ estimatedMem+ " C:"+s1.size());

        beforeMem = Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
        startTime = System.currentTimeMillis();
        ArrayList<Colision> s2 = Quadtree.staticColision(bee1);
        afterMem = Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
        endTime = System.currentTimeMillis();
        estimatedTimes = endTime-startTime;
        estimatedMems = afterMem-beforeMem;
        timeCounters += estimatedTimes;
        if(estimatedMems>=0){
            memis++;
        memCounters += estimatedMems;
        }
        System.out.println("S T:" + estimatedTimes+" M:"+ (estimatedMems)+ " C:"+s2.size());
        }
        System.out.println("Quad Average Time = "+(timeCounter/20));
        System.out.println("Quad average Mem = "+(memCounter/memi));
        System.out.println("Static Average Time = "+(timeCounters/20));
        System.out.println("Static Average Mem = "+(memCounters/memi));
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
