
package javaapplication3;
import java.util.Scanner;
public class JavaApplication3 {




 Scanner P = new Scanner(System.in);
 
 static class Nodo{
     String DatoNom;
     String DatoMar;
     String DatoPre;
     Nodo Sig;
 }
 Nodo Inicio;
 Nodo Fin;
 
 public void Agregar(){
     Nodo Tem = new Nodo();
     System.out.println("Agrega el nombre del Producto:");
     Tem.DatoNom=P.nextLine();
     System.out.println("Agrega la marca del Producto:");
     Tem.DatoMar=P.nextLine();
     System.out.println("Agrega el precio del Producto:");
     Tem.DatoPre=P.nextLine();
     if(Inicio==null){
       Inicio=Tem;
       Inicio.Sig=null;
       Fin=Tem;

       System.out.println("Datos Agregados...");
     }else {
         Fin.Sig=Tem;
         Tem.Sig=null;
         Fin=Tem;
         System.out.println("Datos Agregados...");
     }
 }
 public  void Mostrar(){
     Nodo Actual = new Nodo();
     int con=1;
     Actual = Inicio;
     if(Inicio!=null){
        while(Actual!=null){
            System.out.println("Numero de lista:["+ con + "]" +" "+ "Nombre:["+Actual.DatoNom+"] "+"Marca:["+Actual.DatoMar+"] "+"Precio:["+Actual.DatoPre+"]");
            Actual=Actual.Sig;
            con++;
        }
     }else{
         System.out.println("\n La lista esta vacia mi pana...");
     }
 }
 public void Buscar(){
     
 }
    public static void main(String[] args) {
        Scanner P=new Scanner(System.in);
        int Ope=0;
        JavaApplication3 n = new JavaApplication3();
        System.out.println("Bienvenidos a la aplicacion de listas doblemente enlazadas\n"
        +"Puedes elegir cualquiera de las siguientes opciones:");
        do{
            System.out.println("1.-Agregar a la lista.\n"
            +"2.-Mostrar la lista.\n"
            +"3.-Salir de la lista.");
            switch(Ope=P.nextInt()){
                case 1:
                    n.Agregar();
                    break;
                case 2:
                    n.Mostrar();
                    break;
                default: System.out.println("Esta opcion no existe mi pana");
        }
        }while(Ope!=3);
    }
    
}

