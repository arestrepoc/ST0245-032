/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author Agustin Restrepo
 */
public class Laboratory32 {
    public static void main(String args[]){
        String str1 = "This_is_a_[Beiju]_text";
        String str2 = "[[]][][]Happy_Birthday_to_Tsinghua_University";
        String str3 = "asd[fgh[jkl";
        String str4 = "asd[fgh[jkl[";
        String str5 = "[[a[[d[f[[g[g[h[h[dgd[fgsfa[f";
        String str6 = "asd[gfh[[dfh]hgh]fdfhd[dfg[d]g[d]dg";
        System.out.println(text(str1));
        System.out.println(text(str2));
        System.out.println(text(str3));
        System.out.println(text(str4));
        System.out.println(text(str5));
        System.out.println(text(str6));
    }
    
    public static String text(String str){
        LinkedList<Character> list = new LinkedList<>();
        for(int i =0;i<str.length();i++){
            list.add(str.charAt(i));
        }
        boolean beg = true;
        String ret = "";
        String temp = "";
        while(list.size()>0){
            if(list.peek()=='['){
                if(beg) ret = temp+ret;
                else ret = ret+temp;
                beg = true;
                temp = "";
                list.pop();
            }
            else if(list.peek()==']'){
                if(beg) ret = temp+ret;
                else ret = ret+temp;
                beg = false;
                temp = "";
                list.pop();
            }
            else if(beg){
                temp += list.pop();
            }
            else{
                temp += list.pop();
            }
        }
        if(beg) ret = temp+ret;
        else ret = ret+temp;
        return ret;
    }
}
