
package tarea_30_09_2021;

import java.util.Scanner;

public class Tarea_30_09_2021 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Mu=0,Tope=0, OP=0;
        System.out.println("Bienvenidos a la union con pilas del grupo 3S11"); 
        System.out.println("Coloca el tamaño de las pilas A y B:");
        Mu=sc.nextInt();
     
        int[] pilaA = new int [Mu];
        int[] pilaB = new int [Mu];
        int[] pilaC = new int [Mu];
        do{
            System.out.println("\n¿Cual es la accion que quieres realizar?\n"
            +"Coloca el numero:\n"
            +"1.- Llenar las pilas A y B\n"
            +"2.- Mostrar las pilas A y B\n"
            +"3.- Vaciar las Pilas A y B\n"
            +"4.- Unir las Pilas\n"
            +"5.- Mostrar la Pila C\n"
            +"6.- SALIR");
            switch (OP=sc.nextInt()){
                case 1: 
                  System.out.println("valores agregados");
                  for (Tope=0; Tope<Mu;Tope++){
                      pilaA[Tope]=(int)(Math.random()*100+1);
                    }
                  for (Tope=0; Tope<Mu;Tope++){
                      pilaB[Tope]=(int)(Math.random()*100+100);
                    }
                  System.out.println("Pila llena { ° v °}  ........ ");
                   break;
                case 2:
                  if(Mu==Tope){
                  System.out.println("\n Pila A");
                  for(int i = Mu-1; i>=0; i--) {
                    System.out.println(" " + pilaA[i]);
                  }
                  
                  System.out.println("\n Pila B");
                  for(int i = Mu-1; i>=0; i--) {
                    System.out.println(" " + pilaB[i]);
                  }
                  }
                  else {
                      System.out.println("Pilas vacias { ° - °}........ ");
                  }
                  break;
                case 3:
                  if (Mu==Tope ){
                     for (int i=Mu-1; i<=0;i--){
                        Mu--;
                       }
                    }
                    else{
                     System.out.println("Pila vacia { ° - °}........ ");
                    }
                  break;
                case 4:
                    if (Mu==Tope){
                        System.out.println("La pila C esta llena [ ° v °].......");
                        int T=0;
                        for (int i=0;i>Mu;i++){
                            pilaC[T]=(int)(pilaA[i]+pilaB[i]);
                            Mu++;
                        }
                    }
                    else {
                        System.out.println("Las Pilas A y B estan vacias { ° - °}........ ");
                    }
                    break;
                case 5:
                  if(Mu==Tope){
                      System.out.println("\n Pila C");
                      for(int i = Mu-1; i>=0; i--) {
                      System.out.println(" " + pilaC[i]);
                       }
                  }else{
                      System.out.println("Pila vacia { ° - °}........ ");
                  }
                   break;
            }
        }while (OP !=6);
        System.out.println("adios { ° w °}........");
    }
   
}
