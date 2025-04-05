package solid;

public class PagamentoDinheiro implements Pagamento{

    @Override
    public void registraPagamento() {
        System.out.println("Pagamento em dinheiro");
    }

    @Override
    public void contataOperadora() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void verificaAutorizacao() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
