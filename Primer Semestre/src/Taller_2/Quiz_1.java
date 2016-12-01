package Taller_2;

class Quiz_1 {

    int a_2;

    Quiz_1(int Primo_2) {
        a_2 = Primo_2;

    }

    public void hacer() {
        int b = 1, c = 1;

        if (a_2 == 0) {
            b = a_2;
        } else {
            c = a_2;
            a_2 = 1;
        }

        while (c > 1) {
            a_2 = a_2 + 2;
            b = a_2 + b;
            c--;
        }

        System.out.print(" Tu número al cuadrado es: " + b);

    }
}
