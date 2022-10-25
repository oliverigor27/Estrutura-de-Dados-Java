package BubbleSort;
import java.util.Arrays;

public class BubbleSort {

    static String ordenar(int[] data) {
        int i, j, aux;
        
        for(i = 0; i < data.length; i++) {
            for(j = 0; j < data.length; j++) {
                if(data[i] < data[j]) {
                    aux = data[i];
                    data[i] = data[j];
                    data[j] = aux;
                }
            }
        }

        return Arrays.toString(data);

    }

    public static void main(String[] args) {

        int[] arr = {5,10,9,2,4,7,11,3,6};

        System.out.println(ordenar(arr));
    }
}
