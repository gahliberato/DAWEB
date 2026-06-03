package business.service;
import java.util.ArrayList;

public class ServicoAcademico {
    private ArrayList<AlunoDTO> alunos = new ArrayList<>();
    private ArrayList<DisciplinaDTO> disciplinas = new ArrayList<>();

    public void cadastrarAluno(AlunoDTO a) { alunos.add(a); }
    public void cadastrarDisciplina(DisciplinaDTO d) { disciplinas.add(d); }

    public AlunoDTO buscarAluno(int matricula) {
        for (AlunoDTO a : alunos) {
            if (a.getMatricula() == matricula) return a;
        }
        return null;
    }

    public DisciplinaDTO buscarDisciplina(int codigo) {
        for (DisciplinaDTO d : disciplinas) {
            if (d.getCod() == codigo) return d;
        }
        return null;
    }

    // Novas funcionalidades de edição (Itens 1 e 2 da query)
    public boolean editarAluno(int matricula, String novoNome, String novoCpf) {
        AlunoDTO a = buscarAluno(matricula);
        if (a != null) {
            a.setNome(novoNome);
            a.setCpf(novoCpf);
            return true;
        }
        return false;
    }

    public boolean editarDisciplina(int codigo, String novoNome, String novoProf) {
        DisciplinaDTO d = buscarDisciplina(codigo);
        if (d != null) {
            d.setNomeD(novoNome);
            d.setProf(novoProf);
            return true;
        }
        return false;
    }

    public ArrayList<AlunoDTO> getAlunos() { return alunos; }
    public ArrayList<DisciplinaDTO> getDisciplinas() { return disciplinas; }
}