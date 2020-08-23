package jdbc.exemplos.java;

import jdbc.exemplos.java.dao.ClienteDAO;
import jdbc.exemplos.java.model.Cliente;

/**
 *
 * @author Rafael Vargas Mesquita
 */
public class MainUpdate {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(1, "Cliente 0", "000.000.000-00", "(00) 0000-0000");
        ClienteDAO clienteDAO = new ClienteDAO();
        clienteDAO.alterar(cliente);
    }
}
