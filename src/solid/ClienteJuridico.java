package solid;

public class ClienteJuridico extends Cliente{
    private String cnpj;
    private String nomeFantasia;

    public ClienteJuridico() {
        
    }
    
    public ClienteJuridico(String nome, String cpf, String endereco) {
        super(nome, cpf, endereco);
    }
    
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }
    
    @Override
    public void exibeCliente() {
        System.out.println("Cliente: " + nome + "(" + cnpj + ") - " + endereco);
    }
    
    @Override
    public boolean validaCpf() {
        // Não valida CPF, pois é CNPJ
        return false;
    }
}
