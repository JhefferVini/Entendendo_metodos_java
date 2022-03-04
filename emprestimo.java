package resolucao_exercicios_1;

public class emprestimo {

    public static void main(String[] args) {
        System.out.println("Resultados para os métodos: ");

        emprestimo.calcular(1500, getDuasParcelas());
        emprestimo.calcular(2000, getTresParcelas());
        emprestimo.calcular(1000, 4);
    }

    public static int getDuasParcelas(){
        return 2;
    }

    public static int getTresParcelas(){
        return 3;
    }

    public static double getTaxaDuasParcelas(){
        return 0.3;
    }

    public static double getTaxaTresParcelas(){
        return 0.45;
    }

    public static void calcular(double valor, int parcelas){

        if (parcelas == 2){
            double valorfinal = valor + (valor * getTaxaDuasParcelas());

            System.out.println("Valor final do empréstimo com pagamento em duas parcelas é: R$ " +valorfinal);
        } else if (parcelas == 3){
            double valorfinal = valor + (valor * getTaxaTresParcelas());

            System.out.println("Valor final do empréstimo com pagamento em três parcelas é: R$ " +valorfinal);
        } else {
            System.out.println("Quantidade de parcelas não aceita.");
        }

    }

}
