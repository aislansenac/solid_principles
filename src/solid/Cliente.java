package solid;

public class Cliente {
    protected String nome;
    protected String cpf;
    protected String endereco;
    
    public Cliente() {
        
    }
    
    public Cliente(String nome, String cpf, String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }
    
    public void exibeCliente() {
        System.out.println("Cliente: " + nome + "(" + cpf + ") - " + endereco);
    }
    
    public boolean validaCpf() {
        return cpf.length() == 11;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    
}
