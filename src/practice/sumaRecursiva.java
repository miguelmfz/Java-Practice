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
public class sumaRecursiva {

    /**
     * Podriamos aplicar varias operaciones de la misma manera, creo que fui egoista al llamrle suma, por ejemplo el factorial de un nùmero N, solo
     * habria que cambiar la operacion  y el nombre de las variables.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero = 10;//Este numero puede ser pedido o quemado.
        int suma=recursivaSuma(numero);
        System.out.println(suma);
    }
    public static int recursivaSuma(int numero){
        int res;
        if(numero==1){
            return 1;
        }else{
        res=numero+recursivaSuma(numero-1);
        }
        return res;
    }
}
