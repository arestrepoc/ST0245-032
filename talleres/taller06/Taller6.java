/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg1;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author Agustin Restrepo
 */
public class Taller6 {
    public static void main(String args[]){
        //invert();
        int[] a = patron(4);
        for(int i = 0; i<a.length;i++){
           System.out.print(a[i]+",");
        }
    }
    public static void invert(){
        System.out.println("Type Numbers -1 to stop");
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int n = 0;
        while(n!=-1){
            n = scan.nextInt();
            if(n!=-1) list.add(0,n);
        }
        String s = "List = ";
        for(int i = 0; i<list.size()-1;i++){
            s+= list.get(i)+", ";
        }
        s+= list.get(list.size()-1);
        System.out.println(s);
    }
    public static int[] patron(int n){
        int[] array = new int[n*(n+1)/2];
        for(int i = 0;i<n;i++){
            for(int j = 0; j<=i;j++){
                array[(i*(i+1)/2+j)]=j+1;
            }
        }
        return array;
    }
}
