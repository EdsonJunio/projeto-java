//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Bem vindo ao canal");
        System.out.println("filme: Top Gun: Marevick");

        int anoDeLancamento = 2020;
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        double media = (9.8 + 6.3 + 8.0);
        System.out.println(media);
        String sinopse;
        sinopse = """
                Filme top Gum
                Filme de aventura
                Muito bom
                Ano de Lançamento;
                """ + anoDeLancamento;
        System.out.println(sinopse);

        int classificaxcao = (int) (media / 2);
        System.out.println(classificaxcao);


    }
}