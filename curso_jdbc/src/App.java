import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import db.DB;

public class App {
    public static void main(String[] args) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Connection conn = null;
        PreparedStatement st = null;

        try {
            conn = DB.getConnection();
            st = conn.prepareStatement(
                    "UPDATE seller " +
                            "SET BaseSalary = BaseSalary + ? " +
                            "WHERE " +
                            "(DepartmentId = ?)");
            st.setDouble(1, 200D);
            st.setInt(2, 2);

            int rowsAffected = st.executeUpdate();
            System.out.println("Processo concluído - " + rowsAffected + " colunas afetadas.");
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
        finally {
        DB.closeStatement(st);            
        DB.closeConnection();
        }

    }
}
