
package programas_6_septiembre;
 //sirve para escaner los datos desde el teclado        
import java.util.Scanner;

public class Programas_6_septiembre {

    public static void main(String[] args) {
        // es esta parte se le otorga valores a cada dijito ademas de empezar 
        // a estructurar los datos de cada seccion
        Scanner sc =new Scanner(System.in);
        System.out.println("ingresar el tamaño de la matriz ");
        System.out.println("Primer valor");
        int tam1= sc.nextInt();
        System.out.println("Segundo valor");
        int tam2= sc.nextInt();
        //el tam 1 y 2 son el tamano de nuestra matriz 
        //miestra que el ra es el valor de los datos aleatoreos y donde los vamos 
        //almacenar
        int ra=0;
        //proporcionamos un valor a Mat para ejercutar el tamaño de la matriz 
        String [][] Mat = new String [tam1][tam2];
        //int [][] Mat = new int[tam1][tam2]; ejemplo del profe
        //empezamos con el siclo For para empezar a darle un valor a cada uno de 
        // nuestras matrices o secciones de ellas 
        for(int n=0; n<tam1;n++){
            for(int m=0; m<tam2;m++){ 
            //este es el codigo para colocar datos aleatorios del 1 al 100
            ra =(int) (Math.random() * 100);
        
            //aqui se coloca cada uno de los valores aleatorios en cada seccion
            //Mat [n][m]= (int) (Math.random() * (101));  ejemplo del profe 
            Mat [n][m]= " ["+ ra+ "]";
            }
        }
        // este formato for es hecho para escribir los datos en el panel
        for(int n=0; n<tam1;n++){
            for(int m=0; m<tam2;m++){
                System.out.print(Mat [n][m]);
            }
            System.out.println(" ");
        }
    }
}
