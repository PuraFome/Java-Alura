public class conversaoFLoatInt {

    public static void main(String[] args){
        
        // para converter um valor real para inteiro é necessario indicar a intnção usando 
        // a esguinte sintaxe:
        double salario = 123.123;
        int convertido = (int) salario;

        System.out.println("O Salário é: " + salario);

        System.out.println("O salario convertido para inteiro é: " + convertido);
    }
}
