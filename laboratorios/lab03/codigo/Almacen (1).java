/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mariaelvira
 */
public class Almacen {
    public int code;
    public String name;
    
    public Almacen(int code,String name){
        this.code = code;
        this.name = name;
    }
    public String toString(){
        return code+" "+name;
    }
}
