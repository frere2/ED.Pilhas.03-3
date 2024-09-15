package view;

import controller.PalindromoController;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        PalindromoController controller = new PalindromoController();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        String palavraInvertida = controller.invertePalavra(palavra);

        boolean isPalindromo = controller.comparaPalavras(palavra, palavraInvertida);

        if (isPalindromo) {
            System.out.println("A palavra '" + palavra + "' é um palíndromo.");
        } else {
            System.out.println("A palavra '" + palavra + "' não é um palíndromo.");
        }

        scanner.close();
    }
}
