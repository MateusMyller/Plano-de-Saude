package projeto_mais_ou_menos_saude;


public class Cliente {
    
    private String nome;
    private String cpf;
    private String dataNascimento;
    private String endereço;
    private String telefone;
    private String email;


    public Cliente(String nome, String cpf, String dataNascimento, String endereço, String telefone, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.nome = dataNascimento;
        this.nome = endereço;
        this.nome = telefone;
        this.nome = email;

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


        public void cadastrarCliente() {


        Cliente cliente = new Cliente(nome, cpf, dataNascimento, endereço, telefone, email);

    }
}
