package Taller_1;


public class DiaSemana {

    private int dma[]={0,0,0};

    public DiaSemana(int d, int m, int a) {
        dma[0] = d;
        dma[1] = m;
        dma[2] = a;
    }

    public int CalcularA() {
        int A = 0;
        if (dma[2] >= 1700 && dma[2] <= 1799) {
            A = 5;
        }
        if (dma[2] >= 1800 && dma[2] <= 1899) {
            A = 3;
        }
        if (dma[2] >= 1900 && dma[2] <= 1999) {
            A = 1;
        }
        if (dma[2] >= 2000 && dma[2] <= 2099) {
            A = 0;
        }
        if (dma[2] >= 2100 && dma[2] <= 2199) {
            A = -2;
        }
        if (dma[2] >= 2200 && dma[2] <= 2299) {
            A = -4;
        }
        return A;

    }

    public int CalcularB() {

        int b[] ={0,0} ;
        b[1] = dma[2] % 100;
        b[0] = b[1] / 4 + b[1];
        return b[0];
    }

    public int CalcularC() {

        int C = 0;

        if ((dma[1] == 1 || dma[1] == 2) && ((dma[2] % 4 == 0 && dma[2] % 100 != 0) || dma[2] % 400 == 0)) {
            C--;
        } else {
            C = 0;
        }
        //aqui debe colocar su codigo fuente
        return C;
    }

    public int CalcularD() {
        int D = 0;
        if (dma[1] == 1) {
            D = 6;
        }
        if (dma[1] == 2) {
            D = 2;
        }
        if (dma[1] == 3) {
            D = 2;
        }
        if (dma[1] == 4) {
            D = 5;
        }
        if (dma[1] == 5) {
            D = 0;
        }
        if (dma[1] == 6) {
            D = 3;
        }
        if (dma[1] == 7) {
            D = 5;
        }
        if (dma[1] == 8) {
            D = 1;
        }
        if (dma[1] == 9) {
            D = 4;
        }
        if (dma[1] == 10) {
            D = 6;
        }
        if (dma[1] == 11) {
            D = 2;
        }
        if (dma[1] == 12) {
            D = 4;
        }
        return D;
    }

    public int CalcularE() {
        int E = dma[0];
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
            Q = "ESE DIA ES O FUE: DOMINGO";
        }
        if (Z == 1) {
            Q = "ESE DIA ES O FUE: LUNES";
        }
        if (Z == 2) {
            Q = "ESE DIA ES O FUE: MARTES";
        }
        if (Z == 3) {
            Q = "ESE DIA ES O FUE: MIERCOLES";
        }
        if (Z == 4) {
            Q = "ESE DIA ES O FUE: JUEVES";
        }
        if (Z == 5) {
            Q = "ESE DIA ES O FUE: VIERNES";
        }

        if (Z == 6) {
            Q = "ESE DIA ES O FUE: SABADO";
        }
        return Q;
    }
}
