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
public class Taller3 {
        
        public static void main(String args[]){
            torresDeHannoi(3);
            combinations("abc");
            System.out.println();
            permutation("abc");
            System.out.println();
            permutation2("abc");
        }
	//Ejercicio 1	
	
	public static void torresDeHannoi(int n) {
		torresDeHannoiAux(n, 1, 2, 3);
	}
	private static void torresDeHannoiAux(int n, int origen, int intermedio, int destino) {
		if(n==1){
                    System.out.println("Mover : "+origen+" a "+destino);
                }
                else{
                    torresDeHannoiAux(n-1,origen,destino,intermedio);
                    torresDeHannoiAux(1,origen,intermedio,destino);
                    torresDeHannoiAux(n-1,intermedio,origen,destino);
                }
	}
		

	public static void combinations(String s) { 
		combinationsAux("", s); 
		}
	private static void combinationsAux(String prefix, String s) {  
		if(s.equals("")){
                    System.out.print(prefix+" ");
                }
                else{
                    combinationsAux(prefix+s.charAt(0),s.substring(1));
                    combinationsAux(prefix,s.substring(1));
                }
	}
		
		
	//Ejercicio 3	
	
	public static void permutation(String str) {
		permutation("", str); 
	}
	
	private static void permutation(String prefix, String str) {
                if(str.length()==1){
                    System.out.print(str+prefix+" ");
                }
                else{
                    for(int i = 0; i< str.length();i++){
                            permutation(prefix+str.charAt(i),str.substring(0,i)+str.substring(i+1));
                    }
                }
	}
        
        public static void permutation2(String str) {
		permutation2("", str); 
	}
	
	private static void permutation2(String prefix, String str) {
                if(prefix.length()==str.length()){
                    System.out.print(prefix+" ");
                }
                else{
                    for(int i = 0; i< str.length();i++){
                            permutation2(prefix+str.charAt(i),str);
                    }
                }
	}
	
	
}
