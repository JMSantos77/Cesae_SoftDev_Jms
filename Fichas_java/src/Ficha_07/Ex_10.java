package Ficha_07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Ex_10 {

    public static String[][] readFileToMatrix(String path) throws FileNotFoundException {
        Scanner readFile = new Scanner(new File(path));

        int numberLines = 0, numberColumns = 0;

        String fileHeader = readFile.nextLine();

        // Descobrir n.º de linhas e colunas da matriz.
        while (readFile.hasNextLine()) {
            numberLines++;
            String[] lineVector = readFile.nextLine().split(",");
            numberColumns = lineVector.length;
        }

        String[][] dataMatrix = new String[numberLines][numberColumns];

        readFile = new Scanner(new File(path));
        String fileHeader2 = readFile.nextLine();

        int line = 0, column = 0;
        while (readFile.hasNextLine()) {
            String[] lineVector = readFile.nextLine().split(",");
            for (String element : lineVector) {
                dataMatrix[line][column++] = element;
                //column++;
            }
            line++;
            column = 0;
        }
        /*//Para imprimir a matriz.
        for (int i = 0; i < dataMatrix.length; i++) {
            for (int j = 0; j < dataMatrix[i].length; j++) {
                System.out.print(dataMatrix[i][j] + " | ");
            }
            System.out.println();
        }*/
        return dataMatrix;
    }

    public static void searchMenu() throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        String path = "Fichas_java/Files_Ficha_07/exercicio_10.csv";
        String pathTeste = "Fichas_java/Files_Ficha_07/testeEx_10.csv";

        int option;

        do {
            System.out.print("\n******** MENU PESQUISAS ********\n" +
                    "         -- Opções --\n" +
                    "1. Imprimir todos os Formandos.\n" +
                    "2. Pesquisar aluno por Matrícula.\n" +
                    "3. Lista de alunos por Curso.\n" +
                    "4. Aluno mais velho.\n" +
                    "5. Alunos em mais de um Curso\n" +
                    "6. Total de Formandos.\n" +
                    "7. Menu anterior\n" +
                    "Opção: ");

            option = input.nextInt();

            switch (option) {
                case 1:
                    printAllStudents(readFileToMatrix(pathTeste));
                    break;
                case 2:
                    printStudentByRegistration(readFileToMatrix(pathTeste));
                    break;
                case 3:
                    printStudentsByCourse(readFileToMatrix(pathTeste));
                    break;
                case 4:
                    getOldestStudent(readFileToMatrix(pathTeste));
                    break;
                case 5:
                    getStudentsWithMoreEnr(readFileToMatrix(pathTeste));
                    break;
                case 6:
                    totalNumberOfStudents(readFileToMatrix(pathTeste));
                    break;
                case 7:
                    System.out.println();
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        } while (option != 7);

    }

    public static void printAllStudents(String[][] matrix) {
        System.out.println("\nEstes são todos os Formandos:\n");
        int count = 0;
        for (String[] strings : matrix) {
            System.out.print(strings[0] + " | ");
            count++;
            if (count == 7) {
                System.out.println();
                count = 0;
            }
        }
        System.out.println();
    }

    public static void printStudentByRegistration(String[][] matrix) {
        Scanner input = new Scanner(System.in);

        int registrationNumber;

        System.out.print("\nPesquisa por n.º Matrícula\n" +
                "Insira número: ");
        registrationNumber = input.nextInt();

        for (String[] strings : matrix) {
            if (Integer.parseInt(strings[1]) == registrationNumber) {
                for (String string : strings) {
                    System.out.print(string + " | ");
                }
            }
        }
        System.out.println();
    }

    public static void printStudentsByCourse(String[][] matrix) {
        Scanner input = new Scanner(System.in);

        String course;
        int studentsCount = 0;

        System.out.print("\nPesquisa por Curso\n" +
                "Insira Curso: ");
        course = input.nextLine();
        System.out.print("***************************************************");
        System.out.println("\nLista de alunos neste curso:");
        for (String[] strings : matrix) {
            if (Objects.equals(strings[2], course)) {
                studentsCount++;
                System.out.print("Nome: " + strings[0] + " | Matrícula: " + strings[1]);
                System.out.println();
            }
        }
        System.out.println("\nTotal de alunos em " + course + ": " + studentsCount);
        System.out.println("***************************************************");
    }

    public static void getOldestStudent(String[][] matrix) {
        int oldestStudentAge = 0;
        String oldestStudent = null;

        for (int i = 0; i < matrix.length; i++) {
            if (Integer.parseInt(matrix[i][4]) > oldestStudentAge) {
                oldestStudentAge = Integer.parseInt(matrix[i][4]);
                oldestStudent = matrix[i][0];
            }
        }
        System.out.println("\n****************************************************" +
                "\n O aluno mais velho é " + oldestStudent + " com " + oldestStudentAge + " anos." +
                "\n****************************************************");

    }

    public static void getStudentsWithMoreEnr(String[][] matrix) {
        int count = 0;

        System.out.println("\nOs alunos inscritos em mais de um curso são:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix.length; j++) {
                if (Objects.equals(matrix[i][1], matrix[j][1])) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.print(matrix[i][0] + " | ");
            }
            count = 0;
        }
        System.out.println();
    }

    public static void totalNumberOfStudents(String[][] matrix) {
        System.out.println("\nO número de alunos no ficheiro é: " + matrix.length);
    }

    public static String[][] addNewStudent(String[][] matrix, String path) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        PrintWriter printWriter = new PrintWriter(path);


        int newSize = matrix.length + 1;
        int lastIndex = newSize - 1;

        String[][] updatedMatrix = new String[newSize][matrix[0].length]; //Inicia nova matriz com +1 linha e número de colunas = antiga.

        //Passo os dados da matriz antiga para a nova que tem mais uma linha.
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                updatedMatrix[i][j] = matrix[i][j];
            }
        }

        //Começa a inserir a nova linha
        System.out.print("\nInsira o nome do Formando: ");
        updatedMatrix[lastIndex][0] = input.nextLine();

        System.out.print("Insira o número do Formando: ");
        updatedMatrix[lastIndex][1] = input.nextLine();

        System.out.print("Insira o curso do Formando: ");
        updatedMatrix[lastIndex][2] = input.nextLine();

        System.out.print("Insira o email do Formando: ");
        updatedMatrix[lastIndex][3] = input.nextLine();

        System.out.print("Insira a idade do Formando: ");
        updatedMatrix[lastIndex][4] = input.nextLine();

        System.out.println("  * Inserção concluída *\n");


        //Imprime a matriz de volta para o csv para atualizar.
        //Volta a colocar o cabeçalho no csv senão vai dar problema.
        String header = "nome,numero,curso,email,idade";
        printWriter.println(header);

        //A seguir passa o resto das linhas para o csv.
        for (String[] strings : updatedMatrix) {
            String line = String.join(",", strings);
            //String line = Arrays.toString(strings);
            printWriter.println(line);
        }
        printWriter.close();

        return updatedMatrix;
    }

    public static void editStudentData(String[][] matrix, String path) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        PrintWriter printWriter = new PrintWriter(new File(path));

        String studentNumber;

        System.out.print("Insira n.º de matrícula do aluno a alterar: ");
        studentNumber = input.next();

        for (String[] strings : matrix) {
            if (Objects.equals(strings[1], studentNumber)) {
                System.out.print("Altere Nome: ");
                strings[0] = input.next();

                System.out.print("Altere Curso: ");
                strings[2] = input.next();

                System.out.print("Altere E-mail: ");
                strings[3] = input.next();

                System.out.print("Altere Idade: ");
                strings[4] = input.next();
            }
        }
        System.out.println("* Fim de Edição *");

        //Imprime a matriz de volta para o csv para atualizar.
        //Volta a colocar o cabeçalho no csv senão vai dar problema.
        String header = "nome,numero,curso,email,idade";
        printWriter.println(header);

        //A seguir passa o resto das linhas para o csv.
        for (String[] strings : matrix) {
            String line = String.join(",", strings);
            printWriter.println(line);
        }
        printWriter.close();
    }

    public static void deleteStudentData(String[][] matrix, String path) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        PrintWriter printWriter = new PrintWriter(new File(path));

        String studentNumber;

        System.out.print("Insira n.º de matrícula do aluno a apagar: ");
        studentNumber = input.next();

        for (String[] strings : matrix) {
            if (Objects.equals((strings[1]), studentNumber)) {
                strings[0] = "";
                strings[1] = "";
                strings[2] = "";
                strings[3] = "";
                strings[4] = "";
            }
        }
        System.out.println("* Operação Concluída *");

        //Imprime a matriz de volta para o csv para atualizar.
        //Volta a colocar o cabeçalho no csv senão vai dar problema.
        String header = "nome,numero,curso,email,idade";
        printWriter.println(header);

        //A seguir passa o resto das linhas para o csv.
        for (String[] strings : matrix) {
            String line = String.join(",", strings);
            printWriter.println(line);
        }
        printWriter.close();

        /*
        //Comsigo apagar a linha mas preciso resolver strings[0]
         for (String[] strings : matrix) {
            String line = String.join(",", strings);
            if (strings[0] == ""){
                line = "";
            }
                printWriter.println(line);
        }
        printWriter.close();
        */
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        String path = "Fichas_java/Files_Ficha_07/exercicio_10.csv";
        String pathTeste = "Fichas_java/Files_Ficha_07/testeEx_10.csv";

        int option;

        System.out.println("\n*** BEM VINDO AO PROGRAMA 'GESTÃO DE ALUNOS' ***\n");

        do {
            System.out.print("**** MENU INICIAL ****\n" +
                    "     -- Opções --\n" +
                    "1. Pesquisas\n" +
                    "2. Criar Formando\n" +
                    "3. Editar Formando\n" +
                    "4. Eliminar Formando\n" +
                    "5. Sair\n" +
                    "Opção: ");
            option = input.nextInt();

            switch (option) {
                case 1:
                    searchMenu();

                    break;
                case 2:
                    addNewStudent(readFileToMatrix(pathTeste), pathTeste);
                    break;
                case 3:
                    editStudentData(readFileToMatrix(pathTeste), pathTeste);
                    break;
                case 4:
                    deleteStudentData(readFileToMatrix(pathTeste), pathTeste);
                    break;
                case 5:
                    System.out.println("\nAté à próxima! :-)");
                    break;
                default:
                    System.out.println("\nOpção inválida!");
                    break;
            }
        } while (option != 5);
    }
}

