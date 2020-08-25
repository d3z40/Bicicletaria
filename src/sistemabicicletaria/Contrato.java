package sistemabicicletaria;

import java.util.ArrayList;

public class Contrato {
    private int codigoContrato;
    private Cliente cliente;
    private ArrayList<Bicicleta> bicicleta;
    private double valorContrato;

    public Contrato(int codigoContrato, Cliente cliente, double valorContrato) {
        this.codigoContrato = codigoContrato;
        this.cliente = cliente;
        this.bicicleta = new ArrayList();
        this.valorContrato = valorContrato;
    }
    
    
    public void addBicicleta(Bicicleta e) {
       bicicleta.add(e);
    }
    
    public void listarBicicleta(){
        System.out.println("Lista de bicicletas para esse contrato");  
     
        for(int i = 0; i < bicicleta.size(); i++) {
            System.out.println("Código da bicicleta: " 
                    + bicicleta.get(i).getCodigoBicicleta() 
                    + "\n" 
                    + "Cor da bicicleta: " 
                    + bicicleta.get(i).getCor()
                    + "\n" 
                    + "Tipo da bicicleta: "
                    + bicicleta.get(i).getTipo()
                    + "\n"
                    + "Quantidade de marchas: "
                    + bicicleta.get(i).getMarcha()
                    + "\n"
                    + "Valor do aluguel: "
                    + bicicleta.get(i).getValorAluguel()
            );

        }
           
    }

    @Override
    public String toString() {
        return "CONTRATO"
                + "\nCódigo do contrato: "
                + codigoContrato
                + "\nCliente: "
                + cliente.getNome()
                + "\nValor do contrato: "
                + valorContrato;
    }
    
    
}
