package Entidade;
 

public class Pessoa {
    protected String nome;
    protected String cpf;
    protected String dataNascimento;
    protected Endereco endereco;
    protected String telefone;
    protected String email;
    protected String observacao;
    /*para Alterar funcionário */
    protected String cargo;


    public Pessoa(String nome, String cpf, String dataNascimento, Endereco endereco, String telefone,
            String email, String observacao) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.observacao = observacao;
    }

    public String toString() {
        return "Nome: " + nome +
                "\nCPF: " + cpf + "\nData de Nascimento: " + dataNascimento + 
                "\n" + endereco + "\nTelefone: " + telefone +
                "\nE-mail: " + email + "\nObservacao: " + observacao;
    }
    
}
