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
public class Ejercicios22 {
        
    /**
     *
     * @param args
     * En el main se revisan valores especificos de los metodos hechos para verificar que este bien
     */
    public static void main(String args[]){
        int[] array1 = {1, 6, 2, 6, 5};
        int[] array2 = {10, 2, 2, 3, 3};
        int[] array3 = {1,2,3,10,10,1,1};
        int[] array4 = {10, 7, 5, 5, 2};
        int[] array5 = {3,5,6,10,3,3};
        System.out.println(groupSum6(0,array1,15));
        System.out.println(groupNoAdj(0,array2,15));
        System.out.println(splitArray(array3));
        System.out.println(splitOdd10(array4));
        System.out.println(split53(array5));
         
    }
     
    /**
     * Este metodo recursivo calcula desde un punto de inicio si un grupo de numeros sumados dan un numero ingresado pero con la condicion de que los 6's se tienen que sumar
     * @param start es el punto de inicio donde se busca la suma
     * @param nums es el arreglo utilizado en el metodo
     * @param target es el numero que buscan encontrar tras sumar los otros numeros
     * @return verdadero o falso si se logra el numero objetivo
     */
    public static boolean groupSum6(int start, int[] nums, int target) {
        if(start>=nums.length) return target == 0;
        if(nums[start]==6) return groupSum6(start+1,nums,target-6);
        return groupSum6(start+1,nums,target-nums[start])||
            groupSum6(start+1,nums,target);
    }

    /**
     * Este metodo recursivo trata de encontrar un numero ingresado con las suma de otros, con un punto de inicio y con la condicion que si algun
     * elemento es escogido para la suma, el numero que le sigue no se puede tener en cuenta
     * @param start es el punto de inicio donde se busca la suma
     * @param nums es el arreglo utilizado en el metodo
     * @param target es el numero que buscan encontrar tras sumar los otros numeros
     * @return verdadero o falso si se logra el numero objetivo
     */
    public static boolean groupNoAdj(int start, int[] nums, int target) {
        if(start>=nums.length) return target == 0;
        return groupNoAdj(start+2,nums,target-nums[start])||
            groupNoAdj(start+1,nums,target);
    }

    /**
     * Este metodo recursivo trata de divider el arreglo en dos grupos para que la suma de los elementos de un arreglo sea igual a la suma de los elementos del otro arreglo
     * @param nums es el arreglo utilizado en e metodo
     * @return verdadero o falso dependiendo de lo que le diga el metodo splitArrayHelper
     */
    public static boolean splitArray(int[] nums) {
        return splitArrayHelper(0,nums,0,0);
    }

    /**
     * Este metodo ayuda a splitArray
     * @param index es la posicion del arreglo
     * @param nums es el arreglo original
     * @param group1 es la suma de los elementos del primer arreglo
     * @param group2 es la suma de los elementos del segundo arreglo
     * @return verdadero o falso
     */
    public static boolean splitArrayHelper(int index, int[] nums, int group1,int group2){
        if(index>=nums.length) return group1==group2;
        return splitArrayHelper(index+1,nums,group1+nums[index],group2)||
            splitArrayHelper(index+1,nums,group1,group2+nums[index]);
    }

    /**
     * Este metodo recursivo trata de dividir un arreglo en dos grupos para que la suma de los elementos de un grupo sea un multiplo de 10 y la suma de los elementos
     * de el otro terminen en un numero impar
     * @param nums es el arreglo utilizado en el metodo
     * @return verdadero o falso dependiendo de lo que diga el metodo splitOddHelper
     */
    public static boolean splitOdd10(int[] nums) {
        return splitOdd10Helper(0,nums,0,0);
    }

    /**
     *
     * Este metodo ayuda a splitOdd10
     * @param index es la posicion del arreglo
     * @param nums es el arreglo original
     * @param group1 es la suma de los elementos del primer arreglo
     * @param group2 es la suma de los elementos del segundo arreglo
     * @return verdadero o falso
     */
    public static boolean splitOdd10Helper(int index, int[] nums, int group1,int group2){
        if(index>=nums.length) return group1%10==0&&group2%2==1;
        return splitOdd10Helper(index+1,nums,group1+nums[index],group2)||
            splitOdd10Helper(index+1,nums,group1,group2+nums[index]);
    }

    /**
     * Este metodo recursivo trata de divider el arreglo en dos grupos para que la suma de los elementos de un arreglo sea igual a la suma de los elementos del otro arreglo
     * con unas condiciones. Todos los elementos que sean multiplos de 5 deben ir en un grupo y los multiplos de 3 y no de 5 en el otro
     * @param nums
     * @return verdadero o falso dependiendo de lo que diga el metodo split53Helper
     */
    public static boolean split53(int[] nums) {
        return split53Helper(0,nums,0,0);
    }

    /**
     * Este metodo ayuda a split53
     * @param index es la posicion del arreglo
     * @param nums es el arreglo original
     * @param group1 es la suma de los elementos del primer arreglo
     * @param group2 es la suma de los elementos del segundo arreglo
     * @return verdadero o falso
     */
    public static boolean split53Helper(int index, int[] nums, int group1,int group2){
        if(index>=nums.length) return group1==group2;
        if(nums[index]%5==0) return split53Helper(index+1,nums,group1+nums[index],group2);
        if(nums[index]%3==0) return split53Helper(index+1,nums,group1,group2+nums[index]);
        return split53Helper(index+1,nums,group1+nums[index],group2)||
            split53Helper(index+1,nums,group1,group2+nums[index]);
    }
}
