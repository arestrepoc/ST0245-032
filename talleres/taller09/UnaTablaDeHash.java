//Una tabla de hash donde la llave es un String y el valor un int.
public class UnaTablaDeHash
{
    // Ojo, esta tabla definida así no permite manejar las colisiones
    private String[] tabla;
    
    public UnaTablaDeHash(){
        tabla = new String[10];
    }
    
    public static void main(String args[]){
        UnaTablaDeHash tabla1 = new UnaTablaDeHash();
        tabla1.put("0a");
        tabla1.put("1b");
        tabla1.put("2c");
        tabla1.put("3d");
        System.out.println(tabla1.get(1));
        System.out.println(tabla1.get(2));
        System.out.println(tabla1.search("3d"));
    }
    
    // Ojo, esta función hash es muy ingenua
    private int funcionHash(String k){
       return ((int) k.charAt(0))-48;
    }
    
    // Ojo con las colisiones
    public String get(int k){
       return tabla[k];
    }
    public boolean search(String v){
       return v.equals(tabla[funcionHash(v)]);
    }
    // Ojo con las colisiones
    public void put(String v){
       tabla[funcionHash(v)]= v;
    }

}