package Entidade;

import java.util.List;

public class Item {
    List <Produto> prod;
    private Venda venda;
    private int quant;

    public Item(){

    }

    public Item(List<Produto> prod, Venda venda, int quant) {
        this.prod = prod;
        this.venda = venda;
        this.quant = quant;
    }

    public List<Produto> getProd() {
        return prod;
    }
    public void setProd(List<Produto> prod) {
        this.prod = prod;
    }
    public Venda getVenda() {
        return venda;
    }
    public void setVenda(Venda venda) {
        this.venda = venda;
    }
    public int getQuant() {
        return quant;
    }
    public void setQuant(int quant) {
        this.quant = quant;
    }

    public void removerQuant(int codigo){
        for (Produto produto : prod) {
            if (codigo == produto.getProdCodigo()) {
                produto.setQuantEstoque(produto.getQuantEstoque() - this.getQuant());
            }
        }
    }

    public void listarProdutos(){
        System.out.println("\nCódigo do Produto       Desc                    Quant        P.Venda");
        for (Produto p : prod) {
            System.out.println("       " + p.getProdCodigo() + "         " + p.getProdNome() + ", " + p.getReferencia()
                               + ", " + p.getMarca() + "        " + this.getQuant() + "        R$ " + p.getPrecoVenda());
        }
    }
    
    @Override
    public String toString() {
        listarProdutos();
        return "Dados da venda: \n" + this.getVenda();
    }
}
