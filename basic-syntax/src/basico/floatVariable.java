public class floatVariable {

    public static void main(String[] arg){

        //double e float são os tipos de variáveis que armazena números reais, porem double tem
        //mais precisão que float e é mais usado
        double salario;
        salario = 1259.99;
        System.out.println("O salário é: " + salario);

        double divisao = 3.14 / 2 ;
        System.out.println("A divisão é: " + divisao);

        // Ao operar com interios o resultado será um inteiro
        double outraDivisao = 5/2;
        System.out.println("A outra divisao é: " + outraDivisao);

        // ao operar com um valor de ponto flutuante o resultado será um valor de ponto flutuante
        double outraDivisaoDouble = 5.0/2;
        System.out.println("A outra divisao é: " + outraDivisaoDouble);


    }
}
