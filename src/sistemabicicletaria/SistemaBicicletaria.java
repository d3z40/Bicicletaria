package sistemabicicletaria;

import java.util.ArrayList;

public class SistemaBicicletaria {
    
    public static void main(String[] args) {
        int var = 10;
        ArrayList<Bicicleta> bc = new ArrayList<Bicicleta>();
        ArrayList<Cliente> cl = new ArrayList<Cliente>();
        ArrayList<Contrato> cont = new ArrayList<Contrato>();
        Cliente cli = null;
        while(var != 0) {
            System.out.println("Digite os valores para navegar pelo menu");
            System.out.println("1 Cadastrar bicicleta");
            System.out.println("2 Listar bicicleta");
            System.out.println("3 Alterar dados de bicicleta");
            System.out.println("4 Cadastrar cliente pessoa física");
            System.out.println("5 Listar cliente pessoa física");
            System.out.println("6 Alterar dados de cliente pessoa física");
            System.out.println("7 Abrir contrato");
            System.out.println("8 Listar contrato");
            System.out.println("0 Sair");
            try {
            var = DigitoUser.intUser("Digite os valores para navegar pelo menu");
            }
            catch(Throwable e) {
                System.out.println("Valor inválido escolha um número de 0 a 8.");
                System.exit(0);
            }
            
            switch (var) {
                case 1:
                    {
                        try {                    
                        int codBicicleta = DigitoUser.intUser("Digite o código da bicicleta (somente números): ");
                        String cor = DigitoUser.stringUser("Digite a cor da bicicleta: ");
                        String tipo = DigitoUser.stringUser("Digite o tipo da bicicleta: ");
                        int marcha = DigitoUser.intUser("Digite a quantidade de marchas da bicicleta (somente números): ");
                        double vlrAluguel = DigitoUser.doubleUser("Digite o valor do aluguel da bicicleta (somente números): ");
                        bc.add(new Bicicleta(codBicicleta, cor, tipo, marcha, vlrAluguel));
                        break;
                        }
                        catch (Throwable e) {
                            System.out.println("Ocorreu um erro! Atenção ao preencher os dados.");
                        }
                    }
                case 2:
                    System.out.println("Lista de bicicletas");
                    for(int i = 0; i < bc.size(); i++){
                        System.out.println(bc.get(i));
                    }   break;
                case 3:
                    {
                        if(bc.size() == 0) {
                            System.out.println("Não existem bicicletas cadastradas");
                            return;
                        }
                        System.out.println("Alterando dados da bicicleta...");
                        int codBicicleta = DigitoUser.intUser("Digite o código da bicicleta que deseja alterar os dados: ");
                        
                        for(int i = 0; i < bc.size(); i++){
                            if(bc.get(i).getCodigoBicicleta() == codBicicleta){
                                String cor = DigitoUser.stringUser("Digite a nova cor da bicicleta: ");
                                
                                String tipo = DigitoUser.stringUser("Digite o novo tipo da bicicleta: ");
                                
                                int marcha = DigitoUser.intUser("Digite a nova quantidade de marchas da bicicleta (somente números): ");
                                
                                double vlrAluguel = DigitoUser.doubleUser("Digite o novo valor do aluguel da bicicleta (somente números): ");
                                
                                bc.get(i).setCor(cor);
                                bc.get(i).setTipo(tipo);
                                bc.get(i).setMarcha(marcha);
                                bc.get(i).setValorAluguel(vlrAluguel);
                                System.out.println("Dados alterados com sucesso.");
                                
                            }
                        }       break;
                    }
                case 4:
                    {
                        try {
                        String nome = DigitoUser.stringUser("Digite o nome do cliente: ");
                        String cpf = DigitoUser.stringUser("Digite o CPF do cliente: ");
                        int codigoCliente = DigitoUser.intUser("Digite o código do cliente: ");
                        String telefone = DigitoUser.stringUser("Digite o telefone do cliente: ");
                        cl.add(new Cliente(nome, cpf, codigoCliente, telefone));
                        break;
                        }
                        catch(Throwable e) {
                            System.out.println("Ocorreu um erro atenção ao preencher dados.");
                        }
                    }
                case 5:
                    System.out.println("Lista de Clientes");
                    for(int i = 0; i < cl.size(); i++){
                        System.out.println(cl.get(i));
                    }   break;
                case 6:
                    {
                         if(cl.size() == 0) {
                            System.out.println("Não existem clientes cadastradas");
                            return;
                        }
                         try {
                        System.out.println("Alterarando dados de Cliente pessoa física...");
                        int codigoCliente = DigitoUser.intUser("Digite o código do cliente que deseja alterar os dados: ");
                        for(int i = 0; i < cl.size(); i++) {
                            if(cl.get(i).getCodigo() == codigoCliente){
                                String nome = DigitoUser.stringUser("Digite o nome do cliente: ");
                                
                                String cpf = DigitoUser.stringUser("Digite o CPF do cliente: ");
                                
                                String telefone = DigitoUser.stringUser("Digite o telefone do cliente: ");
                                
                                cl.get(i).setNome(nome);
                                cl.get(i).setCPF(cpf);
                                cl.get(i).setTelefone(telefone);
                                
                                System.out.println("Dados alterados com sucesso!");
                            } 
                        }       break;
                    } catch(Throwable e) {
                        System.out.println("Ocorreu um erro atenção ao preencher dados.");
                    }
                    }
                case 7:
                    try {
                    int codigoContrato = DigitoUser.intUser("Digite o código do contrato: ");
                    int codCliente = DigitoUser.intUser("Entre com o código do cliente que deseja inserir nesse contrato: ");
                    boolean usuarioEncontrado = false;
                    for(Cliente cliente : cl){
                        if(cliente.getCodigo() == codCliente) {
                            cli = cliente;
                            usuarioEncontrado = true;
                        }
                        
                    }   if(usuarioEncontrado == false) {
                        System.out.println("Usuário não encontrado");
                        return;
                    }
                    int qtdeBicicleta = DigitoUser.intUser("Entre com a quantidade de bicicletas que deseja inserir nesse contrato: ");
                    int indexBicicleta = 0;
                    for(int i = 0; i < qtdeBicicleta; i++) {
                    	boolean bicicletaEncontrada = false;
                        int codBicicleta = DigitoUser.intUser("Entre com o código da bicicleta que deseja inserir nesse contrato: ");
                        
                        for(Bicicleta bicicleta : bc){
                            if(bicicleta.getCodigoBicicleta() == codBicicleta){
                                
                                indexBicicleta = bc.indexOf(bicicleta);                
                                bicicletaEncontrada = true;
                            }
                        }
                        if (!bicicletaEncontrada) {
                        	System.out.println("Bicicleta não encontrada!");                        	
                        }
                    }                     
                    double vlrContrato = DigitoUser.doubleUser("Digite o valor do contrato: ");
                    Contrato contrato = new Contrato(codigoContrato, cli, vlrContrato);
                    contrato.addBicicleta(bc.get(indexBicicleta));
                    cont.add(contrato);
                   
                    break;
                    }
                    catch(Throwable e) {
                        System.out.println("Ocorreu um erro atenção ao preencher os dados.");
                    }
                case 8:
                    for(Contrato contrato : cont) {
                        System.out.println(contrato);
                        contrato.listarBicicleta();
                    }   break;
                default:
                    break;
            }
        }
    }    
}
