
/**
 * Taller 1 punto 1
 * Por: Agustin Restrepo y Sebastian Gonzalez
 */
public class Counter
{
    private String nombre;
    private int contador;
    public Counter(String id){
        String nombre=id;
        contador=0;
    }
    public void incrementar(){
        contador+=1;
    }
    public int incrementos(){
        return contador;
    }
    public String toString(){
        return nombre + ", "+contador;
    }
}
