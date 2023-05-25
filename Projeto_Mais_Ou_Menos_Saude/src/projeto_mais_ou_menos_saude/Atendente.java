package projeto_mais_ou_menos_saude;


public class Atendente extends Gerente {
    
public Atendente(String nome, String cpf, double salario, String dataNascimento, String endereço, String telefone, String email, String usuario, String senha) {
        super(nome, cpf, salario, dataNascimento, endereço, telefone, email, usuario, senha);
}
    
    public void cadastrarAtendente() {       

        Atendente atendente = new Atendente(getNome(), getCpf(), getSalario(), getDataNascimento(), getEndereço(),
                getTelefone(), getEmail(), getUsuario(), getSenha());
    }
}      
    