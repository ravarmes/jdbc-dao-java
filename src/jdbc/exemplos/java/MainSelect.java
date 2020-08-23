package jdbc.exemplos.java;

import java.util.List;
import jdbc.exemplos.java.dao.ClienteDAO;
import jdbc.exemplos.java.model.Cliente;

/**
 *
 * @author Rafael Vargas Mesquita
 */
public class MainSelect {
    public static void main(String[] args) {
        ClienteDAO clienteDAO = new ClienteDAO();
        List<Cliente> lista = clienteDAO.listar();
        for (Cliente cliente : lista)
             System.out.println(cliente);
    }
}
