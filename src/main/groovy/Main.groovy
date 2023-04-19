import Logic.Fetch

import java.sql.Connection
import java.sql.DriverManager
import java.sql.PreparedStatement
import java.sql.ResultSet
import java.sql.SQLException

static void main(String[] args) {

  Fetch miFetch = new Fetch();
  String response = miFetch.getById("LSsXyncAAAA");
  println response;
  String response2 = miFetch.getByName("Mike");
  println(response2)
//  Connection con = null;
//  String URL = "jdbc:mysql://localhost:3306/investigacion";
//  con = DriverManager.getConnection(URL,"root","utopicInsomnia!");
//  try (PreparedStatement stmt = con.prepareStatement("SELECT * FROM autores")) {
//    ResultSet rs = stmt.executeQuery();
//
 //   while (rs.next())
 //    System.out.println (rs.getString("name"));
//
 // } catch (SQLException sqle) {
 //   System.out.println("Error en la ejecución:"
 //           + sqle.getErrorCode() + " " + sqle.getMessage());
  //}
}