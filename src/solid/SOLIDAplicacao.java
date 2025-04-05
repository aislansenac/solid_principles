package solid;

public class SOLIDAplicacao {
    public static void main(String[] args) {
        // Cliente c1 = new ClienteFisico("Maria", "00000000000", "rua A");
        // Cliente c2 = new ClienteJuridico("Marcos", "Empresa A", "11111111111", "rua B");
        
        // System.out.println(c2.validaCpf());
        
        Cliente[] clientes = new Cliente[3];
        clientes[0] = new ClienteFisico("Joao", "22222222222", "rua C");
        clientes[1] = new ClienteJuridico("Jose", "Empresa 1", "33333333333333", "rua D");
        clientes[2] = new ClienteJuridico("Eliseu" , "Empresa 2", "44444444444", "rua E");
        
        for(Cliente c: clientes) {
            c.exibeCliente();
            System.out.println("DOCUMENTO: " + c.validaDocumento());
            System.out.println("");
        }
    }
}
