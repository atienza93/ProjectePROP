package domini.Basic;

/**
 * Created by Miquel on 23/10/2015.
 */


public class Celda {
    int valor;


    public Celda(){
    }

    public Celda(int n){
        this.valor = n;
    }

    public int getValor(){
        return valor;
    }


    public void setValor(int val){
        this.valor = val;
    }
}
