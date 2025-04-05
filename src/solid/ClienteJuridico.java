package solid;

public class ClienteJuridico extends Cliente{
    private String cnpj;
    private String nomeFantasia;

    public ClienteJuridico() {
        
    }
    
    public ClienteJuridico(String nome, String nomeFantasia, String cnpj, String endereco) {
        super(nome, endereco);
        this.nomeFantasia = nomeFantasia;
        this.cnpj = cnpj;
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
        System.out.println("EMPRESA: " + nomeFantasia + "\nCliente: " + nome +  "\nCNPJ: " + cnpj + "\nEndereco: " + endereco);
    }
    
    @Override
    public boolean validaDocumento() {
        return cnpj.length() == 14;
    }
}
