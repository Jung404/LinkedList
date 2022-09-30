import java.util.LinkedList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        LinkedList<Alunos> listaAlunos = new LinkedList<>();

        int opcao = 0;

        while (opcao <= 4) {

            System.out.println("DIGITE UMA OPÇÃO");
            System.out.println("1 - CADASTRAR ALUN0");
            System.out.println("2 - LISTAR TODOS ");
            System.out.println("3 - REMOVER");
            System.out.println("4 - PESQUISAR");
            opcao = ler.nextInt();

            switch (opcao) {

                case 1:
                    System.out.println("Digite o nome do aluno");
                    String nomeAluno = ler.next();

                    System.out.println("Digite a matricula do aluno");
                    String matriculaAluno = ler.next();

                    System.out.println("Digite a data de nascimento do aluno");
                    String datanascAluno = ler.next();

                    Alunos aln1 = new Alunos(nomeAluno, matriculaAluno, datanascAluno);

                    listaAlunos.add(aln1);

                    break;

                case 2:
                    for (Alunos a : listaAlunos) {

                        System.out.println(a);
                    }

                    System.out.println("");
                    break;
                case 3:

                    System.out.println("digite a posicao para remover");
                    String remover = ler.next();

                    boolean removed = listaAlunos.remove(listaAlunos.get(Integer.valueOf(remover)));

                    if (removed) {
                        System.out.println("removido com sucesso");
                    } else {
                        System.out.println("nao foi removido");
                    }

                    break;
                case 4:

                    System.out.println("digite a posicao para pesquisar");
                    String pesquisar = ler.next();

                    System.out.println(listaAlunos.get(Integer.valueOf(pesquisar)));
                    break;
                default:
                    break;
            }
        }
    }
}
