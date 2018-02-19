package Laboratorio1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sebastian Gonzalez y Agustin Restrepo
 */
public class Ejercicios21 {
    
    /**
     *
     * @param args
     * En el main se revisan valores especificos de los metodos hechos para verificar que este bien
     */
        public static void main(String args[]){
        int[] array = {1,2,3,30,6};
        System.out.println(factorial(2));
        System.out.println(triangle(5));
        System.out.println(sumDigits(12345));
        System.out.println(array220(array,0));
        System.out.println(array6(array,0));
    }
     
    /**
     * Este metodo retorna el factorial de un entero n de manera recursiva
     * @param n es el entero del cual se desea obtener su factorial
     * @return factorial de n
     */
    public static int factorial(int n) {
        if(n==1) return 1;
        return factorial(n-1)*n;
    }
     
    /**
     * Este metodo recursivo retorna el numero de bloques en un triangulo y usa el parametro "rows" para ver cuantas filas de bloques se hacen
     * @param rows es el numero de filas que se desean tener
     * @return numero de bloques en el triangulo
     */
    public static int triangle(int rows) {
        if(rows == 0) return 0;
        return rows+triangle(rows-1);
    }
 
    /**
     * Este metodo suma todos los digitos de el entero positivo n de manera recursiva
     * @param n es el entero al cual se le sumaran los digitos
     * @return la suma de todos los digitos de n
     */
    public static int sumDigits(int n) {
        if(n/10<1) return n;
        return n%10+sumDigits(n/10);
    }
 
    /**
     * Este metodo busca de manera recursiva si en el arreglo dado hay un elemento que a su lado este el mismo elemento multiplicado por 10
     * @param nums es el arreglo de enteros utilizado en el metodo
     * @param index es un entero para poder revisar todas las posiciones del arreglo
     * @return 
     */
    public static boolean array220(int[] nums, int index) {
        if(index>=nums.length-1) return false;
        return nums[index]*10==nums[index+1]||array220(nums,index+1);
    }
    /**
     * Este metodo se da cuenta si hay un 6 o no dentro de un arreglo de manera recursiva
     * @param nums es el arreglo de enteros utilizado en el metodo
     * @param index  es un entero para poder revisar todas las posiciones del arreglo
     * @return true o false, dependiendo de si hay un 6 o no en el arreglo
     */
    public static boolean array6(int[] nums, int index) {
    if(index>nums.length-1) return false;
    return nums[index]==6||array6(nums,index+1);
}
}
