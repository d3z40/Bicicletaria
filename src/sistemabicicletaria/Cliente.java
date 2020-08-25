package sistemabicicletaria;

public class Cliente {
    private String nome;
    private String CPF;
    private int codigo;
    private String telefone;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Cliente(String nome, String CPF, int codigo, String telefone) {
        this.nome = nome;
        this.CPF = CPF;
        this.codigo = codigo;
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "CLIENTE" 
                + "\nNome: " 
                + nome 
                + "\nCPF: "
                + CPF 
                + "\nCódigo: "
                + codigo
                + "\nTelefone: "
                + telefone; //To change body of generated methods, choose Tools | Templates.
    }
    
    }
