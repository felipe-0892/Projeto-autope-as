package Entidade;

public class Endereco {
    private String logradouro;
    private String numCasa;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;
    private String complemento;

    public Endereco() {
        
    }

    public Endereco(String logradouro, String numCasa, String bairro, String cidade, String estado,
            String cep, String complemento) {
        this.logradouro = logradouro;
        this.numCasa = numCasa;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.complemento = complemento;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumCasa() {
        return numCasa;
    }

    public void setNumCasa(String numCasa) {
        this.numCasa = numCasa;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    @Override
    public String toString() {
        
        return "Endereço: "+ this.getLogradouro() + ", " + this.getNumCasa() + ", " 
            + this.getComplemento() + " - " + this.getBairro() + ", " + this.getCidade() + 
            ", " + this.getEstado() + ", " + this.getCep();
    }

    

    
}
