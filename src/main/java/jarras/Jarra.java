package jarras;

public class Jarra  {
    private final int capacidad;
    private int contenido;

    public Jarra(int cap){
        capacidad=cap;
        contenido=0;
        if(cap<=0){
            throw new RuntimeException("El valor introducido como capacidad no puede ser menor o igual a 0");
        }
    }
    public int capacidad(){
        return capacidad;
    }
    public int contenido(){
        return contenido;
    }
    public void llena(){
        contenido=capacidad;
    }
    public void vacia(){
        contenido=0;
    }
    public void llenaDesde(Jarra j){
        if(this==j){
            throw new RuntimeException("La jarra emisora es la misma que la receptora");
        }
        if(this.contenido==this.capacidad){
            throw new RuntimeException("La jarra receptora ya esta llena");
        }
        if(j.contenido==0){
            throw new RuntimeException("La jarra emisora esta vacia");
        }

        int contenidoRestante = this.capacidad-this.contenido;

        if(j.contenido<=contenidoRestante){
            this.contenido+=j.contenido;
            j.contenido=0;
        }else{
            j.contenido-=contenidoRestante;
            this.contenido=this.capacidad;
        }

    }


    @Override
    public String toString() {
        return "J("+capacidad+", "+contenido+")";
    }
}
