package model.entity;
import java.util.ArrayList;

public class Disciplina {
    private int cod;      
    private String nomeD;
    private String prof;
    private ArrayList<Aluno> alunos = new ArrayList<>();

    public Disciplina(int cod, String nomeD, String prof, String curso) {
        this.cod = cod;
        this.nomeD = nomeD;
        this.prof = prof;
    }

    public int getCod() { return cod; }
    public String getNomeD() { return nomeD; }
    public void setNomeD(String nomeD) { this.nomeD = nomeD; }
    public String getProf() { return prof; }
    public void setProf(String prof) { this.prof = prof; }
    public ArrayList<Aluno> getAlunos() { return alunos; }

    public void adicionarAluno(Aluno a) { this.alunos.add(a); }

    @Override
    public String toString() {
        return "Código: " + cod + " | Disciplina: " + nomeD;
    }
}