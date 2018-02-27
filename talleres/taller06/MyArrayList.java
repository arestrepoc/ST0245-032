/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg1;
import java.util.Arrays;
/**
 *
 * @author Agustin Restrepo
 */
public class MyArrayList {
    private int size = 0;
    public int[] array;
    public MyArrayList(){
        this.array = new int[1];
    }
    public void expandArray(){
        this.array = Arrays.copyOf(array,array.length*2);
    }
    public void add(int e){
        if(size==array.length){
            expandArray();
        }
        size++;
        array[size-1]=e;
    }
    public void add(int e,int i){
        if(size==array.length){
            expandArray();
        }
        if(i>size){
            while(i>=array.length) expandArray();
            size = i;
        }
        else{
            for(int j = size; j>=i;j--){
                array[j]=array[j-1];
            }
        }
        array[i]=e;
        size++;
    }
    public int size(){
        return size;
    }
    public int get(int i)throws IndexOutOfBoundsException{
        if(i>=size) throw new IndexOutOfBoundsException();
        return array[i];
    }
    @Override
    public String toString(){
        String s = "List = ";
        for(int i = 0; i<size-1;i++){
            s+= array[i]+", ";
        }
        s+= array[size-1];
        return s;
    }
}
 