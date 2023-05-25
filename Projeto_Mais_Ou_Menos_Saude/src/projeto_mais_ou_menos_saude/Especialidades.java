package projeto_mais_ou_menos_saude;



public class Especialidades {

    private String nomeEspecialidades;

    public Especialidades(String nomeEspecialidades) {
        this.nomeEspecialidades = nomeEspecialidades;
    }

    public String getNomeEspecialidades() {
        return nomeEspecialidades;
    }

    public void setEspecialidades(String nomeEspecialidades) {
        this.nomeEspecialidades = nomeEspecialidades;
    }
   
    public void cadastrarEspecialidades() {

        Especialidades especialidades = new Especialidades(nomeEspecialidades);

    }
}