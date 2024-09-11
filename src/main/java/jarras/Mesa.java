package jarras;

public class Mesa {
    public enum Posicion{
        Izquierda, Derecha
    }
    private Jarra jarraIzquierda;
    private Jarra jarraDerecha;
    public Mesa(Jarra j1, Jarra j2){
        if(j1==j2){
            throw new RuntimeException("Las dos jarras introducidas son la misma");
        }
        this.jarraIzquierda=j1;
        this.jarraDerecha=j2;
    }
    public Mesa(int cap1, int cap2){
        this.jarraIzquierda = new Jarra(cap1);
        this.jarraDerecha = new Jarra(cap2);
    }
    public int capacidad(Posicion pos){
        return  (pos == Posicion.Izquierda) ? jarraIzquierda.capacidad() : jarraDerecha.capacidad();
    }

    public int contenido(Posicion pos){
        return (pos == Posicion.Izquierda) ? jarraIzquierda.contenido() : jarraDerecha.contenido();
    }

    public void llena(Posicion pos){
        if(pos == Posicion.Izquierda){
            jarraIzquierda.llena();
        }else{
            jarraDerecha.llena();
        }
    }

    public void vacia(Posicion pos){
        if(pos == Posicion.Izquierda){
            jarraIzquierda.vacia();
        }else{
            jarraDerecha.vacia();
        }
    }

    public void llenaDesde(Posicion pos){
        if(pos == Posicion.Izquierda){
            jarraDerecha.llenaDesde(jarraIzquierda);
        }else{
            jarraIzquierda.llenaDesde(jarraDerecha);
        }
    }

    @Override
    public String toString() {
        return "M(J("+jarraIzquierda.capacidad()+", "+jarraIzquierda.contenido()+"), J("+ jarraDerecha.capacidad()+", "+ jarraDerecha.contenido()+"))";
    }
}
