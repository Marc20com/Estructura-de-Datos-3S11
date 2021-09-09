
package Programas_6_Septiembre2;
//sirve para escaner los datos desde el teclado
import java.util.Scanner;

public class suma {
    public static void main(String[] args) {
        //empezamos darles los valores a los datos y a pedir el tamaño del vector 
        Scanner sc =new Scanner(System.in);
        System.out.println("ingresar el tamaño del vector ");
        // tam es el tamalo del vector
        int tam1= sc.nextInt();
        // ra es el valor aleatorio 
        int ra=0;
        // t es el lugar donde pondremos la suma de todos los vectores aleatorios 
        int t=0;
        
        String [] Mat= new String [tam1];
        //el for comienza dandole valor y recorriendo cada una de las secciones del vector 
        for ( int n=0; n<tam1; n++){
            //este es el codigo para colocar datos aleatorios del 200 al 100
            // este tiene el detalle de poner el valor mas el limite 
            // es de cir que si yo quiero ir al 100 al 200 tomo 101 + 100
            //el limite queda en 100 y al 101 se le suma  el 100 para el valor de 
            //200
            ra =(int) (Math.random() *250 + 100);
            if (ra>200 && ra<299){
                n--;
            }else{
            Mat [n] = " [" +ra+ "]"  ;
            //esta formula sirve para que cada valor aleatorio que salga de ra 
            // se sume a t y asi sacar el valor de la suma 
            t= ra+t;
            }
        }
        // este formato for es hecho para escribir los datos en el panel
        for(int n=0; n<tam1;n++){
            System.out.print(Mat [n]);    
        }
        System.out.println(" ");
        System.out.println("la suma es de: "+ t);
        
    }
}
