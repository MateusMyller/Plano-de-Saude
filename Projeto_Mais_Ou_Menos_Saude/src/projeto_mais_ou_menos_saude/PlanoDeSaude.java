package projeto_mais_ou_menos_saude;



public class PlanoDeSaude {
    
    private String nomeDoPlano;
    private String especialidades;
    private String clinicas;


    public PlanoDeSaude(String nomeDoPlano, String especialidades, String clinicas) {
        this.nomeDoPlano = nomeDoPlano;
        this.especialidades = especialidades;
        this.clinicas = clinicas;
    }
    
    public String getNomeDoPlano() {
        return nomeDoPlano;
    }

    public void setNomeDoPlano(String nomeDoPlano) {
        this.nomeDoPlano = nomeDoPlano;
    }

    public String getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(String especialidades) {
        this.especialidades = especialidades;
    }
    
    public String getClinicas() {
        return clinicas;
    }

    public void setClinicas(String clinicas) {
        this.clinicas = clinicas;
    }

  

    public void cadastrarPlanoDeSaude() {

        PlanoDeSaude planoDeSaude = new PlanoDeSaude(nomeDoPlano, especialidades, clinicas);
        
    }

}