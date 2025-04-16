public class Exercicio2 {

    // Exercício 1. Crie um método recursivo que recebe um array de inteiros e um 
    // inteiro N e retorna verdadeiro caso o inteiro N esteja presente no array, ou 
    // falso caso contrário.  
    public boolean exercicio1(int [] array, int n) throws IllegalArgumentException{
        if(array == null){
            throw new IllegalArgumentException();
        }
        return exercicio1(array, n, 0);
    }
    private boolean exercicio1(int [] array, int n, int i){
        if(i >= array.length){
            return false;
        }
        if(array[i] == n){
            return true;
        }
        return exercicio1(array, n, i+1);
    }

    // Exercício 2. Crie um método recursivo que recebe um inteiro N por 
    // parâmetro e retorna verdadeiro caso ele seja um número primo e falso caso 
    // contrário.  
    public boolean exercicio2(int n){
        if(n <= 1){
           return false;
        }
        return exercicio2(n, 2);
    }
    private boolean exercicio2(int n, int i){
        if(n%i == 0){
            return false;
        }
        if(i > n/2){
            return true;
        }
        return exercicio2(n, i+1);
    }

    // Exercício 3. Crie um método recursivo que recebe uma String e retorna uma 
    // nova String, que é a String de entrada invertida.
    public String exercicio3(String string) throws IllegalArgumentException{
        if(string == null){
            throw new IllegalArgumentException();
        }
        return exercicio3(string, 0, " "); 
    }

    private String exercicio3(String string, int i, String invertida){
        if(i >= string.length()){
            invertida = string.charAt(i) + invertida;
        }
        return exercicio3(string, i+1, invertida);
    }
    
    // Exercício 4. Crie um método recursivo que recebe um inteiro positivo (e 
    // maior que 0) N e calcula o seguinte: 1 + 1/2 + 1/3 + 1/4 + 1/5 + ... + 1/N.
    public double exercicio4(int n) throws IllegalArgumentException{
        if(n <= 0){
           throw new IllegalArgumentException();
        }
        return exercicio4(n, 1);
    }
    private double exercicio4(int n, double i){
        if(i >= n){
            return 1/i;
        }
        return 1/i + exercicio4(n, i+1);
    }

    // Exercício 5. Crie um método recursivo que retorna verdadeiro caso uma 
    // String recebida por parâmetro seja um palíndromo e falso caso contrário. 
    // Um palíndromo é um texto que, desconsiderando espaços, pontuação e 
    // acentuação, pode ser lido da mesma forma tanto de frente pra trás quanto 
    // de trás para frente.
    // No seu método público, antes de chamar o método privado, você deve 
    // remover pontuações (exclamações, pontos de interrogação, pontos finais e 
    // vírgulas) e espaços, para então chamar o método privado. Você pode assumir 
    // que o texto de entrada não possuirá acentos. 
    public boolean exercicio5(String string) throws IllegalArgumentException{
        if(string == null){
            throw new IllegalArgumentException();
        }
        string = string.replaceAll("!?.,", "");
        return exercicio5(string, 0);
    }

    private boolean exercicio5(String string, int i){
        if(i >= string.length()/2){
            return true;
        }
        if(string.charAt(i) == string.charAt(string.length()-1-i)){
            return exercicio5(string, i + 1);
        }
        else{
            return false;
        }
    }

    // Exercício 6. Crie um método recursivo que recebe um array de String e 
    // retorna a quantidade de posições que contém palíndromos neste array. 
    // Utilize o método desenvolvido no exercício 5 para auxiliar.
    public int exercicio6(String array[]) throws IllegalArgumentException{
        if(array == null){
            throw new IllegalArgumentException();
        }
        return exercicio6(array, 0);
    }

    private int exercicio6(String array[], int i){
        if(i >= array.length){
            return 0;
        }
        if(exercicio5(array[i])){
            return 1 + exercicio6(array, i+1);
        }
        return exercicio6(array, i+1);
    }

    // Exercício 7. Crie um método recursivo que conta quantas vezes um 
    // determinado dígito positivo D aparece em um inteiro positivo N. Por 
    // exemplo, se N = 161451811 e D = 1, o retorno do método deve ser 5, pois o 
    // dígito 1 aparece 5 vezes em N. Você deve utilizar apenas operações 
    // matemáticas para isto, sem utilização de Strings. 
    public int exercicio7(int n, int d) throws IllegalArgumentException{
        if(n < 0 || d < 0 || d > 9){
            throw new IllegalArgumentException();
        }
        return exercicio7_r(n, d);
    }

    private int exercicio7_r(int n, int d){
        if(n == 0){
            return 0;
        }
        if(n%10 == d){
            return 1 + exercicio7_r(n/10, d);
        }
        return exercicio7_r(n/10, d);
    }



}
