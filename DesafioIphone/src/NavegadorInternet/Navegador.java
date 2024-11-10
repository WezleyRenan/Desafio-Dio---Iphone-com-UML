package NavegadorInternet;

public class Navegador implements NavegadorInterface {
    @Override
    public String exibirPagina(String url) {
        return "acessando o site " + url;
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("adicionando uma nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("atualizando a pagina");
    }
}
