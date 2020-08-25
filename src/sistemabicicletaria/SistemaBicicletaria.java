package sistemabicicletaria;

import java.util.ArrayList;
import java.util.Scanner;

public class SistemaBicicletaria {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int var = 10;
        ArrayList<Bicicleta> bc = new ArrayList();
        ArrayList<Cliente> cl = new ArrayList();
        ArrayList<Contrato> cont = new ArrayList();
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
            var = sc.nextInt();
            }
            catch(Throwable e) {
                System.out.println("Valor inválido escolha um número de 0 a 8.");
                System.exit(0);
            }
            
            switch (var) {
                case 1:
                    {
                        try {
                        System.out.print("Digite o código da bicicleta (somente números): ");                      
                        int codBicicleta = sc.nextInt();          
                       
                        System.out.print("Digite a cor da bicicleta: ");
                        String cor = sc.next();
                        System.out.print("Digite o tipo da bicicleta: ");
                        String tipo = sc.next();
                        System.out.print("Digite a quantidade de marchas da bicicleta (somente números): ");
                        int marcha = sc.nextInt();
                        System.out.print("Digite o valor do aluguel da bicicleta (somente números): ");
                        double vlrAluguel = sc.nextDouble();
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
                        System.out.print("Digite o código da bicicleta que deseja alterar os dados: ");
                        int codBicicleta = sc.nextInt();
                        
                        for(int i = 0; i < bc.size(); i++){
                            if(bc.get(i).getCodigoBicicleta() == codBicicleta){
                                System.out.print("Digite a nova cor da bicicleta: ");
                                String cor = sc.next();
                                
                                System.out.print("Digite o novo tipo da bicicleta: ");
                                String tipo = sc.next();
                                
                                System.out.print("Digite a nova quantidade de marchas da bicicleta (somente números): ");
                                int marcha = sc.nextInt();
                                
                                System.out.print("Digite o novo valor do aluguel da bicicleta (somente números): ");
                                double vlrAluguel = sc.nextDouble();
                                
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
                        System.out.print("Digite o nome do cliente: ");
                        String nome = sc.next();
                        System.out.print("Digite o CPF do cliente: ");
                        String cpf = sc.next();
                        System.out.print("Digite o código do cliente: ");                
                        int codigoCliente = sc.nextInt();
                        System.out.print("Digite o telefone do cliente: ");
                        String telefone = sc.next();
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
                        System.out.print("Digite o código do cliente que deseja alterar os dados: ");
                        int codigoCliente = sc.nextInt();
                        for(int i = 0; i < cl.size(); i++) {
                            if(cl.get(i).getCodigo() == codigoCliente){
                                System.out.print("Digite o nome do cliente: ");
                                String nome = sc.next();
                                
                                System.out.print("Digite o CPF do cliente: ");
                                String cpf = sc.next();
                                
                                System.out.print("Digite o telefone do cliente: ");
                                String telefone = sc.next();
                                
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
                    System.out.print("Digite o código do contrato: ");
                    int codigoContrato = sc.nextInt();
                    System.out.print("Entre com o código do cliente que deseja inserir nesse contrato: ");
                    int codCliente = sc.nextInt();
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
                    System.out.println("Entre com a quantidade de bicicletas que deseja inserir nesse contrato: ");
                    int qtdeBicicleta = sc.nextInt();
                    int indexBicicleta = 0;
                    boolean bicicletaEncontrada = false;
                    for(int i = 0; i < qtdeBicicleta; i++) {
                        System.out.print("Entre com o código da bicicleta que deseja inserir nesse contrato: ");
                        int codBicicleta = sc.nextInt();
                        
                        for(Bicicleta bicicleta : bc){
                            if(bicicleta.getCodigoBicicleta() == codBicicleta){
                                
                                indexBicicleta = bc.indexOf(bicicleta);                
                                bicicletaEncontrada = true;
                            }
                        }
                    }                     
                    System.out.print("Digite o valor do contrato: ");
                    double vlrContrato = sc.nextDouble();
                    cont.add(new Contrato(codigoContrato, cli, vlrContrato));
                    for(Contrato contrato : cont){
                        contrato.addBicicleta(bc.get(indexBicicleta));
                    }   break;
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
