package Taller_2;

class Simpli {

    int a, b;

    Simpli(int a_1, int b_1) {
        a = a_1;
        b = b_1;

    }

    void hacer() {

        int c = 2;
        if (b == 0 && a > 0) {
            System.out.print(" No se puede hacer esta operación...");
        }

        while (c <= a && c <= b) {
            if (a % c == 0 && b % c == 0) {
                a = a / c;
                b = b / c;
            } else {
                c++;

            }
        }

        if (b == a || a == 0) {
            System.out.print(" El número mas simplificado es: " + a);
        } else {
            if (a == 1) {
                System.out.print(" El número mas simplificado es: " + a + "/" + b);
            } else {
                if (b == 1) {
                    System.out.print(" El número mas simplificado es: " + a);
                } else {
                    System.out.print(" El número mas simplificado es: " + a + "/" + b);
                }
            }
        }
    }
}
