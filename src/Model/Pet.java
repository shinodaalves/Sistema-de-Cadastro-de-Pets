package Model;

import java.time.LocalDateTime;

public class Pet {
    private String nome;
    private Tipo TIPO;
    private Sexo sexo;
    private String endereco;
    private double idade;
    private double peso;
    private String raca;
    private LocalDateTime dataCadastro;

    public Pet() {
        this.dataCadastro = LocalDateTime.now();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Tipo getTIPO() {
        return TIPO;
    }

    public void setTIPO(Tipo TIPO) {
        this.TIPO = TIPO;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getIdade() {
        return idade;
    }

    public void setIdade(double idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public LocalDateTime getDataCadastro() {
        return dataCadastro;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "nome='" + nome + '\'' +
                ", TIPO=" + TIPO +
                ", sexo=" + sexo +
                ", endereco='" + endereco + '\'' +
                ", idade=" + idade +
                ", peso=" + peso +
                ", raca='" + raca + '\'' +
                ", dataCadastro=" + dataCadastro +
                '}';
    }
}


