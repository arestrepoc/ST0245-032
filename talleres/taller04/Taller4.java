public class Taller4 {
    
    public static void main(String args[]){
        int[] a = {1,2,3,8,10,4};
        int[] b = {18,8,10,14};
        
        //System.out.println(arrayMax(a,5));
        //System.out.println(groupSum(0,b,26));
        //System.out.println(fibonacci(10));
        System.out.println("Array Max");
        for(int i = 1; i<21;i++){
            int[] array = randarray(i*700);
            long startTime = System.currentTimeMillis();
            arrayMax(array,array.length-1);
            long estimatedTime = System.currentTimeMillis()-startTime;
            System.out.println("Time "+i+" = "+estimatedTime);
        }
        System.out.println("Group Sum");
        for(int i = 12; i<33;i++){
            int[] array = randarray(i);
            long startTime = System.currentTimeMillis();
            groupSum(0,array,(int)(450));
            long estimatedTime = System.currentTimeMillis()-startTime;
            System.out.println("Time "+(i-12)+" = "+estimatedTime);
        }
        System.out.println("Fibonacci");
        for(int i = 1; i<21;i++){
            long startTime = System.currentTimeMillis();
            fibonacci(i*3);
            long estimatedTime = System.currentTimeMillis()-startTime;
            System.out.println("Time "+i+" = "+estimatedTime);
        }
        
    }
    
    //ArrayMax
    public static int arrayMax(int[] array, int n) {
        int max = array[n];
        int temp;
        if(n!= 0){
            temp = arrayMax(array, n-1);
            if(temp>max) max = temp;
        }
        return max;
    }
    
    //groupSum
    public static boolean groupSum(int start, int[] nums, int target) {
        if(start == nums.length){
            return target==0;
        }
        else{
            return groupSum(start+1,nums,target-nums[start])||
            groupSum(start+1,nums,target);
        }
    }
    
    //fibonacci
    public static long fibonacci(int n) { 
        if(n==0)    return 0;
        if(n==1)    return 1;
        else return fibonacci(n-2)+fibonacci(n-1);
    }
    
    public static int[] randarray(int size){
        int[] array = new int[size];
        for(int i = 0; i<size;i++){
            array[i] = (int)(Math.random()*500);
        }
    
        return array;
    }   
}