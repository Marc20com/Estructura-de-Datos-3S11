package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {

    static class Nodo {

        int Dato;
        Nodo Sig;
    }
    Nodo Inicio;
    Nodo Fin;
    int c = 0;

    public void Datosram() {

        while (c <= 500) {
            Nodo Tem = new Nodo();
            Tem.Dato = (int) (Math.random() * 500);
            if (Inicio == null) {
                Inicio = Tem;
                Inicio.Sig = null;
                Fin = Tem;

            } else {
                Fin.Sig = Tem;
                Tem.Sig = null;
                Fin = Tem;
            }
            c++;
        }
        System.out.println("Datos Agregados");
    }

    public void Mostrar() {
        Nodo Actu = new Nodo();
        Actu = Inicio;
        if (Inicio != null) {
            while (Actu != null) {
                System.out.println("{" + Actu.Dato + "}");
                Actu = Actu.Sig;
            }
        } else {
            System.out.println("La Lista esta esta vacia mi pana");
        }
    }

    public void OrdenarMeaMa() {
        if (Inicio != null) {
            int aux;
            for (int Conta = 0; Conta < c; Conta++) {
                Nodo Actual = new Nodo();
                Nodo Ante = new Nodo();
                Ante = Inicio;
                Actual = Ante.Sig;
                for (int j = 0; j < c; j++) {
                    for (int i = 0; i < c; i++) {
                        while (Ante.Sig != null) {
                            if (Ante.Dato > Actual.Dato) {
                                aux = Ante.Dato;
                                Ante.Dato = Actual.Dato;
                                Actual.Dato = aux;
                            }
                            Ante = Actual;
                            Actual = Actual.Sig;
                        }
                        break;

                    }
                }
            }
            System.out.println("Los datos fueron ordenados.....");
        } else {
            System.out.println("La lista esta vacia, por lo tanton esta opcion no es posible....");
        }

    }

    public void OrdenarMaaMe() {
        if (Inicio != null) {
            int aux;
            for (int Conta = 0; Conta < c; Conta++) {
                Nodo Actual = new Nodo();
                Nodo Ante = new Nodo();
                Ante = Inicio;
                Actual = Ante.Sig;
                for (int j = 0; j < c; j++) {
                    for (int i = 0; i < c; i++) {
                        while (Ante.Sig != null) {
                            if (Ante.Dato < Actual.Dato) {
                                aux = Ante.Dato;
                                Ante.Dato = Actual.Dato;
                                Actual.Dato = aux;
                            }
                            Ante = Actual;
                            Actual = Actual.Sig;
                        }
                        break;

                    }
                }
            }
            System.out.println("Los datos fueron ordenados.....");
        } else {
            System.out.println("La lista esta vacia, por lo tanton esta opcion no es posible....");
        }
    }

    public void Emilinar() {

        if (Inicio != null) {
            int aux;
            for (int Conta1 = 0; Conta1 < c; Conta1++) {
                Nodo Actual = new Nodo();
                Nodo Ante = new Nodo();
                Ante = Inicio;
                Actual = Ante.Sig;
                for (int k = 0; k < c; k++) {
                    for (int l = 0; l < c; l++) {
                        while (Ante.Sig != null) {
                            if (Ante.Dato > Actual.Dato) {
                                aux = Ante.Dato;
                                Ante.Dato = Actual.Dato;
                                Actual.Dato = aux;
                            }
                            Ante = Actual;
                            Actual = Actual.Sig;
                        }
                        break;

                    }
                }
            }
            for (int Conta = 0; Conta < c; Conta++) {
                Nodo Ant = new Nodo();
                Nodo Ac = new Nodo();
                Ant = Inicio;
                Ac = Ant.Sig;
                for (int j = 0; j < c; j++) {
                    for (int i = 0; i < c; i++) {
                        while (Ant.Sig != null) {
                            if (Ant.Dato == Ac.Dato) {
                                if (Ant == Inicio) {
                                    Ant.Sig = Ac.Sig;
                                    Ac = Ac.Sig;
                                    c--;
                                } else if (Ac.Sig == null) {
                                    Ant.Sig = null;
                                    Ant = Fin;
                                    c--;
                                } else {
                                    Ant.Sig = Ac.Sig;
                                    Ac = Ac.Sig;
                                    c--;
                                }
                            }
                            Ant = Ac;
                            Ac = Ac.Sig;
                        }
                        break;
                    }
                }
            }
            System.out.println("Los Datos repetidos de la Lista fueron eliminados");
        } else {
            System.out.println("La Lista esta Vacia....");
        }
    }

    public void AgregarFal() {
        if (Inicio != null) {
            for (int r = 0; r <= 500; r++) {
                for (int Conta = 0; Conta < 500; Conta++) {
                    Nodo Tim = new Nodo();
                    Nodo Si = new Nodo();
                    Si = Inicio;
                    Tim.Dato = (int) (Math.random() * 500);
                    boolean Encontrado = false;
                    for (int j = 0; j < 500; j++) {
                        for (int i = 0; i < 500 && Encontrado == false; i++) {
                            while (Si.Sig != null) {
                                if (Tim.Dato == Si.Dato) {
                                    Encontrado = true;

                                }
                                Si = Si.Sig;
                            }
                            break;

                        }
                        if (Encontrado == false) {
                            Fin.Sig = Tim;
                            Tim.Sig = null;
                            Fin = Tim;

                        }
                    }
                }
            }

            System.out.println("Los Datos fueron Agregados\n");
        } else {
            System.out.println("La lista se encuentra vacia.....");
        }
    }

    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        JavaApplication1 n = new JavaApplication1();
        int Op, OPI;
        System.out.println("Bienvenido al Programa de 500 NUMEROS aleatorios\n"
                + "Puesdes elegir cualquiera de estas opciones:");
        do {
            System.out.println("1.-Agregar Numeros Aleatorios\n"
                    + "2.-Mostrar La Lista\n"
                    + "3.-Ordenas Nodos\n"
                    + "4.-Eliminar los Nodos repetidos\n"
                    + "5.-Agregar los faltantes\n"
                    + "6.-Salir del Programa\n");
            switch (Op = rd.nextInt()) {
                case 1:
                    n.Datosram();
                    break;
                case 2:
                    n.Mostrar();
                    break;
                case 3:
                    System.out.println("Como deseas ordenar la lista:\n"
                            + "1. Menor a Mayor\n"
                            + "2. Mayor a Menor\n");
                    switch (OPI = rd.nextInt()) {
                        case 1:
                            n.OrdenarMeaMa();
                            break;
                        case 2:
                            n.OrdenarMaaMe();
                            break;
                    }
                    break;
                case 4:
                    n.Emilinar();
                    break;
                case 5:
                    n.AgregarFal();
                    break;
                default:
                    System.out.println("Esta opcion no existe mi pana ");
                    break;
            }
        } while (Op != 6);
    }

}
