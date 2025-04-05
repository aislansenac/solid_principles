package solid;

public class PagamentoDinheiro implements Pagamento{
    
    @Override
    public void registraPagamento() {
        System.out.println("Pagamento em dinheiro");
    }
    
}
