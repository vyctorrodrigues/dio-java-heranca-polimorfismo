//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var i1 = new Ingresso(50,"Jack", false);
        System.out.println("Valor do Ingresso: R$ " + i1.getValorReal());

        System.out.println("========================================");

        var i2 = new IngressoMeia(63,"Jack", true);
        System.out.println("Valor do Ingresso: R$ " + i2.getValorReal());

        System.out.println("=====================================");

        var i3 = new IngressoFamilia(58,"Jack", false,5);
        System.out.println("Valor do Ingresso: R$ " + i3.getValorReal());
    }


}