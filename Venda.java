package Entidade;

public class Venda {
    private int venCodigo;
    private int func;
    private int cliente;
    private String data;
    private double valor;
    private String pagamento;
    private int parcelas;
    private double desconto;
    private double frete;
    private double valorFinal;

    public Venda () {

    }

    public Venda(int venCodigo, int func, int cliente, String data, double valor, String pagamento,
            int parcelas, double desconto, double frete, double valorFinal) {
        this.venCodigo = venCodigo;
        this.func = func;
        this.cliente = cliente;
        this.data = data;
        this.valor = valor;
        this.pagamento = pagamento;
        this.parcelas = parcelas;
        this.desconto = desconto;
        this.frete = frete;
        this.valorFinal = valorFinal;
    }

    public int getVenCodigo() {
        return venCodigo;
    }

    public void setVenCodigo(int venCodigo) {
        this.venCodigo = venCodigo;
    }

    public int getFunc() {
        return func;
    }

    public void setFunc(int func) {
        this.func = func;
    }

    public int getCliente() {
        return cliente;
    }

    public void setCliente(int cliente) {
        this.cliente = cliente;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getPagamento() {
        return pagamento;
    }

    public void setPagamento(String pagamento) {
        this.pagamento = pagamento;
    }

    public int getParcelas() {
        return parcelas;
    }

    public void setParcelas(int parcelas) {
        this.parcelas = parcelas;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double getFrete() {
        return frete;
    }

    public void setFrete(double frete) {
        this.frete = frete;
    }

    public double getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(double valorFinal) {
        this.valorFinal = valorFinal;
    }
    
    public String toString() {
        return  "Código da venda: " + this.getVenCodigo() + 
                "\nCódigo do funcionário: " + this.getFunc() + "\nCódigo do Cliente: "
                + this.getCliente() + "\nValor total: R$ " + this.getValor() +
                "\nDesconto: R$ " + this.getDesconto() + "\nFrete: R$ " + this.getFrete()
                + "\nValor Final: R$ " + this.getValorFinal() + "\nForma de Pagamento: "
                + this.getPagamento() + "\nNúmero de parcelas: " + this.getParcelas()
                + "\nData de Pagamento: " + this.getData();
    }
    
} 
