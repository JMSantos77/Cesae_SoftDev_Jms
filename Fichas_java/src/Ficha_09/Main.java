package Ficha_09;

public class Main {
    public static void main(String[] args) {
        //EX_01
        Pessoa Miguel = new Pessoa("Miguel", 46, 1.74);
        Miguel.printPessoa();
        //ou:
        System.out.println(Miguel.getNome());
        System.out.println(Miguel.getIdade());
        System.out.println(Miguel.getAltura());

        Pessoa Amigo = new Pessoa("Imaginário", 100, 1.95);
        Amigo.printPessoa();
    }
}
