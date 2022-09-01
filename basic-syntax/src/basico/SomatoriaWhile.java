public class SomatoriaWhile {

    public static void main(String[] args) {

        int contador = 0;
        int soma = 0;

        while(contador <= 10){
            System.out.println("Contador: " + contador);
            soma += contador;
            System.out.println("Soma: " + soma);
            contador++;
        }
    }
}
