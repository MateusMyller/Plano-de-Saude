package projeto_mais_ou_menos_saude;


public class Dependente{

    private String nome;
    private String cpf;
    private String dataNascimento;
    private String grauParentesco;

    

    public Dependente(String nome, String cpf, String dataNascimento, String grauParentesco) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.grauParentesco = grauParentesco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpfTitular() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getGrauParentesco() {
        return grauParentesco;
    }

    public void setGrauParentesco(String grauParentesco) {
        this.grauParentesco = grauParentesco;
    }
    
    public void cadastrarDependente(){
        Dependente dependente = new Dependente(nome, cpf, dataNascimento, grauParentesco);
    }
}