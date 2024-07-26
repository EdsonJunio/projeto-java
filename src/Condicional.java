public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2020;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "Plus";


        if (anoDeLancamento >= 2022) {
            System.out.println("Lançado recentimente");
        }else {
            System.out.println("lançado a muito tempo atras");
        }

        if (incluidoNoPlano && tipoPlano.equals("Plus")) {
            System.out.println("Filme incluído no plano");
        } else {
            System.out.println("Filme não incluído no plano");
        }
    }
}
