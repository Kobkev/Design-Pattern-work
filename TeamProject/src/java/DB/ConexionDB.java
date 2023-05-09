/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

/**
 *
 * @author Moisés Aguirre Bautista
 */
public class ConexionDB {
    
    //Patron SINGLETON
    
   
    private static Connection conn = null;
    private String driver;
    private String url;
    private String usuario;
    private String password;
 
    
    private EjemploSingleton(){
 
    String url = "jdbc:mysql://localhost:3306/test";
    String driver = "com.mysql.jdbc.Driver";
    String usuario = "usuario";
    String password = "password";

    try{
        Class.forName(driver);
        conn = DriverManager.getConnection(url, usuario, password);
    }
    catch(ClassNotFoundException | SQLException e){
        e.printStackTrace();
    }
       } // Fin constructor

       // Métodos
       public static Connection getConnection(){

    if (conn == null){
        new EjemploSingleton();
    }

    return conn;
       } // Fin getConnection
    
       
    private static DatabaseConnection instance;
    private Connection connection;
    private String url = "jdbc:postgresql://localhost:5432/jdbc";
    private String username = "root";
    private String password = "localhost";

    private DatabaseConnection() throws SQLException {
        try {
            Class.forName("org.postgresql.Driver");
            this.connection = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException ex) {
            System.out.println("Database Connection Creation Failed : " + ex.getMessage());
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public static DatabaseConnection getInstance() throws SQLException {
        if (instance == null) {
            instance = new DatabaseConnection();
        } else if (instance.getConnection().isClosed()) {
            instance = new DatabaseConnection();
        }

        return instance;
    }   
       
    
    
}
