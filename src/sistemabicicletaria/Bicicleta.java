
package sistemabicicletaria;

public class Bicicleta {
    private int codigoBicicleta;
    private String cor;
    private String tipo;
    private int marcha;
    private double valorAluguel;

    public int getCodigoBicicleta() {
        return codigoBicicleta;
    }

    public void setCodigoBicicleta(int codigoBicicleta) {
        this.codigoBicicleta = codigoBicicleta;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getMarcha() {
        return marcha;
    }

    public void setMarcha(int marcha) {
        this.marcha = marcha;
    }

    public double getValorAluguel() {
        return valorAluguel;
    }

    public void setValorAluguel(double valorAluguel) {
        this.valorAluguel = valorAluguel;
    }

    public Bicicleta(int codigoBicicleta, String cor, String tipo, int marcha, double valorAluguel) {
        this.codigoBicicleta = codigoBicicleta;
        this.cor = cor;
        this.tipo = tipo;
        this.marcha = marcha;
        this.valorAluguel = valorAluguel;
    }

    @Override
    public String toString() {
        return "Código da bicicleta: "
                + codigoBicicleta
                + "\nCor da bicicleta: "
                + cor
                + "\nTipo da bicicleta: "
                + tipo
                + "\nQuantidade de marchas: "
                + marcha
                + "\nValor do aluguel: "
                + valorAluguel
                + "\n------------------------------------------------\n"; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
