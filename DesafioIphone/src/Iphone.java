import AparelhoTelefonico.Aparelho;
import NavegadorInternet.Navegador;
import ReprodutorMusical.Reprodutor;

import java.util.Scanner;

public class Iphone {
    public static void main(String[] args) {

        Reprodutor reprodutor = new Reprodutor();
        Navegador navegador = new Navegador();
        Aparelho aparelho = new Aparelho();

        System.out.println("Reprodutor Musical");
        System.out.println(reprodutor.selecionarMusica("never gonna give you up"));
        reprodutor.tocar();
        reprodutor.pausar();
        System.out.println(" ");

        System.out.println("NavegadorInternet");
        navegador.adicionarNovaAba();
        navegador.exibirPagina("www.google.com");
        navegador.atualizarPagina();

        System.out.println("Aparelho Telefonico");
        aparelho.ligar("555555555");
        aparelho.iniciarCorreioDeVoz();
        aparelho.atender();
    }
}