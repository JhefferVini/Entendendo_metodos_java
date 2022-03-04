package resolucao_exercicios_1;

public class cumprimento_hora_do_dia {

    public static void main(String[] args) {

        System.out.println("Resultados para cada método:");

        cumprimento_hora_do_dia.obterMensagem(9);
        cumprimento_hora_do_dia.obterMensagem(15);
        cumprimento_hora_do_dia.obterMensagem(22);
        cumprimento_hora_do_dia.obterMensagem(0);

    }


    public static void obterMensagem(int hora){
        switch (hora){
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                mensagemBomdia();
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                mensagemBoatarde();
                break;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                mensagemBoanoite();
                break;
            default:
                System.out.println("Hora inválida.");
                break;
        }
    }

    public static void mensagemBomdia(){
        System.out.println("Bom dia !");
    }

    public static void mensagemBoatarde(){
        System.out.println("Boa tarde !");
    }

    public static void mensagemBoanoite(){
        System.out.println("Boa noite !");
    }

}
