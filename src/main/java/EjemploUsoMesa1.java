import jarras.Mesa;

import static jarras.Mesa.Posicion.*;

public class EjemploUsoMesa1 {
    public static void main(String[] args){
        Mesa mesaA = new Mesa(7, 5);
        mesaA.llena(Derecha);
        System.out.println(mesaA);
        mesaA.llenaDesde(Derecha);
        System.out.println(mesaA);
        mesaA.llena(Derecha);
        System.out.println(mesaA);
        mesaA.llenaDesde(Derecha);
        System.out.println(mesaA);
        mesaA.vacia(Izquierda);
        System.out.println(mesaA);
        mesaA.llenaDesde(Derecha);
        System.out.println(mesaA);
        mesaA.llena(Derecha);
        System.out.println(mesaA);
        mesaA.llenaDesde(Derecha);
        System.out.println(mesaA);
    }
}
