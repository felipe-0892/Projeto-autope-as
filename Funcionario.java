package Entidade;

public class Funcionario extends Pessoa {
    private int funcCodigo;
    private String cargo;


    public Funcionario(String nome, String cpf, String dataNascimento, Endereco endereco,
            String telefone, String email, String observacao, int funcCodigo, String cargo) {
        super(nome, cpf, dataNascimento, endereco, telefone, email, observacao);
        this.funcCodigo = funcCodigo;
        this.cargo = cargo;
    }


    public int getFuncCodigo() {
        return funcCodigo;
    }


    public void setFuncCodigo(int funcCodigo) {
        this.funcCodigo = funcCodigo;
    }


    public String getCargo() {
        return cargo;
    }


    public void setCargo(String cargo) {
        this.cargo = cargo;
    } 

    /*ALTERAR FUNCIONÁRIOS */

    public void setNome (String nome){
        super.nome=nome;
    }

    public void setCPF (String cpf){
        super.cpf=cpf;
    }

    public void setdataNasc (String dataNascimento){
        super.dataNascimento=dataNascimento;
    }

    public void setLogradouro (String string){
        super.endereco=endereco;
    }

    public void setNumcasa (String string){
        super.endereco=endereco;
    }

    public void setBairro (String string){
        super.endereco=endereco;
    }

    public void setCidade (String string){
        super.endereco=endereco;
    }

    public void setEstado (String string){
        super.endereco=endereco;
    }

    public void setCep (String string){
        super.endereco=endereco;
    }

    public void setComplemento (String string){
        super.endereco=endereco;
    }

    public void setTelefone (String telefone){
        super.telefone=telefone;
    }

    public void setEmail (String email){
        super.email=email;
    }
    
    public void setcargo (String cargo){
        super.cargo=cargo;
    }


    @Override
    public String toString() {
        return "\nCódigo: "+ this.getFuncCodigo() + "\n" + super.toString() + "\nCargo: " + this.getCargo();
    }
}
