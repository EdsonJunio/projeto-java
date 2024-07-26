import java.util.Random;
import java.util.Scanner;

public class MegaSena {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int numeroAleatorio = random.nextInt(101);
        int tentativas = 0;
        int maxTentativas = 5;
        boolean acertou = false;

        System.out.println("Bem-vindo ao Jogo de Adivinhação!");
        System.out.println("Tente adivinhar o número entre 0 e 100.");

        while (tentativas < maxTentativas) {
            System.out.print("Tentativa " + (tentativas + 1) + ": ");
            int palpite = scanner.nextInt();
            tentativas++;

            if (palpite == numeroAleatorio) {
                acertou = true;
                break;
            } else if (palpite < numeroAleatorio) {
                System.out.println("O número é maior do que " + palpite + ".");
            } else {
                System.out.println("O número é menor do que " + palpite + ".");
            }
        }
        if (acertou) {
            System.out.println("Parabéns! Você acertou " + numeroAleatorio + " em " + tentativas + " tentativas.");
        } else {
            System.out.println("Você não conseguiu acertar em 5 tentativas. O número era " + numeroAleatorio + ".");
        }

        scanner.close();
    }
}