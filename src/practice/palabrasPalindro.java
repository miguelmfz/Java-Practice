/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * @author miguelmfz
 */
public class palabrasPalindro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       dividirPalabra("aerea");//Ya saben, ésta palabra puede ser solicitada
    }
    
    public static void dividirPalabra(String cadena){
        char[] caracteres = cadena.toCharArray();
        int max=cadena.length()-1,stop=cadena.length()/2;
        boolean isPal=true;
        for (int i = 0; i < max; i++) {
            if(caracteres[i]!=caracteres[max]){
                isPal=false;
            }else{
            max--;
            }
        }
        if(isPal){
            System.out.println("Esta palabra es palindroma");
        }else{
        System.out.println("Esta palabra no es palindroma");
        }
    }
    
}
