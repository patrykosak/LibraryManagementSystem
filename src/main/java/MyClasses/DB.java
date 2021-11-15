package MyClasses;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DB {
    
    private static String serverName = "localhost";
    private static String username = "root";
    private static String dbname = "libraryDB";
    private static Integer portNumber = 3306;
    private static String password = "patryk";

    public static Connection getConnection(){
        System.out.println("connecting");
        Connection connection = null;
        
        MysqlDataSource datasource = new MysqlDataSource();
        
        datasource.setServerName(serverName);
        datasource.setUser(username);
        datasource.setDatabaseName(dbname);
        datasource.setPortNumber(portNumber);
        datasource.setPassword(password);
        try{
        connection = datasource.getConnection();
        System.out.println("connected");
        }
        catch(SQLException ex){
                Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return connection;
}
}
