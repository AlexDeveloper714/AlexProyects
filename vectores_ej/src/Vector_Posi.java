public class Vector_Posi {

    int posit_vec(int vector[], int filas) {
        int i = 0, sumavalores = 0;
        while (i < filas) {
            if (vector[i] < 0) {
                vector[i] = 0;
            }
            sumavalores += vector[i];
            i++;
        }
        return sumavalores;
    }

}
