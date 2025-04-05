package solid;

public abstract class Cliente {
    protected String nome;
    protected String endereco;
    
    public Cliente() {
        
    }
    
    public Cliente(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }
    
    public abstract boolean validaDocumento();
    
    public abstract void exibeCliente();
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    
}
