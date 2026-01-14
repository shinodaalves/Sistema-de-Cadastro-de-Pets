package Controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FormularioController {
    String[] perguntas = new String[7];
    String[] respostas = new String[7];

    public void lerFormulario() {
        String linha;
        int i = 0;

        try (FileReader fr = new FileReader("src/main/java/Data/formulario.txt");
             BufferedReader br = new BufferedReader(fr)) {

            while (i < perguntas.length && (linha = br.readLine()) != null) {

                if (linha.isEmpty()) {
                    continue;
                }

                perguntas[i] = linha;
                i++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String[] lerRespostas(Scanner sc) {
        lerFormulario();
        for (int i = 0; i < perguntas.length; i++) {
            System.out.println(perguntas[i]);

            if (i == 0 || i == 3 || i == 6) {
                respostas[i] = verificarNomeOuRaca(sc);
            }

            if (i == 1) {
                respostas[i] = verificarTipo(sc);
            }

            if (i == 2) {
                respostas[i] = verificarSexo(sc);
            }

            if (i == 4 || i == 5) {
                respostas[i] = verificarNumeros(sc);
            }
        }
        return respostas;
    }

    private String verificarNomeOuRaca(Scanner sc) {
        while (true) {
            System.out.print("Resposta: ");
            String resposta = sc.nextLine();
            if (resposta.matches("^[A-Za-zÀ-ÖØ-öø-ÿ ]+$")) {
                return resposta;
            }
            System.out.println("\nSomente Caracteres sao permitidos! Digite um Caractere valido.\n");
        }
    }

    private String verificarNumeros(Scanner sc) {
        while (true) {
            System.out.print("Resposta: ");
            String resposta = sc.nextLine();
            if (resposta.matches("^[0-9]+$")) {
                return resposta;
            }
            System.out.println("\nSomente Numeros sao permitidos! Digite um Numero valido.\n");
        }
    }

    private String verificarTipo(Scanner sc) {
        while (true) {
            System.out.print("Resposta: ");
            String resposta = sc.nextLine().trim().toUpperCase();
            if (resposta.equals("CACHORRO") || resposta.equals("GATO")) {
                return resposta;
            }
            System.out.println("\nTipo inválido. Digite CACHORRO ou GATO.\n");
        }
    }

    private String verificarSexo(Scanner sc) {
        while (true) {
            System.out.print("Resposta (MACHO/FEMEA): ");
            String resp = sc.nextLine().trim().toUpperCase();
            if (resp.equals("MACHO") || resp.equals("FEMEA")) {
                return resp;
            }
            System.out.println("\nSexo inválido. Digite MACHO ou FEMEA.\n");
        }
    }
}
