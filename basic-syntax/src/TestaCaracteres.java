public class TestaCaracteres {

    public static void main(String[] args) {
        char letra = 'a';

        System.out.println("A letra é: " + letra);
        
        char valor = 66;

        System.out.println("O valor é: " + valor);

        valor = (char) (valor + 1);

        System.out.println("O valor é: " + valor);

        String palavra = "isso é uma palavra bem feia";

        System.out.println("A palavra é: " + palavra);

        palavra = palavra + " " + 2022 + " concatenação PORRA";

        System.out.println("A palavra é: " + palavra);
    }
    
}
