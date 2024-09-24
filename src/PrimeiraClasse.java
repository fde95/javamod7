/**
 * @author felipe.espinoza
 */

public class PrimeiraClasse {
    public static void main(String[] args){
        Cliente cliente = new Cliente();
        cliente.cadastrarEndereco("Rua 1");
        cliente.setCodigo(1);

        System.out.println(cliente.getCodigo());
        //cliente.imprimirEndereco();
        //String end = cliente.retornarEnderecoCliente();

        System.out.println(cliente.retornarEnderecoCliente());
        System.out.println(cliente.getValorTotal());
    }
}
