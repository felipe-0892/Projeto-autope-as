package Entidade;

public class Produto {
    private int prodCodigo;
    private String referencia;
    private String prodNome;
    private String marca;
    private double precoVenda;
    private int quantEstoque;
    private String aplicacao;


    public Produto(int prodCodigo, String referencia, String prodNome, String marca, double precoVenda, 
    int quantEstoque, String aplicacao) {
        this.prodCodigo = prodCodigo;
        this.referencia = referencia;
        this.prodNome = prodNome;
        this.marca = marca;
        this.precoVenda = precoVenda;
        this.quantEstoque = quantEstoque;
        this.aplicacao = aplicacao;
    }


    public int getProdCodigo() {
        return prodCodigo;
    }


    public void setProdCodigo(int prodCodigo) {
        this.prodCodigo = prodCodigo;
    }


    public String getReferencia() {
        return referencia;
    }


    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }


    public String getProdNome() {
        return prodNome;
    }


    public void setProdNome(String prodNome) {
        this.prodNome = prodNome;
    }


    public String getMarca() {
        return marca;
    }


    public void setMarca(String marca) {
        this.marca = marca;
    }


    public double getPrecoVenda() {
        return precoVenda;
    }


    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }


    public int getQuantEstoque() {
        return quantEstoque;
    }


    public void setQuantEstoque(int quantEstoque) {
        this.quantEstoque = quantEstoque;
    }


    public String getAplicacao() {
        return aplicacao;
    }


    public void setAplicacao(String aplicacao) {
        this.aplicacao = aplicacao;
    }

    
    public String toString() {
        
        return "\nDados do produto: " + "\nCódigo: " + prodCodigo +"\nReferência: "+ referencia 
                + "\nNome: " + prodNome + "\nMarca: " + marca +"\nPreço de venda: R$ " 
                + precoVenda + "\nQuantidade no estoque: " + quantEstoque 
                + "\nAplicação do produto: " + aplicacao;
    }
    

}
