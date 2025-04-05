package solid;

public class Venda {
    public Produto[] produtos;
    public float valorTotal;
    public Cliente cliente;
    public PagamentoCartao pagamentoCartao;
    public PagamentoDinheiro pagamentoDinheiro;
    
    public void exibeVenda() {
        System.out.println("Venda para " + cliente.getNome() + " no valor de " + valorTotal + " com os produtos:");
        for(Produto p: produtos) {
            System.out.println(p.getNome());
        } 
    }
    
    public void calculaTotal() {
        valorTotal = 0;
        for(Produto p: produtos) {
            valorTotal += p.getValor();
        }
    }
}
