package jdbc.exemplos.java;

import jdbc.exemplos.java.dao.ClienteDAO;

/**
 *
 * @author Rafael Vargas Mesquita
 */
public class MainDelete {
    public static void main(String[] args) {
        ClienteDAO clienteDAO = new ClienteDAO();
        clienteDAO.remover(2);
    }
}
