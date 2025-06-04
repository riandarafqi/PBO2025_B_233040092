package TugasFinalStatic;

//Tugas 4
public class DatabaseConnection {
 static String connectionString;
 static {
     connectionString = "jdbc:mysql://localhost:3306/mydatabase";
     System.out.println("Database connection string initialized: " + connectionString);
 }
 static {
     // Inisialisasi koneksi database
     System.out.println("Connecting to database...");
     // Simulasi koneksi database
     System.out.println("Connected to database successfully.");
 }
}