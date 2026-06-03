package business.service;
import java.util.ArrayList;

public class AlunoDTO {
    private String nomeA; 
    private String cpf;
    private int mat;      
    private ArrayList<DisciplinaDTO> disciplinas = new ArrayList<>();

    public AlunoDTO(String nomeA, int mat, String cpf) {
        this.nomeA = nomeA;
        this.mat = mat;
        this.cpf = cpf;
    }

    public String getNomeA() { return nomeA; }
    public void setNome(String nomeA) { this.nomeA = nomeA; }
    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }
    public int getMatricula() { return mat; }

    public void adicionarDisciplina(DisciplinaDTO d) { this.disciplinas.add(d); }

    @Override
    public String toString() {
        return "Nome: " + nomeA + " | Matrícula: " + mat + " | CPF: " + cpf;
    }
    }
