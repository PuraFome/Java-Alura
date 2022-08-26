public class TestaLacos {

    public static void main(String[] args) {

        for (int linha=1; linha <= 10; linha++ ){
            for (int coluna=1; coluna <= 10; coluna++){
                int resultadoMultiplicacao = 0;
                resultadoMultiplicacao = linha * coluna;
                System.out.println(linha + " * " + coluna + " = " + resultadoMultiplicacao);
            }
        }
    }
    
}
