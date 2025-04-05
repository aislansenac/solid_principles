package solid;

public class Cliente {
    private String nome;
    private String cpf;
    private String endereco;
    
    public Cliente() {
        
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
