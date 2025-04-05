package solid;

public class ClienteFisico extends Cliente{
    protected String cpf;
    
    public ClienteFisico() {
        
    }
    
    public ClienteFisico(String nome, String cpf, String endereco) {
        super(nome, endereco);
        this.cpf = cpf;
    }
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    @Override
    public void exibeCliente() {
        System.out.println("Cliente: " + nome + "\nCPF: " + cpf + "\n" + "Endereco: " + endereco);
    }
    
    @Override
    public boolean validaDocumento() {
        return cpf.length() == 11;
    }
}
