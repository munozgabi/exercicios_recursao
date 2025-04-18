public class Exercicio{
    public int metodoA(int m, int n){
        if(m == 0){
            return n + 1;
        }
        if(m != 0 && n == 0){
            return metodoA(m - 1,1);
        }
        return metodoA(m - 1, metodoA(m, n - 1));
    }

    public int metodoB(int n) throws IllegalArgumentException{
        if(n < 1){
            throw new IllegalArgumentException();
        }
        return metodoB_r(n);

    }

    private int metodoB_r(int n){
        if(n == 1){
            return 1;
        }
        return n+metodoB_r(n-1);
    }

    public int metodoC(int[] v) throws IllegalArgumentException{
        if(v == null){
            throw new IllegalArgumentException();
        }
        return metodoC(v,0);

    }

    private int metodoC(int[]v, int t){
        if(t >= v.length){
            return 0;
        }
        return v[t] + metodoC(v, t + 1);
    }

    public static int f(int x){
        int res;
        if(x < 4){
            res = 3 * x;
        }
        else{
            res = 2 * f(x - 4) + 5;
        }
        return res;
       }

    public boolean isPalindrome(char word[]) throws IllegalArgumentException{
        if(word == null){
            throw new IllegalArgumentException();
        }
        return isPalindrome(word, 0);
    }

    private boolean isPalindrome(char word[], int i){
        if(i >= word.length/2){
            return true;
        }
        if(word[i] == word[word.length-1-i]){
            return isPalindrome(word, i + 1);
        }
        else{
            return false;
        }
    }

    public void arrayBackwords(int array[]) throws IllegalArgumentException{
        if(array == null){
            throw new IllegalArgumentException();
        }
        arrayBackwords(array, array.length-1); 
    }

    private void arrayBackwords(int array[], int i){
        if(i >= 0 ){
            System.out.println(array[i]);
            arrayBackwords(array, --i);
        }
        arrayBackwords(array);
    }

    public double somaElementos(double array[][]) throws IllegalArgumentException{
        if(array == null){
            throw new IllegalArgumentException();
        }
        return somaElementos(array, 0, 0); 
    }

    private double somaElementos(double array[][], int i, int j){
        if(i >= array.length){
            return 0;
        }
        if(j >= array[i].length){
            return somaElementos(array, i+1, 0);
        }
        return array[i][j] + somaElementos(array, i, j+1);
    }

    public int encontraPosicaoMenorValor(int array[]) throws IllegalArgumentException{
        if(array == null){
            throw new IllegalArgumentException();
        }
        return encontraPosicaoMenorValor(array, 0, 0); 
    }

    private int encontraPosicaoMenorValor(int array[], int i, int posicaoMenor){
        if(i >= array.length){
            return posicaoMenor;
        }
        if(array[i] < array[posicaoMenor]){
            posicaoMenor = i;
        }
        return encontraPosicaoMenorValor(array, i+1, posicaoMenor);
    }
    
    public void printPrimaryDiagonal(int array[][]) throws IllegalArgumentException, MatrixNotPossibleException{
        if(array == null){
            throw new IllegalArgumentException();
        }
        if(array.length != array[0].length){
            throw new MatrixNotPossibleException();
        }
        printPrimaryDiagonal(array, 0); 
    }

    private void printPrimaryDiagonal(int array[][], int i){
        if(i < array.length){
            System.out.println(array[i][i]);
            printPrimaryDiagonal(array, i+1);
        }
    }

    public int binaryToDecimal(String numero) throws IllegalArgumentException{
        if(numero == null || numero.length() < 8){
            throw new IllegalArgumentException();
        }
        return binaryToDecimal(numero, 0); 
    }

    private int binaryToDecimal(String numero, int i){
        if(i >= numero.length()){
            return 0;
        }
        char digito = numero.charAt(numero.length()-1-i);
        if(digito == '1'){
            return (int)Math.pow(2,i) + binaryToDecimal(numero, i+1);
        }
        return binaryToDecimal(numero, i+1);
    }

    public int calculo(int m, int n){
        if(m == 0){
            return n + 1;
        }
        if(m > 0 && n == 0){
            return calculo(m - 1, 1);
        }
        else{
            return calculo(m - 1, calculo(m, n - 1));
        }
    }
    
    public void metodoRecursivo(int x) {
        if (x == 0){
            System.out.println("Fim do programa");
        }
        else{
            metodoRecursivo(x-3);
            System.out.println(x);
        }
   }

    public static void main(String[] args) {
        Exercicio e = new Exercicio();
        System.out.println(e.calculo(2, 1));
        System.out.println(e.calculo(3, 4));
        e.metodoRecursivo(6);
    }
}