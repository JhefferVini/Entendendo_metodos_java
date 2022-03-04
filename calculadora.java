package resolucao_exercicios_1;

public class calculadora {

    public static void main(String[] args) {

        System.out.println("Resultados para cada método: ");
        calculadora.somar(7, 2.5);
        calculadora.subtracao(10, 1.5);
        calculadora.multiplicar(9, 15);
        calculadora.divisao(654, 3);

    }

    public static void somar(double numero1, double numero2){

        double total = numero1 + numero2;

        System.out.println("O total da soma entre " + numero1 + " + " + numero2 + " é: " + total);
    }

    public static void subtracao(double numero1, double numero2){

        double diferenca = numero1 - numero2;

        System.out.println("A diferença entre " +numero1+ " e " +numero2+ " é " +diferenca);
    }

    public static void multiplicar(double numero1, double numero2){

        double produto = numero1 * numero2;

        System.out.println("O produto da multiplicação entre " +numero1+ " e " +numero2+ " é " +produto);
    }

    public static void divisao(double numero1, double numero2){

        double quociente = numero1 / numero2;

        System.out.println("O quociente da divisão entre " +numero1+ " e " +numero2+ " é " +quociente);
    }
}
