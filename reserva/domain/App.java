package reserva.domain;

import reserva.DAO.ModalidadeDAO;
import reserva.connection.JDBCConnection;

public class App {

    public static void main(String[] args) {


        System.out.println(JDBCConnection.getConnection());

        Modalidade modalidade = new Modalidade();
        modalidade.setNome("Caminhada tirando fotos");

        new ModalidadeDAO().salvar(modalidade);
    }
}
