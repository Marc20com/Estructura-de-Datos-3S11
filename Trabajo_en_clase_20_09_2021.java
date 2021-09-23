
package trabajo_en_clase_20_09_2021;

import java.util.Scanner;

public class Trabajo_en_clase_20_09_2021 {

    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc = new Scanner(System.in);
        int tope = 0, OP=0, Mayor=0;
        char Letrado=0;
        char letra = 0;
        char[] pila = new char [26];
        System.out.println("Bienvenidos al alfabeto con pilas del grupo 3S11"); 
        do{
            System.out.println("elija una de las opciones que tenemos a continuacion\n"
               + "1.- Agregar\n"
               + "2.- Eliminar\n"
               + "3.- Mostrar\n"
               + "4.- Repetido\n"
               + "5.- Salir del Programa");
            switch (OP=sc.nextInt()){
                case 1 :
                    for (int a=0;a<26;a++){
                    letra=(char) (Math.random() *25+ 65);
                     if (tope <26) {
                     pila[tope]=letra;
                     letra++;tope++;
                    }else{
                      System.out.println("Pila llena { ° v °}  ........ " + tope);
                    }       
                    }  System.out.println("Pila llena { ° v °}  ........ " + tope);
                    break;
                case 2 : 
                    if (tope >0 ){
                      System.out.println("Dato eliminado { ° ^ °}........ " + tope);
                      tope--;
                    }else{
                      System.out.println("Pila vacia { ° o °}........ " + tope);
                    }break;
                case 3:
                    if(tope > 0){
                        for (int i= tope-1; i>=0; i--){
                        System.out.println(" "+ pila[i]);
                        
                        }
                        
                    }else{
                        System.out.println("pila vacia { ° - °}........ "+ tope);
                    }
                    break;
                case 4: 
                    if(tope >0){
                       for(int i=0; i<pila.length; i++){
                         char letraAc = pila[i];
                         int contador = 0;
                         for (int j =0; j<pila.length; j++){
                            if (pila[j] == letraAc){
                             contador++;
                            }
                            if(Mayor < contador){
                             Mayor= contador;
                             Letrado = letraAc;
                            }
                         }
                         }
                        System.out.println("Las letras"+ Letrado);\\Un no soluciono el problema de darme los datos que esten repetidos si meda el mas repetido
                        System.out.println("Se repite: "+ Mayor);\\pero no las letras solo da una °n°
         
                    }else {
                      System.out.println("pila vacia { ° - °}........ "+ tope);  
                    } 
                    break;
            }
        } while(OP !=5);
         System.out.println("adios { ° w °}........");
    }
    
}
