import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import db.DB;
import db.DBIntegrityException;

public class App {
    public static void main(String[] args) throws Exception {
        Connection conn = null;
        PreparedStatement st = null;

        try {

            conn = DB.getConnection();
            st = conn.prepareStatement(
                    "DELETE FROM department" +
                            "WHERE " +
                            "Id = ?");

            st.setInt(1, 5);

            int rowsAffected = st.executeUpdate();
            System.out.println("Atualização concluída - " + rowsAffected + " Colunas afetadas");

        } catch (SQLException e) {
            throw new DBIntegrityException(e.getMessage());
        } finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }
    }
}
