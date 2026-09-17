public class IngressoFamilia extends Ingresso {
    private int numeroPessoas;

    public IngressoFamilia(double valor, String nomeFilme, boolean dublado, int numeroPessoas) {
        super(valor, nomeFilme, dublado);
        this.numeroPessoas = numeroPessoas;
    }

    public int getNumeroPessoas() {
        return numeroPessoas;
    }

    @Override
    public double valorReal() {
        double total = valor * numeroPessoas;

        if (numeroPessoas > 3) {
            total = total * 0.95; // desconto 5 %
        }

        return total;
    }
}
