package solid;

public class PagamentoCredito implements Pagamento, PagamentoCartao{

    @Override
    public void registraPagamento() {
        System.out.println("Registrando pagamento com cartao de credito");
    }

    @Override
    public void contataOperadora() {
        System.out.println("Contatando a operadora do cartao de credito");
    }

    @Override
    public void verificaAutorizacao() {
        System.out.println("Verificando autorizacao de cartao de credito");
    }
}
