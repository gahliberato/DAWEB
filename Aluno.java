package model.entity;
import java.util.ArrayList;

public class Aluno {
    private String nomeA; 
    private String cpf;
    private int mat;      
    private int idade;
    private ArrayList<Disciplina> disciplinas = new ArrayList<>();

    public Aluno(String nomeA, int mat, String cpf, int idade) {
        this.nomeA = nomeA;
        this.mat = mat;
        this.cpf = cpf;
        this.idade = idade;
    }

    public String getNomeA() { return nomeA; }
    public void setNome(String nomeA) { this.nomeA = nomeA; }
    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }
    public int getMatricula() { return mat; }
    public int getIdade() { return idade; }
    public void setIdade(int idade) { this.idade = idade; }

    public void adicionarDisciplina(Disciplina d) { this.disciplinas.add(d); }

    @Override
    public String toString() {
        return "Nome: " + nomeA + " | Matrícula: " + mat + " | CPF: " + cpf + " | Idade: " + idade;
    }
}