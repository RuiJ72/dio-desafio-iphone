
public class Main {
    public static void main(String[] args) {
        // Criar um iPhone
        IPhone iphone = new IPhone("123-456-789", "iOS");

        // Fazer uma chamada
        iphone.fazerChamada("987-654-321");

        // Reproduzir música
        iphone.reproduzirMusica("Música 1");

        // Usar o navegador
        iphone.usarNavegador("https://www.google.br/");
    }
}
