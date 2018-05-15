/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
import java.util.Random;
import java.util.ArrayList;
import java.io.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Mariaelvira
 */
public class Main {
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
        
        
        //"----------------------"
        
        /*ArrayList<Bee> bee1 = c;
        Quadtree quad1 = new Quadtree(160000);
        quad1.add(bee1);
        long startTime = System.currentTimeMillis();
        ArrayList<Colision> s1 = quad1.colision();;
        long estimatedTime = System.currentTimeMillis()-startTime;
        System.out.println("Quad "+estimatedTime);
        
        startTime = System.currentTimeMillis();
        ArrayList<Colision> s2 = Quadtree.staticColision(bee1);
        estimatedTime = System.currentTimeMillis()-startTime;
        System.out.println("Static "+estimatedTime);
        
        System.out.println(s1.size());
        System.out.println(s2.size());*/
         /*
        while(s1.size()==s2.size()){
            bee1 = randomBees(5000,80000);
            quad1 = new Quadtree(80000);
            quad1.add(bee1);
            s1 = quad1.colision();
            s2 = Quadtree.staticColision(bee1);
        }
        System.out.println(s1);
        System.out.println(s2);
        System.out.println("");
        System.out.println(quad1.print(quad1.root));
        System.out.println(s1.size());
        System.out.println(s2.size());
        
        long startTime = System.currentTimeMillis();
        System.out.println(quad1.colision().size());
        long estimatedTime = System.currentTimeMillis()-startTime;
        System.out.println(estimatedTime);
        
        startTime = System.currentTimeMillis();
        System.out.println(Quadtree.staticColision(bee1).size());
        estimatedTime = System.currentTimeMillis()-startTime;
        System.out.println(estimatedTime);
        */

        
        
    }
    public static ArrayList<Bee> randomBees(int n, int w){
        ArrayList<Bee> b = new ArrayList<>();
        Random rand = new Random();
        for(int i = 0; i<n ; i++){
            b.add(new Bee(rand.nextInt(w),rand.nextInt(w)));
        }
        return b;
    }
    /*public static ArrayList<Bee> randomBees2(){
        BufferedReader br=null;
        String currentline=null;
        try{
        br = new BufferedReader(new FileReader("1000000abejas.txt"));
        currentline=br.readLine();
        } catch (FileNotFoundException e){System.out.println("Error!");}
        int index=0;
        while(currentline != null){
            String[] temp=currentline.split(",");
        }
    }*/
    /*public static ArrayList<Bee> Bee1M() throws FileNotFoundException{
        Scanner Bee1M = new Scanner(new File("1M.txt"));
        ArrayList<Bee> c = new ArrayList<>();
        while(Bee1M.hasNextLine()){
            String line = Bee1M.nextLine();
            Scanner scanner = new Scanner(line);
            scanner.useDelimiter(",");
            while(scanner.hasNextInt()){
                c.add(new Bee(scanner.nextInt(), scanner.nextInt()));
            }
            scanner.close();
        }
        Bee1M.close();
        System.out.println(c);
        return c;
    }*/
}
