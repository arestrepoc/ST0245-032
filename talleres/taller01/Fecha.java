
/**
 * Taller 1 punto 3
 * Por: Agustin Restrepo y Sebastian Gonzalez
 */
public class Fecha
{
    private int dia;
    private int mes;
    private int año;
    public Fecha(int dia, int mes, int año){
        this.dia=dia;
        this.mes=mes;
        this.año=año;
    }
    public String toString(){
        return mes+"//"+dia+"//"+año;
    }
    public void compararFecha(Fecha fecha){
        if(this.año>fecha.año) System.out.println("La primera fecha es mas reciente que la segunda");
        if(this.año<fecha.año) System.out.println("La primera fecha es mas vieja que la segunda");
        if(this.año==fecha.año&&this.mes==fecha.mes&&this.dia==fecha.dia) System.out.println("La fecha es igual");
        if(this.año==fecha.año&&this.mes==fecha.mes&&this.dia>fecha.dia)System.out.println("La primera fecha es mas reciente que la segunda");
        if(this.año==fecha.año&&this.mes==fecha.mes&&this.dia<fecha.dia)System.out.println("La primera fecha es mas vieja que la segunda");
        if(this.año==fecha.año&&this.mes>fecha.mes)System.out.println("La primera fecha es mas reciente que la segunda");
        if(this.año==fecha.año&&this.mes<fecha.mes)System.out.println("La primera fecha es mas vieja que la segunda");
    }
}
