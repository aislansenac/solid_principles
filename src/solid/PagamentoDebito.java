package solid;

public class PagamentoDebito implements Pagamento, PagamentoCartao{

    @Override
    public void registraPagamento() {
        System.out.println("Registrando o pagamento com cartao de debito");
    }

    @Override
    public void contataOperadora() {
        System.out.println("Contatando a operadora do cartao de debito");
    }

    @Override
    public void verificaAutorizacao() {
        System.out.println("Verificando autorizacao de cartao de debito");
    }
}
