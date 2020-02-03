package reserva.DAO;

import reserva.connection.JDBCConnection;
import reserva.domain.Modalidade;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class ModalidadeDAO implements DAO{


    @Override
    public void salvar(Object domain) {
        //TODO
        try{
            Modalidade modalidade = (Modalidade) domain;
            Connection conn = JDBCConnection.getConnection();
            String sql = "INSERT INTO modalidade(nome) VALUES (?);\n";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,modalidade.getNome());
            ps.execute();
        }catch(SQLException ex){
            ex.printStackTrace();
        }
    }

//    @Override
//    public void atualizar(Object domain) {
//        //TODO
//    }

//    @Override
//    public void excluir(Object domain) {
//        //TODO
//    }

//    @Override
//    public List<Object> listarTodos() {
//        //TODO
//        return null;
//    }
}
