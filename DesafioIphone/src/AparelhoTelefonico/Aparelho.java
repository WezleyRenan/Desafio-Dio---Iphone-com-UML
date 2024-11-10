package AparelhoTelefonico;

public class Aparelho implements AparelhoInterface {
    @Override
    public String ligar(String numero) {
        return "Ligando para o numero " + numero;
    }

    @Override
    public void atender() {
        System.out.println("atendendo");

    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("iniciando o correio de voz");

    }
}
