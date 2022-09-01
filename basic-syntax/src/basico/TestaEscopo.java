public class TestaEscopo {

    public static void main(String[] args) {

        System.out.println("Testando Condicionais");

        int idade = 20;
        int quantidadePessoas = 3;
        boolean acompanhado = quantidadePessoas >= 2;

        if( idade >= 18 && acompanhado ) {

            System.out.println("Você Pode entrar, idade: " + idade);
        } else {
            System.out.println("Você não pode entrar, idade: " + idade);
        }	
        


    }

}
