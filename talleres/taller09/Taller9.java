import java.util.HashMap;

public class Taller9{
    
    public static void main(String args[]){
        HashMap<String, String> empresas = new HashMap<String, String>();
        agregar(empresas,"Google","Estados Unidos");
        agregar(empresas,"La Locura", "Colombia");
        agregar(empresas,"Nokia","Finlandia");
        agregar(empresas,"Sony", "Japon");
        buscar(empresas,"Google");
        buscar(empresas,"Google1");
        System.out.println(contienekey(empresas,"Colombia"));
        System.out.println(contienekey(empresas,"Peru"));
    }
    public static void agregar(HashMap empresas,String key, String value){
        empresas.put(key,value);
    }
    
    //pedrito 3
    public static void buscar(HashMap empresas,String key){
        if(empresas.get(key)==null)  System.out.println("Compañia o Pais No existe");
        else System.out.println(empresas.get(key));
        
    }
    //pedrito 4
    public static boolean contienekey(HashMap empresas,String value){
        return empresas.containsValue(value);
    }
    
}