import java.io.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Mariaelvira
 */
public class TextReader{
    static ArrayList<Bee> b;
    public static void main(String[] args) throws FileNotFoundException{
        b = Bee1M();
    }
    public static ArrayList<Bee> Bee1M() throws FileNotFoundException{
        File file = new File("10t.txt").getAbsoluteFile();
        Scanner s = new Scanner(file).useDelimiter("\\s*(,|\\s)\\s*");
        ArrayList<Bee> bees = new ArrayList<>();
        while(s.hasNext()){
            bees.add(new Bee((int)((s.nextDouble()+75.5906853257)*111111),(int)((s.nextDouble()-6.30383554072)*111111)));
            if(s.hasNextLine()){
            s.nextLine();
            }
        }
        s.close();
        return bees;
    }
    public static void xyminreader() throws FileNotFoundException{
        File file = new File("/Users/Mariaelvira/NetBeansProjects/talleresa/src/proyecto/1M.txt").getAbsoluteFile();
        Scanner s = new Scanner(file).useDelimiter("\\s*(,|\\s)\\s*");
        double minx = s.nextDouble();
        double miny = s.nextDouble();
        s.nextLine();
        while(s.hasNext()){
            minx = Math.min(minx,s.nextDouble());
            miny = Math.min(miny,s.nextDouble());
            if(s.hasNextLine()){
            s.nextLine();
            }
        }
        s.close();
        System.out.println(minx);
        System.out.println(miny);
    }
}
