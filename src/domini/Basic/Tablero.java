package domini.Basic;

import domini.Basic.Celda;
import java.util.Scanner;

/**
 * Created by Miquel on 23/10/2015.
 */
public class Tablero {
    int filas,columnas;
    Celda[][] T;
    int ID;
    int tipo; //1 = Hidato, 2 = Sudoku, 3 = Ken-Ken

    public Tablero(){}

    public Tablero(int n, int m, int t){
        this.filas = n;
        this.columnas = m;
        this.tipo = t;
        T = new Celda[filas][columnas];
        this.ID = 0; //last ID+1

    }

    public int getFilas(){
        return filas;
    }

    public int getColumnas(){
        return columnas;
    }

    public int getID(){
        return ID;
    }

    public int getTipo(){
        return tipo;
    }

    public void llena(){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < filas; ++i){
            for(int j = 0; j < columnas; ++j){
                int val = sc.nextInt();
                Celda c = new Celda(val);
                T[i][j] = c;
            }
        }
    }

    public void imprime(){
        for(int i = 0; i < filas; ++i){
            for(int j = 0; j < columnas; ++j){
                System.out.print(T[i][j].getValor());
                if(j != columnas) System.out.print("\t");
            }
        }
    }
}
