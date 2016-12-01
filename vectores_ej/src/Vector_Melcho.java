public class Vector_Melcho {

    boolean Es_Melcho(int[] vector, int filas) {
        boolean Sies = false;
        int i = 0, sumavalores = 0, mayor = vector[0];
        while (i < filas) {
            sumavalores += vector[i];
            if (vector[i] > mayor) {
                mayor = vector[i];
            }
            i++;
        }
        sumavalores = sumavalores - mayor;
        if (mayor == sumavalores) {
            Sies = true;
        }
        return Sies;
    }
}
