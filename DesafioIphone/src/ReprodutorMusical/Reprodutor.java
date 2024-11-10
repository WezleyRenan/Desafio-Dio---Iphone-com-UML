package ReprodutorMusical;

public class Reprodutor implements ReprodutorInterface {
    @Override
    public void tocar() {
        System.out.println("tocando...");
    }

    @Override
    public void pausar() {
        System.out.println("musica pausada");
    }

    @Override
    public String selecionarMusica(String musica) {
        return "selecionando a musica " + musica;
    }
}
