package jdbc.exemplos.java;

import jdbc.exemplos.java.dao.ClienteDAO;
import jdbc.exemplos.java.model.Cliente;

/**
 *
 * @author Rafael Vargas Mesquita
 */
public class MainInsert {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Cliente 4", "444.444.444-44", "(44) 4444-4444");
        ClienteDAO clienteDAO = new ClienteDAO();
        clienteDAO.inserir(cliente);
    }
}
