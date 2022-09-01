public class TestaFor {

    public static void main(String[] args) {
        int soma = 0;
        //o loop for possui sintaxe herdada do C
        for(int contador = 0; contador <= 10; contador++){
            System.out.println("Coontador: " + contador);
            
            soma += contador;

            System.out.println("Soma: " + soma);
            
        }
    }
    
}
