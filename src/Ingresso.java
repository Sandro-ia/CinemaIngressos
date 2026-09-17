public class Ingresso {
    protected double valor;
    protected String nomeFilme;
    protected boolean dublado;

    public Ingresso(double valor, String nomeFilme, boolean dublado) {
        this.valor = valor;
        this.nomeFilme = nomeFilme;
        this.dublado = dublado;
    }

    public double getValor() {
        return valor;
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public boolean isDublado() {
        return dublado;
    }

    public String getVersao() {
        return dublado ? "Dublado" : "Legendado";
    }

    // Metodo polimorfico: cada subclasse pode sobrescrever
    public double valorReal() {
        return valor;
    }
}