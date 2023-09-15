import javax.swing.*;

public class IPhone extends AparelhoTelefonico implements ReprodutorMusical {
    private String sistemaOperacional;

    public IPhone(String numeroTelefone, String sistemaOperacional) {
        super(numeroTelefone);
        this.sistemaOperacional = sistemaOperacional;
    }

    @Override
    public void reproduzirMusica(String musica) {
        System.out.println("Reproduzindo música: " + musica);
    }

    @Override
    public void pausarMusica() {
        System.out.println("Música pausada");
    }

    @Override
    public void avancarMusica() {
        System.out.println("Avançando para a próxima música");
    }

    @Override
    public void retrocederMusica() {
        System.out.println("Retrocedendo para a música anterior");
    }

    public void usarNavegador(String url) {
        NavegadorInternet navegador = new NavegadorInternet();
        navegador.abrirPagina(url);
    }
}
