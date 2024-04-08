package Ficha_09;

public class Pessoa {
    //Atributos da Classe
    private String nome;
    private int idade;
    private double altura;

    //Construtor
    public Pessoa(String inNome, int inIdade, double inAltura) {
        this.nome = inNome;
        this.idade = inIdade;
        this.altura = inAltura;
    }

    //Métodos
    public void printPessoa() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
    }

}
