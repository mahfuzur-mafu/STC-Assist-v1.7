
package dbms;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.TableModel;

/**
 *
 * @author MAHFUZ
 */
public class DbmsUtil {
    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DbmsUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static java.sql.Connection getConnection() throws SQLException {
        String user = "root";
        String password = "";
        String url = "jdbc:mysql://localhost:3306/director_dbms";
        return DriverManager.getConnection(url, user, password);
    }

    public static TableModel reslutsetToTableMode1(ResultSet rs) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static TableModel resultSetToTableModel(ResultSet rs) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }    
}
