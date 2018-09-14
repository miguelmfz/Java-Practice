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



public class ordenamientoPorBurbuja {
    
    /**
    *   Resolución lógica:Tenemos un Vector de N posiciones, se nos pide que lo organizemos de menor a mayor,
    *   utilizando el metodo de ordenamiento, conocido como burbuja.
    *   Declaro dos ciclos for, el numero maxima de iteracciones del primero será,
    *   tamaño del array -1(Menos uno), el número de iteracciones del segundo será decendente.
    * 
    */
 
    public static void main(String[] args) {
       int [] intArray = {32,-4,43,24,2,1}; 
       
       
        for (int ultimoIndex = intArray.length-1; ultimoIndex>0; ultimoIndex--) {//Primer ciclo donde se excluye el ultimo elemento
            for (int i = 0; i < ultimoIndex; i++) {//Segundo ciclo donde el tope es decendente
                if(intArray[i]>intArray[i+1]){//Validación.
                    intercambiar(intArray,i,i+1);
                }
            }
   
        }
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }
    
    public static void intercambiar(int[]array,int i, int j){
        if(i==j){
            return;
        }
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    
    }
    
    
    
}
