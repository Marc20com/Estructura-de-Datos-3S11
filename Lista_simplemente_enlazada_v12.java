
package lista_simplemente_enlazada_v1.pkg2;

import java.util.Scanner;

public class Lista_simplemente_enlazada_v12 {
    Scanner sc = new Scanner(System.in);

    static class Nodo{
        String dato;
        Nodo sig;
    }
    Nodo inicio = null;
    Nodo fin;
    Nodo Tem;
    Nodo des;
    public void agregar(){

      if(inicio  == null){
       System.out.println("agregar dato mi pana (° v ° ): ");
       inicio = new Nodo();
       inicio.dato = sc.nextLine();
       inicio.sig = null;

      }else{
       System.out.println("esta opcion no se puede realizar, lo siento mi pana ( ° ^ °).......");
      }
    
      
    }
    public void agregar_atras_de_inicio(){
       if(inicio  != null){
       System.out.println("agregar dato mi pana (° v ° ): ");
       fin = new Nodo();
       fin.dato = sc.nextLine();
       fin.sig = inicio;
       inicio = fin;
       } else {
        System.out.println("esta opcion no se puede realizar, lo siento mi pana ( ° ^ °).......");
       }  
    }
    public void agregar_despues_de_inicio(){
      if(inicio  != null){
      System.out.println("agregar dato mi pana (° v ° ): ");
      fin = new Nodo();
      fin.dato = sc.nextLine();
      fin.sig = null;
      
      des = inicio;
      while (des.sig != null)
         des = des.sig;

      des.sig = fin;
      }else {
        System.out.println("esta opcion no se puede realizar, lo siento mi pana ( ° ^ °).......");  
      }
      
    }
    public void mostrar(){
        Nodo inicioNodo = new Nodo();
        inicioNodo = inicio; 
        if(inicio  != null){
            while(inicioNodo != null){
                System.out.print (inicioNodo.dato+ " ");
                inicioNodo = inicioNodo.sig;
            }
        }else{
            System.out.println("\n la lista se encuentra vacia...");
        }        
    }
    
    public void agregar_entre_datos(){
       // Esta queda pendiente ya que no me salio jeje.
       if(inicio  != null){
       System.out.println("agregar dato mi pana (° v ° ): ");
       fin = new Nodo();
       fin.dato = sc.nextLine();
       System.out.println("Despues de que dato lo quieres agregar (° O °)......");
       fin.dato= sc.nextLine();
       des = inicio;
       while (des.dato.equals (fin.dato ) == false)
         des = des.sig;

      fin.sig = des.sig;
      des.sig = fin;
       } else {
        System.out.println("esta opcion no se puede realizar, lo siento mi pana ( ° ^ °).......");
       }  
    }
     
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opt=0;
        Lista_simplemente_enlazada_v12 n = new Lista_simplemente_enlazada_v12();
        System.out.println("Bienvenidos al agreador de nodos del grupo 3S11\n"
                    + "Puedes elegir entre las siguientes opciones de Agregat en nodo\n");
        do{
            System.out.println("\n1.Agregar nodo Inicial \n"
                    + "2.Agregar un nodo antes del inicial\n"
                    + "3.Agregar un nodo despues del inicial\n"
                    + "4.Agregar un nodo entre otros nodos\n"
                    + "5.Mostrar los nodos\n"
                    + "6.Salir de Programa");
            switch(opt=sc.nextInt()){
                case 1:
                    n.agregar();
                    break;
                case 2:
                    n.agregar_atras_de_inicio();
                    break;
                case 3:
                    n.agregar_despues_de_inicio();
                    break;
                case 4:
                    n.agregar_entre_datos();
                    break;
                case 5:
                    n.mostrar();
                    break;
            }
        }while(opt != 6);
    }
    
}
