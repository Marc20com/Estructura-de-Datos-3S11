package eliminar_nodo;

import java.util.Scanner;

public class Eliminar_nodo {

    Scanner sc = new Scanner(System.in);
    private String n;

    static class Nodo {

        String dato;
        Nodo sig;
    }
    Nodo inicio = null;
    Nodo fin;
    Nodo Tem;
    Nodo des;

    public void agregar() {

        if (inicio == null) {
            System.out.println("agregar dato mi pana (° v ° ): ");
            inicio = new Nodo();
            inicio.dato = sc.nextLine();
            inicio.sig = null;

        } else {
            System.out.println("esta opcion no se puede realizar, lo siento mi pana ( ° ^ °).......");
        }

    }

    public void agregar_atras_de_inicio() {
        if (inicio != null) {
            System.out.println("agregar dato mi pana (° v ° ): ");
            fin = new Nodo();
            fin.dato = sc.nextLine();
            fin.sig = inicio;
            inicio = fin;
        } else {
            System.out.println("esta opcion no se puede realizar, lo siento mi pana ( ° ^ °).......");
        }
    }

    public void agregar_despues_de_inicio() {
        if (inicio != null) {
            System.out.println("agregar dato mi pana (° v ° ): ");
            fin = new Nodo();
            fin.dato = sc.nextLine();
            fin.sig = null;

            des = inicio;
            while (des.sig != null) {
                des = des.sig;
            }

            des.sig = fin;
        } else {
            System.out.println("esta opcion no se puede realizar, lo siento mi pana ( ° ^ °).......");
        }

    }

    public void mostrar() {
        Nodo inicioNodo = new Nodo();
        inicioNodo = inicio;
        if (inicio != null) {
            while (inicioNodo != null) {
                System.out.print(inicioNodo.dato + " ");
                inicioNodo = inicioNodo.sig;
            }
        } else {
            System.out.println("\n la lista se encuentra vacia...");
        }
    }

    public void agregar_entre_datos() {
        // Esta queda pendiente ya que no me salio jeje.
        if (inicio != null) {
            System.out.println("Despues de que dato lo quieres agregar (° O °)......");

            fin.dato = sc.nextLine();

            if (fin.dato == fin.dato) {
                System.out.println("agregar dato mi pana (° v ° ): ");
                fin = new Nodo();
                fin.dato = sc.nextLine();
                fin.sig = fin;
            } else {

                fin = fin.sig;
            }

        }
    }

    public void eliminar_el_nodo() {
        System.out.println("Que dato desaes eliminar");
        n = sc.nextLine();
            Nodo anterior = new Nodo();
            Nodo temporal = new Nodo();
            temporal=inicio;
            anterior = null;
            while (temporal != null) {
                if(temporal.dato == n){
                    if(temporal== inicio){
                        inicio= inicio.sig;
                    }else{
                        anterior.sig = temporal.sig;
                    }
                }
                anterior= temporal;
                temporal = temporal.sig;
                

            }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opt = 0;
        Eliminar_nodo n = new Eliminar_nodo();
        System.out.println("Bienvenidos al agreador de nodos del grupo 3S11\n"
                + "Puedes elegir entre las siguientes opciones de Agregat en nodo\n");
        do {
            System.out.println("\n1.Agregar nodo Inicial \n"
                    + "2.Agregar un nodo antes del inicial\n"
                    + "3.Agregar un nodo despues del inicial\n"
                    + "4.Agregar un nodo entre otros nodos\n"
                    + "5.Mostrar los nodos\n"
                    + "6.Eliminar nodo en especifico\n"
                    + "7.Salir de Programa");
            switch (opt = sc.nextInt()) {
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
                case 6:
                    n.eliminar_el_nodo();
                    break;
            }
        } while (opt != 7);
    }

}
