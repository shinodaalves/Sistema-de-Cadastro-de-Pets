package Controller;

import Model.Tipo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FormularioController {
    String[] respostas = new String[7];

    public String[] lerFormulario(Scanner sc) {
        try (FileReader fr = new FileReader("src/Data/formulario.txt");
             BufferedReader br = new BufferedReader(fr)) {

            String[] perguntas = new String[7];
            String linha;
            int i = 0;

            while (i < perguntas.length && (linha = br.readLine()) != null) {

                if (linha.isEmpty()) {
                    continue;
                }

                perguntas[i] = linha;
                    System.out.println(perguntas[i]);
                    System.out.print("Resposta: ");
                    respostas [i] = sc.nextLine();
                System.out.println("\n-----------------------------------------\n");
                i++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
