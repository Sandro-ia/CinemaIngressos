//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Ingresso comum = new Ingresso(20.0, "Vingadores", true);
        Ingresso meia = new MeiaEntrada(20.0, "Vingadores", true);
        Ingresso familia = new IngressoFamilia(20.0, "Vingadores", false, 4);

        System.out.println("Comum: " + comum.valorReal());       // 20.0
        System.out.println("Meia: " + meia.valorReal());        // 10.0
        System.out.println("Família: " + familia.valorReal()); // 76.0 (20*4 com 5% de desconto)

    }
}