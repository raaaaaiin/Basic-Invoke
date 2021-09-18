/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invoke;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

/**
 *
 * @author Reyn
 */
public class Invoke {
    public static trye invokez = new trye();
    /**
     * @param args the command line arguments
     */
    
        public static Scanner sc = new Scanner(System.in);
        public static int first;
        public static int second;
    public static void main(String[] args)  {
       
        System.out.print("input first num:");
        first = sc.nextInt();
        System.out.print("input second num:");
        second = sc.nextInt();
        infiloop();
    }
    public static void invoke(String value){
        Class[] cArg = new Class[2];
        trye invokez = new trye();
        cArg[0]=Integer.TYPE;
        cArg[1]=Integer.TYPE;
    try{
        Object arglist[] = new Object[2];
        arglist[0]= new Integer(first);
        arglist[1]= new Integer(second);
        Method mPotato = invokez.getClass().getMethod(value,cArg);
         Integer retval = (Integer) mPotato.invoke(invokez,arglist);
        System.out.println("Called " + value +"() result: "+retval);
        }catch(Exception ex){
            System.out.println(ex);
        }
} 
    public static void infiloop(){
        sc = new Scanner(System.in);
        String asd;
        System.out.print("Input The Method Name:");
          asd = sc.nextLine();
          invoke(asd);
          infiloop();
    }
    
    
}
