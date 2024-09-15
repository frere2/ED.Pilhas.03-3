package controller;

import br.edu.fateczl.pilha.PilhaString;

public class PalindromoController {
    public String invertePalavra(String palavra) throws Exception {
        PilhaString pilha = new PilhaString();

        for (int i = 0; i < palavra.length(); i++) {
            pilha.push(String.valueOf(palavra.charAt(i)));
        }

        StringBuilder palavraInvertida = new StringBuilder();
        while (!pilha.isEmpty()) {
            palavraInvertida.append(pilha.pop());
        }

        return palavraInvertida.toString();
    }

    public boolean comparaPalavras(String original, String invertida) {
        return original.equalsIgnoreCase(invertida);
    }
}
