package Aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Entidade.*;

public class Autopeca {
    public static void main(String[] args) {
        // Declaração de Variáveis
        Scanner dado = new Scanner(System.in);
        List<Cliente> cli = new ArrayList<Cliente>();
        List<Funcionario> func = new ArrayList<Funcionario>();
        List<Produto> prod = new ArrayList<Produto>();
        List<Produto>pro = new ArrayList<Produto>();
        Item item = new Item();
        List<Item> vendas = new ArrayList<Item>();
        int op;
        char r, resp;

        do{
            System.out.println("---------- MENU DE OPÇÕES ----------\n");
            System.out.println("Código         Função               ");
            System.out.println("  1            Cadastrar Cliente    ");
            System.out.println("  2            Cadastrar Funcionário");
            System.out.println("  3            Cadastrar Produto    ");
            System.out.println("  4            Alterar Produto      ");
            System.out.println("  5            Alterar Cliente      ");
            System.out.println("  6            Alterar Funcionário  ");
            System.out.println("  7            Realizar Venda       ");
            System.out.println("  8            Consultar Clientes   ");
            System.out.println("  9            Consultar Produtos   ");
            System.out.println(" 10            Consultar Funcionario");
            System.out.println(" 11            Consultar Venda      ");
            System.out.println(" 12            Sair                 ");
            System.out.print("\nEscolha uma das opções listadas acima: ");
            op = dado.nextInt();

            //Laço de repetição para não permitir valores Inválidos
            while (op<1 || op>12) {
                System.out.println("Opção Inválida. Por favor digite novamente: ");
                op = dado.nextInt();
            }

            switch (op) {
                case 1:
                    int codcli =  0;
                    do {
                        System.out.println("\n------------- CADASTRO DE CLIENTES -------------\n");
                        // Informações Pessoais
                        codcli ++;
                        System.out.print("Nome: ");
                        dado.nextLine();
                        String nome = dado.nextLine();
                        System.out.print("CPF: ");
                        String cpf = dado.next();
                        System.out.print("Data de Nascimento: ");
                        String dataNasc = dado.next();
                        // Endereço
                        System.out.println("\nEndereço: ");
                        System.out.print("Logradouro: ");
                        dado.nextLine();
                        String log = dado.nextLine();
                        System.out.print("Número: ");
                        String num = dado.next();
                        System.out.print("Bairro: ");
                        dado.nextLine();
                        String bairro = dado.nextLine();
                        System.out.print("Cidade: ");
                        String cid = dado.nextLine();
                        System.out.print("Estado: ");
                        String uf = dado.nextLine();
                        System.out.print("CEP: ");
                        String cep = dado.nextLine();
                        System.out.print("Complemento: ");
                        String complemento = dado.nextLine();
                        //Contato
                        System.out.println("\nContato:");
                        System.out.print("Telefone: ");
                        String tel = dado.next();
                        System.out.print("E-mail: ");
                        dado.nextLine();
                        String email = dado.nextLine();
                        //Observações
                        System.out.print("\nObservação: ");
                        String obs = dado.nextLine();

                        cli.add(new Cliente(nome, cpf, dataNasc, new Endereco(log, num, bairro, cid, uf, cep, complemento), tel, email, obs, codcli));
                        System.out.println("\nCliente cadastrado com sucesso!\n");
                        System.out.println(cli);
                        System.out.print("\nDeseja cadastrar mais um cliente? (S/N) ");
                        resp = dado.next().charAt(0);
                        resp = Character.toUpperCase(resp);
                    } while (resp != 'N');
                break;

                case 2:
                    int codfun = 0;
                    do {
                        System.out.println("\n------------- CADASTRO DE FUNCIONÁRIOS -------------\n");
                        // Informações Pessoais
                        codfun++;
                        System.out.print("Nome: ");
                        dado.nextLine();
                        String nome = dado.nextLine();
                        System.out.print("CPF: ");
                        String cpf = dado.next();
                        System.out.print("Data de Nascimento: ");
                        String dataNasc = dado.next();
                        // Endereço
                        System.out.println("\nEndereço: ");
                        System.out.print("Logradouro: ");
                        dado.nextLine();
                        String log = dado.nextLine();
                        System.out.print("Número: ");
                        String num = dado.next();
                        System.out.print("Bairro: ");
                        dado.nextLine();
                        String bairro = dado.nextLine();
                        System.out.print("Cidade: ");
                        String cid = dado.nextLine();
                        System.out.print("Estado: ");
                        String uf = dado.nextLine();
                        System.out.print("CEP: ");
                        String cep = dado.nextLine();
                        System.out.print("Complemento: ");

                        String complemento = dado.nextLine();
                        //Contato
                        System.out.println("\nContato:");
                        System.out.print("Telefone: ");
                        String tel = dado.next();
                        System.out.println("E-mail: ");
                        dado.nextLine();
                        String email = dado.nextLine();
                        //Observações
                        System.out.println("\nObservação: ");
                        String obs = dado.nextLine();
                        //Cargo
                        System.out.println("\nCargo:");
                        String cargo = dado.nextLine();
                        Endereco e = new Endereco(log, num, bairro, cid, uf, cep, complemento);
                        func.add(new Funcionario(nome, cpf, dataNasc,e , tel, email, obs, codfun, cargo));

                        System.out.println("\nFuncionario cadastrado com sucesso! \n");

                        System.out.println(func);

                        System.out.print("\nDeseja cadastrar mais um funcionário? (S/N) ");
                        resp = dado.next().charAt(0);
                        resp = Character.toUpperCase(resp);
                    } while (resp != 'N');
                break;

                case 3:
                    int codProd=0;
                    do {
                        System.out.println("\n------------- CADASTRO DE PRODUTOS -------------\n");
                        codProd++;
                        System.out.print("Nome: ");
                        dado.nextLine();
                        String nome = dado.nextLine();
                        System.out.print("Referência:");
                        String ref = dado.next();
                        System.out.print("Marca: ");
                        String marca = dado.next();
                        System.out.print("Preço de venda: ");
                        double precoVenda = dado.nextDouble();
                        System.out.print("Quantidade de estoque: ");
                        int qtde = dado.nextInt();
                        System.out.print("Aplicação: ");
                        dado.nextLine();
                        String aplicacao = dado.nextLine();

                        prod.add(new Produto(codProd, ref, nome, marca, precoVenda, qtde, aplicacao));

                        System.out.println("\nProduto cadastrado com sucesso!\n");

                        System.out.println(prod);

                        System.out.print("\nDeseja cadastrar mais um produto? (S/N) ");
                        resp = dado.next().charAt(0);
                        resp = Character.toUpperCase(resp);
                    } while (resp != 'N');    
                break;

                case 4:
                    do {
                        System.out.println("\n------------- ALTERAR PRODUTOS -------------\n");
                        System.out.print("Digite o código do produto: ");
                        int cod = dado.nextInt();
                        boolean e = false;
                        for (Produto p : prod) {
                            if (cod == p.getProdCodigo()) {
                                e=true;
                                System.out.println(p);
                                System.out.println("\n   ALTERAR: ");
                                System.out.println(" 1   Nome do Produto");
                                System.out.println(" 2   Referência");
                                System.out.println(" 3   Marca");
                                System.out.println(" 4   Preco de Venda");
                                System.out.println(" 5   Quantidade em estoque");
                                System.out.println(" 6   Aplicação do Produto");
                                System.out.println("Escolha uma das opções: ");
                                int opcoes = dado.nextInt();
                                while (opcoes<1 || opcoes>6) {
                                    System.out.println("Opção Inválida! \nEscolha outra opção:");
                                    opcoes = dado.nextInt();
                                }
                                switch (opcoes) {
                                    case 1:
                                        System.out.println("Digite o nome do produto: ");
                                        p.setProdNome(dado.nextLine());
                                        break;
                                    case 2:
                                        System.out.println("Digite a referência do produto: ");
                                        p.setReferencia(dado.next());
                                        break;
                                    case 3:
                                        System.out.println("Digite a marca do produto: ");
                                        p.setMarca(dado.next());
                                        break;
                                    case 4:
                                        System.out.println("Digite o preço de venda: ");
                                        p.setPrecoVenda(dado.nextDouble());
                                        break;
                                    case 5:
                                        System.out.println("Digite a quantidade em estoque: ");
                                        p.setQuantEstoque(dado.nextInt());
                                        break;  
                                    default:
                                        System.out.println("Digite a aplicação do produto: ");
                                        p.setAplicacao(dado.nextLine());
                                        break;
                                }
                            }
                            
                        }
                        if (e==false) {
                            System.out.println("Produto não encontrado!"); 
                        }

                        System.out.print("\nDeseja alterar mais um produto? (S/N) ");
                        resp = dado.next().charAt(0);
                        resp = Character.toUpperCase(resp);
                        while (resp != 'S' && resp != 'N') {
                            System.out.println("Valor inválido! Digite novamente (S/N)");
                            resp = dado.next().charAt(0);
                            resp = Character.toUpperCase(resp);
                        }
                    } while (resp != 'N');
                    
                break;
                /*Feito por felipe (Caso esteja errado, pode me dar um grito para cada erro achado!) */
                case 5:
                    do {
                        System.out.println("Digite o código do cliente: ");
                    int cod = dado.nextInt();
                    boolean e = false;
                    for (Cliente c : cli) {
                        if (cod == c.getCliCodigo()) {
                            e = true;
                            System.out.println(c);
                            System.out.println("\nAlterar");
                            System.out.println("1 Nome");
                            System.out.println("2 CPF");
                            System.out.println("3 Data de Nascimento");
                            System.out.println("4 Logradouro");
                            System.out.println("5 Número da casa");
                            System.out.println("6 Bairro");
                            System.out.println("7 Cidade");
                            System.out.println("8 Estado");
                            System.out.println("9 Cep");
                            System.out.println("10 Complemento");
                            System.out.println("11 Telefone");
                            System.out.println("12 E-mail");
                            System.out.println("Escolha uma das opções");

                            int opcoes = dado.nextInt();
                            while (opcoes<1 || opcoes>12) {
                                System.out.println("Opção inválida \nEscolha outra opção: ");
                                opcoes = dado.nextInt();
                            }
                            switch (opcoes) {
                                case 1:
                                System.out.println("Digite o novo nome: ");
                                dado.nextLine();
                                c.setNome(dado.nextLine());
                                break;
                                
                                case 2:
                                System.out.println("Digite o novo CPF: ");
                                dado.nextLine();
                                c.setCPF(dado.nextLine());
                                break;

                                case 3:
                                System.out.println("Digite uma nova data de nascimento: ");
                                dado.nextLine();
                                c.setdataNasc(dado.nextLine());
                                break;

                                case 4:
                                System.out.println("Digite um novo logradouro: ");
                                dado.nextLine();
                                c.setLogradouro(dado.nextLine());
                                break;
                            
                                case 5:
                                System.out.println("Digite novo número de casa: ");
                                dado.nextLine();
                                c.setNumcasa(dado.nextLine());
                                break;
                            
                                case 6:
                                System.out.println("Digite um novo bairro: ");
                                dado.nextLine();
                                c.setBairro(dado.nextLine());
                                break;
                            
                                case 7:
                                System.out.println("Digite uma nova cidade: ");
                                dado.nextLine();
                                c.setCidade(dado.nextLine());
                                break;
                            
                                case 8:
                                System.out.println("Digite novo estado: ");
                                dado.nextLine();
                                c.setEstado(dado.nextLine());
                                break;
                            
                                case 9:
                                System.out.println("Digite novo CEP: ");
                                dado.nextLine();
                                c.setCep(dado.nextLine());
                                break;
                            
                                case 10:
                                System.out.println("Digite novo complemento: ");
                                dado.nextLine();
                                c.setComplemento(dado.nextLine());
                                break;
                            
                                case 11:
                                System.out.println("Digite novo número de telefone: ");
                                dado.nextLine();
                                c.setTelefone(dado.nextLine());
                                break;
                            
                                case 12:
                                System.out.println("Digite novo E-mail: ");
                                dado.nextLine();
                                c.setEmail(dado.nextLine());
                                break;
                            
                            }
                        } 

                    }
                    if (e == false) {
                        System.out.println("Cliente não encontrado!");
                    }

                    System.out.print("\nDeseja alterar mais algum cliente? (S/N) ");
                            resp = dado.next().charAt(0);
                            resp = Character.toUpperCase(resp);
                    
                    } while (resp != 'N');
                break;

                case 6:
                do {
                    System.out.println("Digite o código do funcionário: ");
                int cod = dado.nextInt();
                boolean e = false;
                for (Funcionario f : func) {
                    if (cod == f.getFuncCodigo()) {
                        e = true;
                        System.out.println(func);
                        System.out.println("\nAlterar");
                        System.out.println("1 Nome");
                        System.out.println("2 CPF");
                        System.out.println("3 Data de Nascimento");
                        System.out.println("4 Logradouro");
                        System.out.println("5 Número da casa");
                        System.out.println("6 Bairro");
                        System.out.println("7 Cidade");
                        System.out.println("8 Estado");
                        System.out.println("9 Cep");
                        System.out.println("10 Complemento");
                        System.out.println("11 Telefone");
                        System.out.println("12 E-mail");
                        System.out.println("13 Cargo");
                        System.out.println("Escolha uma das opções");

                        int opcoes = dado.nextInt();
                        while (opcoes<1 || opcoes>13) {
                            System.out.println("Opção inválida \nEscolha outra opção: ");
                            opcoes = dado.nextInt();
                        }
                        switch (opcoes) {
                            case 1:
                            System.out.println("Digite o novo nome: ");
                            dado.nextLine();
                            f.setNome(dado.nextLine());
                            break;
                            
                            case 2:
                            System.out.println("Digite o novo CPF: ");
                            dado.nextLine();
                            f.setCPF(dado.nextLine());
                            break;

                            case 3:
                            System.out.println("Digite uma nova data de nascimento: ");
                            dado.nextLine();
                            f.setdataNasc(dado.nextLine());
                            break;

                            case 4:
                            System.out.println("Digite um novo logradouro: ");
                            dado.nextLine();
                            f.setLogradouro(dado.nextLine());
                            break;
                        
                            case 5:
                            System.out.println("Digite novo número de casa: ");
                            dado.nextLine();
                            f.setNumcasa(dado.nextLine());
                            break;
                        
                            case 6:
                            System.out.println("Digite um novo bairro: ");
                            dado.nextLine();
                            f.setBairro(dado.nextLine());
                            break;
                        
                            case 7:
                            System.out.println("Digite uma nova cidade: ");
                            dado.nextLine();
                            f.setCidade(dado.nextLine());
                            break;
                        
                            case 8:
                            System.out.println("Digite novo estado: ");
                            dado.nextLine();
                            f.setEstado(dado.nextLine());
                            break;
                        
                            case 9:
                            System.out.println("Digite novo CEP: ");
                            dado.nextLine();
                            f.setCep(dado.nextLine());
                            break;
                        
                            case 10:
                            System.out.println("Digite novo complemento: ");
                            dado.nextLine();
                            f.setComplemento(dado.nextLine());
                            break;
                        
                            case 11:
                            System.out.println("Digite novo número de telefone: ");
                            dado.nextLine();
                            f.setTelefone(dado.nextLine());
                            break;
                        
                            case 12:
                            System.out.println("Digite novo E-mail: ");
                            dado.nextLine();
                            f.setEmail(dado.nextLine());
                            break;

                            case 13:
                            System.out.println("Digite um novo cargo para o funcionário: ");
                            dado.nextLine();
                            f.setcargo(dado.nextLine());
                            break;
                        
                        }
                    } 

                }
                if (e == false) {
                    System.out.println("Cliente não encontrado!");
                }

                System.out.print("\nDeseja alterar mais algum funcionário? (S/N) ");
                        resp = dado.next().charAt(0);
                        resp = Character.toUpperCase(resp);
                
                } while (resp != 'N');
                break;

                case 7:
                    int codven =0;
                    do{
                        codven++;
                        System.out.print("\nDigite o código do funcionário: ");
                        int codfunc = dado.nextInt();
                        boolean encontrado = false;
                        for (Funcionario f : func) {
                            if (codfunc == f.getFuncCodigo()) {
                                encontrado = true;                                
                            }
                        }
                        while (encontrado == false) {
                            System.out.println("Funcionário não encontrado!");
                            System.out.println("Informe um código válido: ");
                            codfunc = dado.nextInt();
                        }
                        System.out.print("Digite o código do cliente: ");
                        int codCli = dado.nextInt();
                        for (Cliente c : cli) {
                            if (codCli == c.getCliCodigo()) {    
                                encontrado = true;
                            }
                        }

                        while (encontrado == false) {
                            System.out.println("Cliente não encontrado!");
                            System.out.println("Informe um código válido: ");
                            codCli = dado.nextInt();
                        }

                        double valor=0, somavalor = 0;

                        do {
                            System.out.println("\n---------- Carrinho de Compras ----------\n");
                            System.out.println("Digite o código do produto: ");
                            int cod = dado.nextInt();
                            for (Produto p : prod) {
                                if (cod == p.getProdCodigo()) {
                                    pro.add(new Produto(p.getProdCodigo(), p.getReferencia(), p.getProdNome(), p.getMarca(),
                                    p.getPrecoVenda(), p.getQuantEstoque(), p.getAplicacao()));
                                    System.out.println("Digite a quantidade: ");
                                    item.setQuant(dado.nextInt()); 
                                    while (item.getQuant()>p.getQuantEstoque()) {
                                        System.out.println("Não temos estoque!");
                                        System.out.println("Estoque: " + p.getQuantEstoque());
                                        System.out.println("Digite a quantidade: ");
                                        item.setQuant(dado.nextInt());
                                    }
                                    valor = p.getPrecoVenda()*item.getQuant();
                                    /*item.removerQuant(p.getProdCodigo());*/
                                    encontrado = true;   
                                }                    
                            }
                            if (encontrado == false) {
                                System.out.println("Produto não encontrado!");
                            }
                            somavalor += valor;
                            System.out.print("\nDeseja incluir mais um produto? (S/N) ");
                            resp = dado.next().charAt(0);
                            resp = Character.toUpperCase(resp);
                        } while (resp != 'N');

                        System.out.print("Digite a data e a hora do pagamento: (dd/MM/yyy 00:00:00) ");
                        dado.nextLine();
                        String datahora = dado.nextLine();
                        System.out.println("Digite a forma de pagamento: ");
                        String pag = dado.next();
                        System.out.println("Digite o número de parcelas: ");
                        int parc = dado.nextInt();
                        System.out.println("Valor de desconto: ");
                        double desc = dado.nextDouble();
                        System.out.println("Valor do frete: ");
                        double frete = dado.nextDouble();
                        double vf = (somavalor + frete) - desc;

                        vendas.add(new Item(pro, new Venda(codven, codfunc, codCli, datahora, somavalor, 
                        pag, parc, desc, frete, vf), item.getQuant()));
                       
                        System.out.println("Venda realizada com sucesso!\n");
                        System.out.println(vendas);

                        System.out.print("\nDeseja realizar mais uma venda? (S/N) ");
                        resp = dado.next().charAt(0);
                        resp = Character.toUpperCase(resp);
                    } while (resp != 'N');
                break;

                case 8:
                    System.out.println("Deseja consultar um cliente em específico: (S/N) ");
                    resp = dado.next().charAt(0);
                    resp = Character.toUpperCase(resp);
                    while (resp != 'S' && resp != 'N') {
                        System.out.println("Opção Inválida! \nPor favor digite S ou N: ");
                        resp = dado.next().charAt(0);
                        resp = Character.toUpperCase(resp);
                    }
                    if (resp == 'S') {
                        System.out.println("Informe o código do cliente: ");
                        int codCli = dado.nextInt();
                        for (Cliente c : cli) {
                            if (codCli == c.getCliCodigo()) {
                                System.out.println(c);
                            } else{
                                System.out.println("Cliente não encontrado.");
                            }
                        }
                    } else {
                        for (Cliente c : cli) {
                            System.out.println(c);
                        }
                    }
                break;

                case 9:
                    for (Produto p : prod) {
                        System.out.println(p);
                    }
                break;
                
                case 10:
                    for (Funcionario f : func) {
                        System.out.println(f);
                    }
                break;

                case 11:
                    for (Item v : vendas) {
                        System.out.println(v);
                    }
                break;

                case 12:
                break;

            
                default:
                    break;
            }

            //Condição para que possa ser opcional retornar ao menu
            if (op!=12) {
                System.out.print("Deseja retornar ao menu? (S/N) ");
                r = dado.next().charAt(0);
                r = Character.toUpperCase(r);
                if (r == 'N') {
                    op = 12;
                }
            }
            
        } while(op != 12);

        System.out.println("Programa Encerrado!");

        dado.close();
    }
}