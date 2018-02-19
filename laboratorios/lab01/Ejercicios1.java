/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laboratorio1;

/**
 *
 * @author Sebastian Gonzalez y Agustin Restrepo
 */
public class Ejercicios1 {

    /**
     *
     * @param args
     * En el main se revisan valores especificos de los metodos hechos para verificar que este bien
     */
    public static void main(String args[]){
        int[] array1 = array(100000);
        System.out.println(ejersicio1(0,array1));
        System.out.println(ejersicio2(0,array1));
        System.out.println(ejersicio3(10));
        System.out.println(ejersicio3(20));
        System.out.println(ejersicio3(100));
        System.out.println(ejersicio3(1000));
        System.out.println(ejersicio3forma2(0,1,10));
        System.out.println(ejersicio3forma2(0,1,20));
        System.out.println(ejersicio3forma2(0,1,92));
        System.out.println(ejersicio3forma2(0,1,100));
        System.out.println(ejersicio3forma2(0,1,1000));
    }

    /**
     * Este metodo toma un entero n y un arreglo de enteros para sumar todos los elementos y devolver su suma de manera recursiva
     * @param n es un numero entero utilizado para llegar recursivamente al tamano del arreglo para que acabe el programa
     * @param array es el arreglo del cual se sacara la suma de cada elemento
     * @return a suma de los elementos adentro del arreglo
     */
    public static int ejersicio1(int n, int[] array){
        if(n==array.length-1){
            return array[n];
        }
        return ejersicio1(n+1,array)+array[n];
    }

    /**
     * Este metodo toma un entero n y un arreglo de enteros para retornar el valor maximo dentro de sus elementos de manera recursiva
     * @param n es un numero entero utilizado para llegar recursivamente al tamano del arreglo para que acabe el programa
     * @param array es el arreglo en el que se usa para sacar el elemento mayor
     * @return el numero mayor del arreglo
     */
    public static int ejersicio2(int n,int[] array){
        if(n==array.length-1){
            return array[n];
        }
        return Math.max(ejersicio2(n+1,array),array[n]);
    }

    /**
     * Este metodo toma un entero n y retorna el enesimo termino de la serie de fibonacci de manera recursiva
     * @param n es un numero entero; el numero del que se quiere saber su valor en la serie fibonacci
     * @return el enesimo termino de la serie de fibonacci
     */
    public static long ejersicio3(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return ejersicio3(n-2)+ejersicio3(n-1);
    }

    /**
     * Este metodo toma un entero n y retorna el enesimo termino de la serie de fibonacci de manera recursiva
     * @param a es un long para gastar menos memoria y optimizar el metodo
     * @param b es un long para gastar menos memoria y optimizar el metodo
     * @param n es un numero entero; el numero del que se quiere saber su valor en la serie de fibonacci
     * @return el enesimo termino de la serie
     */
    public static long ejersicio3forma2(long a,long b, int n){
        if(n==1){
            return b;
        }
        return ejersicio3forma2(b,a+b,n-1);
    }

    /**
     * Este metodo sirve para tener un arreglo lleno de numeros aleatorios
     * @param n es el numero de elementos que se quieren tener en el arreglo
     * @return arreglo a con n numero de elementos de valores aleatorios entre 0 y 1000
     */
    public static int[] array(int n){
        int[] a = new int[n];
        for(int i = 0; i < n ;i++){
            a[i]= (int)(Math.random()*1000);
        }
        return a;
    }
    
    
    
}
