package business.service;
import java.util.ArrayList;

public class DisciplinaDTO {
    private int cod;      
    private String nomeD;
    private String prof;
    private ArrayList<AlunoDTO> alunos = new ArrayList<>();

    public DisciplinaDTO(int cod, String nomeD, String prof, String curso) {
        this.cod = cod;
        this.nomeD = nomeD;
        this.prof = prof;
    }

    public int getCod() { return cod; }
    public String getNomeD() { return nomeD; }
    public void setNomeD(String nomeD) { this.nomeD = nomeD; }
    public String getProf() { return prof; }
    public void setProf(String prof) { this.prof = prof; }
    public ArrayList<AlunoDTO> getAlunos() { return alunos; }

    public void adicionarAluno(AlunoDTO a) { this.alunos.add(a); }

    @Override
    public String toString() {
        return "Código: " + cod + " | Disciplina: " + nomeD;
    }
}