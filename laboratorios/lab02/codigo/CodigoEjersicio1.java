/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package talleres;

/**
 *
 * @author AgustinRestrepo
 */
public class CodigoEjersicio1 {
    
    public static void main(String[] args){
        
    }
    public static void runalgorithms(){
        System.out.println("Array Max Recursive");
        fibonacci(40);
        for(int i = 1; i<11;i++){
            int[] array = randarray(10000000*i);
            long startTime = System.currentTimeMillis();
            int a = arrayMaxR(array,0);
            long estimatedTime = System.currentTimeMillis() - startTime;
            //System.out.println("Time "+i*10000000+" = ");
            System.out.println(estimatedTime);
        }     
        System.out.println("Array Sum Recursive");
        fibonacci(40);
        for(int i = 1; i<11;i++){
            int[] array = randarray(10000000*i);
            long startTime = System.currentTimeMillis();
            int a = arraySumR(array,0);
            long estimatedTime = System.currentTimeMillis() - startTime;
            //System.out.println("Time "+i*10000000+" = ");
            System.out.println(estimatedTime);
        }
        fibonacci(40);
        System.out.println("Fibonacci");
        for(int i = 1; i<11;i++){
            long startTime = System.currentTimeMillis();
            long a = fibonacci(i*2+30);
            long estimatedTime = System.currentTimeMillis() - startTime;
            System.out.println("Time "+(i*2+30)+" = "+estimatedTime);
        }
        System.out.println("Array Max");
        fibonacci(40);
        for(int i = 1; i<11;i++){
            int[] array = randarray(10000000*i);
            long startTime = System.currentTimeMillis();
            int a = arrayMax(array);
            long estimatedTime = System.currentTimeMillis() - startTime;
            //System.out.println("Time "+i*10000000+" = ");
            System.out.println(estimatedTime);
        }     
        System.out.println("Array Sum");
        fibonacci(40);
        for(int i = 1; i<11;i++){
            int[] array = randarray(10000000*i);
            long startTime = System.currentTimeMillis();
            int a = arraySum(array);
            long estimatedTime = System.currentTimeMillis() - startTime;
            //System.out.println("Time "+i*10000000+" = ");
            System.out.println(estimatedTime);
        }
        System.out.println("Insertion Sort");
        fibonacci(40);
        for(int i = 1; i<11;i++){
            int[] array = randarray(10000*i);
            long startTime = System.currentTimeMillis();
            int[] a = insertionSort(array);
            long estimatedTime = System.currentTimeMillis() - startTime;
            //System.out.println("Time "+i*10000+" = ");
            System.out.println(estimatedTime);
        }
        System.out.println("Merge Sort");
        fibonacci(40);
        for(int i = 1; i<11;i++){
            int[] array = randarray(10000000*i);
            long startTime = System.currentTimeMillis();
            mergeSort(array);
            long estimatedTime = System.currentTimeMillis() - startTime;
            //System.out.println("Time "+i*10000000+" = ");
            System.out.println(estimatedTime);
        }
        
    }
    
    public static void runalgorithms(int n){
        System.out.println("Array Max Recursive");
        fibonacci(40);
        for(int i = 1; i<2;i++){
            int[] array = randarray(n);
            long startTime = System.currentTimeMillis();
            int a = arrayMaxR(array,0);
            long estimatedTime = System.currentTimeMillis() - startTime;
            System.out.println("Time "+n+" = "+estimatedTime);
        }     
        System.out.println("Array Sum Recursive");
        fibonacci(40);
        for(int i = 1; i<2;i++){
            int[] array = randarray(n);
            long startTime = System.currentTimeMillis();
            int a = arraySumR(array,0);
            long estimatedTime = System.currentTimeMillis() - startTime;
            System.out.println("Time "+n+" = "+estimatedTime);
        }
        System.out.println("Array Max");
        fibonacci(40);
        for(int i = 1; i<2;i++){
            int[] array = randarray(n);
            long startTime = System.currentTimeMillis();
            int a = arrayMax(array);
            long estimatedTime = System.currentTimeMillis() - startTime;
            System.out.println("Time "+n+" = "+estimatedTime);
        }     
        System.out.println("Array Sum");
        fibonacci(40);
        for(int i = 1; i<2;i++){
            int[] array = randarray(n);
            long startTime = System.currentTimeMillis();
            int a = arraySum(array);
            long estimatedTime = System.currentTimeMillis() - startTime;
            System.out.println("Time "+n+" = "+estimatedTime);
        }
        System.out.println("Insertion Sort");
        fibonacci(40);
        for(int i = 1; i<2;i++){
            int[] array = randarray(n);
            long startTime = System.currentTimeMillis();
            //int[] a = insertionSort(array);
            long estimatedTime = System.currentTimeMillis() - startTime;
            System.out.println("Time "+n+" = "+estimatedTime);
        }
        System.out.println("Merge Sort");
        fibonacci(40);
        for(int i = 1; i<2;i++){
            int[] array = randarray(n);
            long startTime = System.currentTimeMillis();
            mergeSort(array);
            long estimatedTime = System.currentTimeMillis() - startTime;
            System.out.println("Time "+n+" = "+estimatedTime);
        }
        
    }
    public static int arrayMaxR(int[] array, int n) {
        if(n>=array.length-1) return array[n];
        return Math.max(array[n],arrayMaxR(array,n+1));
    }
    

    public static int arraySumR(int[] array, int n){
        if(n>=array.length) return 0;
        return array[n] + arraySumR(array, n+1);
    }
    
    //fibonacci
    public static long fibonacci(int n) { 
        if(n==0)    return 0;
        if(n==1)    return 1;
        else return fibonacci(n-2)+fibonacci(n-1);
    }
    
    public static int arraySum(int[] array){
        int sum = 0;
        for(int i = 0; i<array.length;i++){
            sum+=array[i];
        }
        return sum;
    }
    public static int arrayMax(int[] array){
        int max = array[0];
        for(int i = 0; i<array.length;i++){
            max = Math.max(max, array[i]);
        }
        return max;
    }
    public static int[] insertionSort(int[] array){
        for(int i=0;i<array.length;i++){
            int j = i;
            while(j>0&&array[j-1]>array[j]){
                int temp = array[j];
                array[j] = array[j-1];
                array[j-1] = temp;
                j--;
            }
        }
        return array;
    } 
    // Sorts an array using Merge Sort
    // Taken from www.cs.cmu.edu/
	public static void mergeSort(int [ ] a)
	{
		int[] tmp = new int[a.length];
		mergeSort(a, tmp,  0,  a.length - 1);
	}


	private static void mergeSort(int [ ] a, int [ ] tmp, int left, int right)
	{
		if( left < right )
		{
			int center = (left + right) / 2;
			mergeSort(a, tmp, left, center);
			mergeSort(a, tmp, center + 1, right);
			merge(a, tmp, left, center + 1, right);
		}
	}


    private static void merge(int[ ] a, int[ ] tmp, int left, int right, int rightEnd )
    {
        int leftEnd = right - 1;
        int k = left;
        int num = rightEnd - left + 1;

        while(left <= leftEnd && right <= rightEnd)
            if(a[left] <= a[right] )
                tmp[k++] = a[left++];
            else
                tmp[k++] = a[right++];

        while(left <= leftEnd)    // Copy rest of first half
            tmp[k++] = a[left++];

        while(right <= rightEnd)  // Copy rest of right half
            tmp[k++] = a[right++];

        // Copy tmp back
        for(int i = 0; i < num; i++, rightEnd--)
            a[rightEnd] = tmp[rightEnd];
    }

    
    public static int[] randarray(int size){
        int[] array = new int[size];
        for(int i = 0; i<size;i++){
            array[i] = (int)(Math.random()*100000);
        }
    
        return array;
    } 
}
