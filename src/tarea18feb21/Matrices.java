
package tarea18feb21;

/**
 *
 * @author RaulSierra
 */
import java.util.Arrays;
import java.util.Scanner;
public class Matrices {

    public static void main(String[] args) {
        System.out.println("Se van a solictar los valores para la diagonal superior de una matriz 3 x 3");
        Scanner n = new Scanner(System.in);
        
        int matriz [][]=new int [3][3];
        for(int i=0;i<matriz.length;i++){
            System.out.println("Escriba el valor para la fila "+i+" y columna "+i+" de la matriz");
            matriz[i][i]=n.nextInt();
                
                
               
            
        }
        System.out.println("La diagonal de la matriz");
        muestraMatriz(matriz); 
    }
    public static void muestraMatriz(int[][] matriz){
    
        for(int i=0;i<matriz.length;i++){
            System.out.println(Arrays.toString(matriz[i]));
        }
            
        
        
    }
}

