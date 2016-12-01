public class Vector_Hoyo {

    int suma_Hoyos(int vector[], int filas) {
        int i = 0, sumavalores = 0, menor = vector[0],pos=0;
        while (i < filas) {
            if (vector[i] <= menor) {
                menor = vector[i];
                pos=i;
            }
            i++;
        }
        while(pos>=0){
            sumavalores+=vector[pos];
            pos--;
        }
        return sumavalores;
    }

}
