public class OrdenamientoInsercion {
    int clave, j;
    for (int i = 1; i < n; i++) {
        clave = lista[i];
        j = i - 1;
        while (j >= 0 && lista[j] > clave) {
            lista[j + 1] = lista[j];
            j = j - 1;
        }
        lista[j + 1] = clave;
    }
}

