import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Aplikasi Manajemen Toko Elektronik");

        // Buat objek kelas TokoElektronik atau kelas yang sesuai
        TokoElektronik toko = new TokoElektronik();

        // Buat tombol-tombol untuk berinteraksi dengan toko
        Button tambahProdukButton = new Button("Tambah Produk");
        Button lihatStokButton = new Button("Lihat Stok");
        Button prosesPembelianButton = new Button("Proses Pembelian");

        // Set event handler untuk tombol-tombol tersebut
        tambahProdukButton.setOnAction(e -> toko.tambahProduk());
        lihatStokButton.setOnAction(e -> toko.lihatStok());
        prosesPembelianButton.setOnAction(e -> toko.prosesPembelian());

        // Tambahkan tombol-tombol ke layout
        VBox layout = new VBox(10);
        layout.getChildren().addAll(tambahProdukButton, lihatStokButton, prosesPembelianButton);

        // Tampilkan layout di dalam scene
        Scene scene = new Scene(layout, 300, 200);
        primaryStage.setScene(scene);

        // Tampilkan primaryStage
        primaryStage.show();
    }
}
