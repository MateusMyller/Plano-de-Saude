package projeto_mais_ou_menos_saude;


public class Gerente{
    private String nome;
    private String cpf;
    private double salario;
    private String dataNascimento;
    private String endereço;
    private String telefone;
    private String email;
    private String usuario;
    private String senha;

    public Gerente(String nome, String cpf, double salario, String dataNascimento, String endereço, String telefone, String email, String usuario, String senha){
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.dataNascimento = dataNascimento;
        this.endereço = endereço;
        this.telefone = telefone;
        this.email = email;
        this.usuario = usuario;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
     public void cadastrarGerente() {        

        Gerente gerente = new Gerente(nome, cpf, salario, dataNascimento, endereço, telefone, email, usuario, senha);
    }
}  
