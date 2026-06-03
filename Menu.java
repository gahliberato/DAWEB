package presentation;
import business.service.ServicoAcademico;
import business.service.AlunoDTO;
import business.service.DisciplinaDTO;
import java.util.Scanner;

public class Menu {
    private ServicoAcademico servico = new ServicoAcademico();
    private Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Menu().executar();
    }

    public void executar() {
        int op;
        do {
            System.out.println("\n1-Cadastrar Disciplina | 2-Cadastrar Aluno | 3-Vincular Aluno a Disciplina | 4-Listar");
            System.out.println("5-Editar Disciplina | 6-Editar Aluno | 7-Sair");
            System.out.print("Opção: ");
            op = Integer.parseInt(sc.nextLine());

            switch (op) {
                case 1: cadastrarD(); break;
                case 2: cadastrarA(); break;
                case 3: vincular(); break;
                case 4: listarTudo(); break;
                case 5: editarD(); break; 
                case 6: editarA(); break;
                case 7: sair(); break;
            } 
        } while (op != 7);
    }

    private void cadastrarD() {
        System.out.print("Código: ");
        int cod = Integer.parseInt(sc.nextLine());

        System.out.print("Nome: ");
        String nomeD = sc.nextLine();

        System.out.print("Professor: ");
        String prof = sc.nextLine();

        System.out.print("Curso: ");
        String curso = sc.nextLine();

        servico.cadastrarDisciplina(
            new DisciplinaDTO(cod, nomeD, prof, curso));
    }

    private void cadastrarA() {
        System.out.print("Matrícula: ");
        int mat = Integer.parseInt(sc.nextLine());

        System.out.print("Nome: ");
        String nomeA = sc.nextLine();

        System.out.print("CPF: ");
        String cpf = sc.nextLine();

        servico.cadastrarAluno(
            new AlunoDTO(nomeA, mat, cpf));
    }

    private void vincular() {
        System.out.print("Matrícula do aluno: ");
        int m = Integer.parseInt(sc.nextLine());

        System.out.print("Código da disciplina: ");
        int c = Integer.parseInt(sc.nextLine());

        AlunoDTO a = servico.buscarAluno(m);
        DisciplinaDTO d = servico.buscarDisciplina(c);

        if (a != null && d != null) {
            a.adicionarDisciplina(d);
            d.adicionarAluno(a);
            System.out.println("Aluno inserido na disciplina.");
        } else {
            System.out.println("Aluno ou disciplina não encontrado.");
        }
    }

    private void listarTudo() {
        System.out.println("\n--- DISCIPLINAS ---");
        for (DisciplinaDTO disc : servico.getDisciplinas()) {
            System.out.println(disc);
            for (AlunoDTO aluno : disc.getAlunos()) {
                System.out.println("  - " + aluno);
            }
        }

        System.out.println("\n--- ALUNOS ---");
        for (AlunoDTO aluno : servico.getAlunos()) {
            System.out.println(aluno);
        }
    }

    private void sair() {
        System.out.println("Tchau.");
    }
    private void editarA() {
        System.out.print("Matrícula do aluno: ");
        int m = Integer.parseInt(sc.nextLine());
        System.out.print("Novo Nome: ");
        String n = sc.nextLine();
        System.out.print("Novo CPF: ");
        String c = sc.nextLine();
        if(servico.editarAluno(m, n, c)) System.out.println("Aluno atualizado!");
        else System.out.println("Não encontrado.");
    }

    private void editarD() {
        System.out.print("Código da disciplina: ");
        int c = Integer.parseInt(sc.nextLine());
        System.out.print("Novo Nome: ");
        String n = sc.nextLine();
        System.out.print("Novo Professor: ");
        String p = sc.nextLine();
        if(servico.editarDisciplina(c, n, p)) System.out.println("Disciplina atualizada!");
        else System.out.println("Não encontrada.");
    }

}