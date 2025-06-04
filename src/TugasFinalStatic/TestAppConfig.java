package TugasFinalStatic;

public class TestAppConfig {
    public static void main(String[] args) {
        // Mengakses konfigurasi aplikasi
        System.out.println("Base URL: " + AppConfig.BASE_URL);
        System.out.println("App Version: " + AppConfig.APP_VERSION);
        System.out.println("Timeout: " + AppConfig.TIMEOUT + " ms");
    }
}
// Tugas 1