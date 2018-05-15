
/**
 * Write a description of class textReader here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Random;
import java.util.ArrayList;
import java.io.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class textReader
{
    public static void main(String[] args) throws FileNotFoundException{
        Scanner Bee1M = new Scanner(new File("1M.txt"));
        ArrayList<Bee> c = new ArrayList<>();
        while(Bee1M.hasNextLine()){
            String line = Bee1M.nextLine();
            Scanner scanner = new Scanner(line);
            scanner.useDelimiter(",");
            while(scanner.hasNextDouble()){
            c.add(new Bee((int)(scanner.nextDouble()*111111), (int)((scanner.nextDouble()-6)*111111)));
            }
            scanner.close();
        }
        Bee1M.close();
    }
}
