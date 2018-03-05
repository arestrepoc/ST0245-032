/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package talleres;

/**
 *
 * @author AgustinRestrepo
 */
public class CodigoEjersicio2 {
    
    public int matchUp(int[] nums1, int[] nums2) {
        int count = 0;
        for(int i = 0; i<nums1.length;i++){
            if(nums1[i]-nums2[i]<3&&nums1[i]-nums2[i]>0
                ||nums2[i]-nums1[i]<3&&nums2[i]-nums1[i]>0) count++;
         }
        return count;
    }

    public boolean sum28(int[] nums) {
        int sum = 0;
        for(int i = 0; i<nums.length;i++){
            if(nums[i]==2) sum++;
        }
        return sum==4;
    }
    
    public boolean haveThree(int[] nums) {
        int counter = 0;
        for(int i = 0; i<nums.length;i++){
            if(nums[i]==3){
            i++;
            counter++;
            }
        }
        return counter==3;
    }
    
    public int[] fizzArray3(int start, int end) {
        int[] a = new int[end-start];
        for(int i = start; i<end;i++){
            a[i-start]=i;
        }
        return a;
    }
    
    public int[] post4(int[] nums) {
        int[] array = new int[nums.length];
        int index = 0;
        for(int i = 0; i<nums.length;i++){
            if(nums[i]==4){
                index = i;
                array = new int[nums.length-i-1]; 
            }
            if(i<nums.length-1) array[i-index]=nums[i+1];
        }
      return array;
    }
    
    
    
    
    public int maxSpan(int[] nums) {
        int max = 0;
        for(int i = 0; i<nums.length;i++){
            for(int j = i;j<nums.length;j++){
                if(nums[j]==nums[i]) max = Math.max(max,j-i+1);
            }
        }
        return max;
    }
    public int[] fix34(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]==3){
                for(int j = 1; j<nums.length;j++){
                    if(nums[j]==4&&nums[j-1]!=3){
                        nums[j]=nums[i+1];
                        nums[i+1]=4;
                    }
                }
            }
        }
        return nums;
    }
    public boolean linearIn(int[] outer, int[] inner) {
        for(int i=0; i<inner.length;i++){
            boolean appears = false;
                for(int j=0;j<outer.length;j++){
                    appears = appears||inner[i]==outer[j];
                }
            if(!appears) return false;
        }
        return true;
    }
    public int[] squareUp(int n) {
        int[] array = new int[n*n];
        for(int i = 0;i<n;i++){
            for(int j = 0; j<n;j++){
                if(n-1-i<=j) array[i*n+j]=n-j;
            }
        }
        return array;
    }
    public int[] seriesUp(int n) {
        int[] array = new int[n*(n+1)/2];
            for(int i = 0;i<n;i++){
                for(int j = 0; j<=i;j++){
                    array[(i*(i+1)/2+j)]=j+1;
                }
            }
        return array;
    }



}
