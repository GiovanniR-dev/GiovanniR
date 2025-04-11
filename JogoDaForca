import java.util.Locale;
import java.util.Scanner;

public class cursojava {
    public static void  main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String PalavraSecreta = "Java";
        char[] letras = PalavraSecreta.toCharArray();

        char[] progresso = new char [letras.length];
        for (int i = 0; i < progresso.length; i++) {
            progresso[i] = '_';
        }
        int tentativas = 6;

        while (tentativas > 0) {
            System.out.println("\npalavras: " + String.valueOf(progresso));
            System.out.println("Tentativas restantes: " + tentativas);
            System.out.print("Digite uma letra: ");
            char chute = scanner.next().toLowerCase().charAt(0);

            boolean acertou = false;


            for (int i = 0; i < letras.length; i++) {
                if (letras[i] == chute) {
                    progresso[i] = chute;
                    acertou = true;
                }
            }

            if (!acertou) {
                tentativas--;
                System.out.println("Letra incorreta");
            } else {
                System.out.println("Boa! Letra Correta");
            }

            if (String.valueOf(progresso).equals(PalavraSecreta)) {
                System.out.println("\nParabéns! Você acertou a palavra: " + PalavraSecreta);
                break;
            }

        }

        if (tentativas == 0) {
            System.out.println("\nVocê perdeu! A palavra era: " + PalavraSecreta);
        }
        scanner.close();

    }
}
