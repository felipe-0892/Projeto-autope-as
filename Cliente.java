//Lembrar de pesquisar como gerar sequências automáticas...

package Entidade;


public class Cliente extends Pessoa {
    private int cliCodigo;

    public Cliente(String nome, String cpf, String dataNascimento, Endereco endereco, String telefone,
            String email, String observacao, int cliCodigo) {
        super(nome, cpf, dataNascimento, endereco, telefone, email, observacao);
        this.cliCodigo = cliCodigo;
    }

    public int getCliCodigo() {
        return cliCodigo;
    }

    public void setCliCodigo(int cliCodigo) {
        this.cliCodigo = cliCodigo;
    } 
/*ALTERAR CLIENTES */

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





    @Override
    public String toString() {
        return "\nCódigo: " + this.getCliCodigo() + "\n" + super.toString();
    }
}
