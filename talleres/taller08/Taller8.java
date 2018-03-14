import java.util.*;

/**
 *
 * @AgustinRestrepo 
 */
public class Taller8 {
	
    public static void main(String args[]){
        /*Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.toString());
        System.out.println(stack.size());
        inversa(stack);
        System.out.println(stack.toString());
        Queue<String> queue = new LinkedList<String>();
        queue.add("Juan");
        queue.add("María");
        queue.add("Pedro");
        cola(queue);
        */
        System.out.println(polaca("3 5 * 2 +"));
        System.out.println(polaca("6 5 - 4 +"));
    }
    public static Stack<Integer> inversa (Stack<Integer> stack){
        int[] list = new int[stack.size()];
        int i = 0;
        while(!stack.isEmpty()){
            list[i] = stack.pop();
            
            i++;
        }
        for(int j = 0; j<list.length;j++){
            stack.push(list[j]);
        }
        return stack;
    }
    
    
    //Punto 2
    public static void cola (Queue<String> queue){
        if(!queue.isEmpty()) {
            System.out.println("“Atendiendo a "+queue.poll());
            cola(queue);
        }
    }
    
    
    //notacion polaca
    public static int polaca  (String string){
        String[] list = string.split(" ");
        Stack<String> stack = new Stack<String>();
        stack.add(list[0]);
        for(int i = 1; i<list.length;i++){  
            if(list[i].equals("*")){
                int n = Integer.parseInt(stack.pop())*Integer.parseInt(stack.pop());
                stack.add(Integer.toString(n));
            }
            else if(list[i].equals("+")){
                int n = Integer.parseInt(stack.pop())+Integer.parseInt(stack.pop());
                stack.add(Integer.toString(n));
            }
            else if(list[i].equals("-")){
                int n = -Integer.parseInt(stack.pop())+Integer.parseInt(stack.pop());
                stack.add(Integer.toString(n));
            }
            else if(list[i].equals("/")){
                int n = Integer.parseInt(stack.pop())/Integer.parseInt(stack.pop());
                stack.add(Integer.toString(n));
            }
            else{
                stack.add(list[i]);
            }
        }
        return Integer.parseInt(stack.pop());
    }
}