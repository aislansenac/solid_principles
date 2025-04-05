package solid;

public class Venda {
    public Produto[] produtos;
    public float valorTotal;
    public Cliente cliente;
    
    public void exibeCliente() {
        System.out.println("Cliente: " + cliente.getNome() + "(" + cliente.getCpf() + ") - " + cliente.getEndereco());
    }
    
    public void exibeVenda() {
        System.out.println("Venda para " + cliente.getNome() + " no valor de " + valorTotal + " com os produtos:");
        for(Produto p: produtos) {
            System.out.println(p.getNome());
        } 
    }
    
    public void criaCliente(String nome, String cpf, String endereco) {
        cliente = new Cliente();
        cliente.setNome(nome);
        cliente.setCpf(cpf);
        cliente.setEndereco(endereco);
    }
    
    public void calculaTotal() {
        valorTotal = 0;
        for(Produto p: produtos) {
            valorTotal += p.getValor();
        }
    }
}
