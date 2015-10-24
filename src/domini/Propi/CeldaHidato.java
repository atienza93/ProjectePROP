package domini.Propi;

import domini.Basic.Celda;

/**
 * Created by Miquel on 23/10/2015.
 */
public class CeldaHidato extends Celda {
    boolean vacio;

    public CeldaHidato(){
        vacio = true;
    }

    public CeldaHidato(int val, boolean b) {
        setValor(val);
        this.vacio = b;
    }

}
