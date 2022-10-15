public class curso {
    String nome;
    int quantidade;
    String turma;
    float mensalidade;
    float calculo;

    public curso() {

    }

    public curso(String nome, int quantidade,
            String turma, float mensaliade) {
        nome = nome;
        quantidade = quantidade;
        turma = turma;
        mensalidade = mensalidade;
    }

    void imprimeDados() {
        System.out.println("*******");
        System.out.println("Bem vindo ao programa de cursos");
        System.out.println("Digite seu nome: " + nome);
        System.out.println("Digite a quantidade de alunos: " + quantidade);
        System.out.println("Digite a turma: " + turma);
        System.out.println("Digite o valor da mensalidade: " + mensalidade);
        System.out.println("*******");

    }

    void calculaTotaldeMensalidade() {
        mensalidade = mensalidade * quantidade;
        System.out.println("Valor total de mensaliade: " + mensalidade);
    }

}
