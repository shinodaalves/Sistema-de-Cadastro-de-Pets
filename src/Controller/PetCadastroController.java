package Controller;

import Model.Sexo;
import Model.Tipo;
import Service.PetService;

import java.util.Scanner;

public class PetCadastroController {
    private final PetService petService;
    private final FormularioController formularioController;

    public PetCadastroController(PetService petService, FormularioController formularioController) {
        this.petService = petService;
        this.formularioController = formularioController;
    }

    public void cadastrarPet(Scanner sc) {
        String[] respostas = formularioController.lerFormulario(sc);
        respostas = formularioController.respostas;
        String nome = respostas[0];
        Tipo tipo = Tipo.fromString(respostas[2]);
        Sexo sexo = Sexo.fromString(respostas[3]);
        String endereco = respostas[4];
        double idade = Double.parseDouble(respostas[5]);
        double peso = Double.parseDouble(respostas[6]);
        String raca = respostas[7];
        petService.cadastrarPet(nome, tipo, sexo, endereco, idade, peso, raca);
        for (String resposta : respostas) {
            System.out.println(resposta);
        }

    }
}
