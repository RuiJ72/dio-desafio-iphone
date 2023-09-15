

public class AparelhoTelefonico {
    private String numeroTelefone;

    public AparelhoTelefonico(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    public void fazerChamada(String numeroDestino) {
        System.out.println("Chamando " + numeroDestino + " de " + numeroTelefone);
    }

    public void receberChamada(String numeroOrigem) {
        System.out.println("Recebendo chamada de " + numeroOrigem);
    }
}
