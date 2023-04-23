package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class DBModel {
    String database = "investigacion";
    String host = "jdbc:mysql://localhost:3306/" + database;
    String user = "root";
    String password = "pass"; //Cambiar por la contrasenia de tu servidor local.


    //Retorna una conexión con la DB local.
    public Connection connect() throws SQLException {
        return  DriverManager.getConnection(host,user,password);
    }


}
