/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ahau
 */
public class DiaSemana {

    private int dia;
    private int mes;
    private int año;

    public DiaSemana(int d, int m, int a) {
        dia = d;
        mes = m;
        año = a;
    }

    public int CalcularA() {
        int A = 0;
        if (año >= 1700 && año <= 1799) {
            A = 5;
        }
        if (año >= 1800 && año <= 1899) {
            A = 3;
        }
        if (año >= 1900 && año <= 1999) {
            A = 1;
        }
        if (año >= 2000 && año <= 2099) {
            A = 0;
        }
        if (año >= 2100 && año <= 2199) {
            A = -2;
        }
        if (año >= 2200 && año <= 2299) {
            A = -4;
        }
        return A;

    }

    public int CalcularB() {

        int p = 0;
        int B = 0;
        p = año % 100;
        B = p / 4 + p;
        return B;
    }

    public int CalcularC() {

        int C = 0;
        
    
        if((mes==1 || mes==2)&& año%4==0){
            C--;
            if(año%4==0 && año%100==0){
            C++;
            }
            
        }
        
        else
        {
            C=0;
        }
        //aqui debe colocar su codigo fuente
        return C;
    }

    public int CalcularD() {
        int D = 0;
        if (mes == 1) {
            D = 6;
        }
        if (mes == 2) {
            D = 2;
        }
        if (mes == 3) {
            D = 2;
        }
        if (mes == 4) {
            D = 5;
        }
        if (mes == 5) {
            D = 0;
        }
        if (mes == 6) {
            D = 3;
        }
        if (mes == 7) {
            D = 5;
        }
        if (mes == 8) {
            D = 1;
        }
        if (mes == 9) {
            D = 4;
        }
        if (mes == 10) {
            D = 6;
        }
        if (mes == 11) {
            D = 2;
        }
        if (mes == 12) {
            D = 4;
        }
        return D;
    }

    public int CalcularE() {
        int E = dia;
        return E;
    }

    public String solucion(int A, int B, int C, int D, int E) {
        int Z = 0;
        String Q = "";
        Z = A + B + C + D + E;
        while (Z > 6) {
            Z = Z - 7;
        }
        if (Z == 0) {
            Q = "DOMINGO";
        }
        if (Z == 1) {
            Q = "LUNES";
        }
        if (Z == 2) {
            Q = "MARTES";
        }
        if (Z == 3) {
            Q = "MIERCOLES";
        }
        if (Z == 4) {
            Q = "JUEVES";
        }
        if (Z == 5) {
            Q = "VIERNES";
        }

        if (Z == 6) {
            Q = "SABADO";
        }
        return Q;
    }
}
