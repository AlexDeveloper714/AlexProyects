package Taller_2;

class Quiz_1 {

    int a_2;

    Quiz_1(int Primo_2) {
        a_2 = Primo_2;

    }

    public void hacer() {
        int a[]={1,1};

        if (a_2 == 0) {
            a[0] = a_2;
        } else {
            a[1] = a_2;
            a_2 = 1;
        }

        while (a[1] > 1) {
            a_2 = a_2 + 2;
            a[0] = a_2 + a[0];
            a[1]--;
        }

        System.out.print(" Tu número al cuadrado es: " + a[0]);

    }
}
