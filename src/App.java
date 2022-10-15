import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        curso curso = new curso();
        Scanner leia = new Scanner(System.in);

        System.out.println("Bem vindo ao programa de cursos");
        System.out.print("Digite o nome do curso:");
        curso.nome = leia.nextLine();

        System.out.print("Digite a quantidade de aluno:");
        curso.quantidade = leia.nextInt();
        leia.nextLine();

        System.out.print("Digite a turma: ");
        curso.turma = leia.nextLine();

        System.out.print("Digite o valor da mensalidade: ");
        curso.mensalidade = leia.nextFloat();

        curso.calculaTotaldeMensalidade();
        curso.imprimeDados();

        leia.close();
    }
}