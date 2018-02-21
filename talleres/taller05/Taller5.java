public class Taller5 {  
    
    public static void main(String args[]){
        for(int i = 0; i<100;i++){
            long startTime = System.currentTimeMillis();
            //mul(10000*i);
            long estimatedTime = System.currentTimeMillis()-startTime;
            //System.out.println(estimatedTime);
        }
        for(int i = 0; i<50; i++){
            long startTime = System.currentTimeMillis();
            //suma(new int [1000000*i]);
            long estimatedTime = System.currentTimeMillis()-startTime;
            //System.out.println(estimatedTime);
        }
        for(int i = 0; i<100; i++){
            int n = i*1000;
            int[] array = new int[n];
            for(int j = 1; j<=n;j++){
                array[n-j] = j;
            }
            long startTime = System.currentTimeMillis();
            insertionSort(array);
            long estimatedTime = System.currentTimeMillis()-startTime;
            System.out.println(estimatedTime);
        }
        
        
    }
    //Sumar elementos de un arreglo
    public static int suma (int[]array){
        int sum = 0;
        for(int i = 0; i<array.length;i++){
            sum += array[i];
        }
        return sum;
    }
    
    
    public static void mul (int num){
        int[] array = new int[num];
        for(int i = 0; i<num;i++){
            for(int j = 0; j<i;j++){
                array[j] = i*j;
            }
        }
    }
    
    
    //Ordenamiento por inserción
    public static int[] insertionSort (int[] array){
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
}