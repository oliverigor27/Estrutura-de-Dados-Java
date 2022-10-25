public class BuscaBinaria {
    private int[] novoArr; 
    private int inicio, fim;
    private int result;

    public BuscaBinaria(int[] vet, int dta) {
        this.novoArr = vet;
        this.inicio = 0;
        this.fim = novoArr.length - 1;
        this.result = -1;
    }

    public int[] serach(int value, int dta) {
        
        while(this.inicio <= this.fim) {
            final int media = (this.inicio + this.fim) / 2;
            if(this.novoArr[media] == dta) {

            }
        }
    }
}
