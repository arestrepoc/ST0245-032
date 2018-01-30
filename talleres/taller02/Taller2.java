package talleres;

public class Taller2 {
    
        public static void main(String args[]){
            System.out.println(gcd(1785,546));
            int[] a = {1,2,3,5};
            System.out.println(SumaGrupo(0,a,12));
            combinations("abc");
        }
	
	//Ejercicio 1	Algoritmo de Euclides
	public static int gcd(int p, int q){
		if(p%q == 0)return q;
                else return gcd(q,p%q); 
            }
	
	
	
	//Ejercicio 2	SumaGrupo	
	public static boolean SumaGrupo(int start, int[] nums, int target) {
		if(start==nums.length){
                    return target == 0;
                }
                else{
                    return SumaGrupo(start+1,nums,target-nums[start])||
                            SumaGrupo(start+1,nums,target);
                    
                }
	}
	
	
	//Ejercicio 3 	Combinaciones de letras de una cadena
	public static void combinations(String s) { 
		combinationsAux("", s); 
	}
	
	
	private static void combinationsAux(String prefix, String s) {  
		if(s.length()== 0){
                    System.out.print(prefix+" ");
                }
                else{
                    combinationsAux(prefix+s.charAt(0),s.substring(1));
                    combinationsAux(prefix,s.substring(1));
                }
                
	}

}