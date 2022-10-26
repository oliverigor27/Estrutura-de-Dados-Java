package InsertSort;
import java.util.Arrays;

public class InsertSort {
    private int value;
    private int indexx = 0;
    
    String insertSort(int[] data) {
        for(int i = 1; i < data.length; i++) {
            this.value = data[i];
            this.indexx = i;
            
            while(this.indexx > 0 && data[this.indexx - 1] > this.value) {
                data[indexx] = data[this.indexx - 1];
                this.indexx--;
            }
            
            data[this.indexx] = this.value;
            
        }
        return Arrays.toString(data);
    }
    
    public static void main(String[] args) {
        InsertSort sort = new InsertSort();
        
        int[] arr = {5, 8, 3, 4, 1, 22, 17, 9};
        
        System.out.println(sort.insertSort(arr));
    }
}
