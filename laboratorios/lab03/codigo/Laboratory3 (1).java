import java.util.*;
 
 
public class Laboratory3 {
    public static void main(String[] args) {
        LinkedList<Integer> linked = new LinkedList<>();
        linked.addAll(Arrays.asList(new Integer[] {1, 3, 5, 7}));
 
        ArrayList<Integer> array = new ArrayList<>();
        array.addAll(Arrays.asList(new Integer[] {30, 4, 6, 8}));
         
        System.out.println(multiply(linked));
        System.out.println(multiply(array));
        System.out.println(pivote(linked));
        System.out.println(pivote(array));
        smartInsert(linked,2);
        smartInsert(array,2);
        System.out.println(multiply(linked));
        System.out.println(multiply(array));
        
        Stack neveras = new Stack();
        neveras.add(new Almacen(1,"haceb"));
        neveras.add(new Almacen(2,"lg"));
        neveras.add(new Almacen(3,"ibm"));
        neveras.add(new Almacen(4,"haceb"));
        neveras.add(new Almacen(5,"lg"));
        neveras.add(new Almacen(6,"ibm"));
        neveras.add(new Almacen(7,"haceb"));
        neveras.add(new Almacen(8,"lg"));
        neveras.add(new Almacen(9,"ibm"));
        neveras.add(new Almacen(8,"lg"));
        neveras.add(new Almacen(9,"ibm"));
        
        Queue<String> solicitudes = new LinkedList<String>();
        
        solicitudes.add("éxito");
        solicitudes.add("olimpica");
        solicitudes.add("olimpica");
        solicitudes.add("olimpica");
        solicitudes.add("olimpica");
        solicitudes.add("la14");
        solicitudes.add("la14");
        solicitudes.add("eafit");
        solicitudes.add("eafit");
        solicitudes.add("eafit");
        solicitudes.add("eafit");
        solicitudes.add("eafit");
        solicitudes.add("eafit");
        solicitudes.add("eafit");
        solicitudes.add("eafit");
        solicitudes.add("eafit");
        solicitudes.add("eafit");
        ejercicio4(neveras, solicitudes);
        
        LinkedListA list = new LinkedListA();
        list.insert(1, 0);
        list.insert(2, 0);
        list.insert(3, 2);
        list.remove(2);
        list.remove(0);
        
        LinkedList<String> fila1 = new LinkedList<>();
        fila1.add("Agustin");
        fila1.add("Daniel");
        fila1.add("Miguel");
        fila1.add("Juliana");
        LinkedList<String> fila2 = new LinkedList<>();
        fila2.add("Samuel");
        fila2.add("Juan");
        fila2.add("Julieta");
        LinkedList<String> fila3 = new LinkedList<>();
        fila3.add("Sara");
        fila3.add("Sofia");
        LinkedList<String> fila4 = new LinkedList<>();
        fila4.add("Mariana");
        fila4.add("Maria");
        cajeros(fila1,fila2,fila3,fila4);
        
    }
    public static int multiply(List<Integer> list) {
        int mult = 1;
        for(int n: list){
            mult = mult*n;
        }
        return mult;
    }
    public static void smartInsert(List<Integer> l , int data){
        boolean contains = false;
        for(int n: l){
            if(n==data) contains=true;
        }
        if(!contains) l.add(data);
    }
    public static int pivote(List<Integer> list){
        int j = 0;
        int side1 = 0;
        int side2 = 0;
        for(int n: list){
                if(j<1) side1+=n;
                if(j>1) side2+=n;
                j++;
        }
        int min = Math.abs(side1-side2);
        int pivote = 1;
        for(int i = 0; i<list.size();i++){
            side1 = 0;
            side2 = 0;
            j = 0;
            for(int n: list){
                if(j<i) side1+=n;
                if(j>i) side2+=n;
                j++;
            }
            if(Math.abs(side1-side2)<min){
                pivote = i;
                min = Math.abs(side1-side2);
            }
        }
        return pivote;
        
    }
    public static int pivote1(LinkedList<Integer> list){
        int node = list.getFirst();
        int side2 = 0;
        //for(int i = 2;i < lista.length;i++){
            //side2 += lista[i];
        //}
        //int min = Math.abs(side1-side2);
        int temp = 0;
        int pivote = 1;
        return 1;
    }
    public static void ejercicio4(Stack neveras, Queue solicitudes){
        while(neveras.size()>0&&solicitudes.size()>0){
            System.out.println(""+solicitudes.poll()+"= "+neveras.pop());
        }
    }
    public static void cajeros(LinkedList fila1,LinkedList fila2, 
            LinkedList fila3, LinkedList fila4){
        int numero = 0;
        while(fila1.size()>0||fila2.size()>0||fila3.size()>0||fila4.size()>0){
            if(fila1.size()>0){
                System.out.println(fila1.pop()+" Caja "+(numero%2+1));
                numero++;
            }
            if(fila2.size()>0){
                System.out.println(fila2.pop()+" Caja "+(numero%2+1));
                numero++;
            }
            if(fila3.size()>0){
                System.out.println(fila3.pop()+" Caja "+(numero%2+1));
                numero++;
            }
            if(fila4.size()>0){
                System.out.println(fila4.pop()+" Caja "+(numero%2+1));
                numero++;
            }
        }
    }
}