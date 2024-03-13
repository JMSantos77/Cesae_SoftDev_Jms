package Trabalho_Grupo_1;

import java.util.Scanner;

public class Aula_Funcionario {

    /**
     * Função para Editar Contactos
     *
     * @param listaContatos
     * @return matriz com os contatos atualizados
     */
    static void editarInfo(String[][] listaContatos) {

        Scanner input = new Scanner(System.in);
        int id_Funcionario, opcao;


        System.out.print("Qual o ID do Funcionario que deseja alterar: ");
        id_Funcionario = input.nextInt();
        System.out.println("Estas são as informações atuais:");

        for (int i = id_Funcionario; i <= id_Funcionario; i++) {
            for (int j = 0; j < listaContatos[i].length; j++) {
                System.out.print(listaContatos[i][j]+" | ");
            }
        }
        System.out.println();

        System.out.print("\n Qual destes dados pretende alterar :");

        do {
            System.out.println("\n1. Email");
            System.out.println("2. Telefone");
            System.out.println("3. Sair");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Insira o novo email: ");
                    listaContatos[id_Funcionario][3] = input.next();

                    for (int i = id_Funcionario; i <= id_Funcionario; i++) {
                        for (int j = 0; j < listaContatos[i].length; j++) {
                            System.out.print(listaContatos[i][j]+" | ");
                        }
                    }
                    System.out.println();

                    break;
                case 2:

                    System.out.print("Insira o novo contacto: ");
                    listaContatos[id_Funcionario][2] = input.next();

                    for (int i = id_Funcionario; i <= id_Funcionario; i++) {
                        for (int j = 0; j < listaContatos[i].length; j++) {
                            System.out.print(listaContatos[i][j]+" | ");
                        }
                    }
                    System.out.println();

                    break;
                case 3:
                    System.out.println("Xau Vítor!!!");
                    break;

                default:
                    System.out.println("Opção Invalida!");

            }
            System.out.println("Deseja alterar algo mais?");

        } while (opcao != 3);
    }

    public static void main(String[] args) {

        String[][] dados = {
                {"0", "ana", "ghfhf", "hghfh"},
                {"1", "rui", "ghfhf", "hghfh"},
                {"2", "Miguel", "ghfhf", "hghfh"},
                {"3", "joao", "ghfhf", "hghfh"}
        };

        editarInfo(dados);
    }
}