package control;

import java.net.HttpURLConnection;
import javax.net.ssl.HttpsURLConnection; // ✅ IMPORTANTE
import java.net.URL;
import java.util.Scanner;

public class TiendaFecher {

    public static String obtenerProducto(String urlApi) {
        StringBuilder resultado = new StringBuilder();

        try {
            URL url = new URL(urlApi);
            HttpsURLConnection conexion = (HttpsURLConnection) url.openConnection(); // ✅ CORREGIDO
            conexion.setRequestMethod("GET");
            conexion.setConnectTimeout(5000);
            conexion.setReadTimeout(5000);

            // ✅ Leemos la respuesta
            Scanner sc = new Scanner(conexion.getInputStream());
            while (sc.hasNext()) {
                resultado.append(sc.nextLine());
            }
            sc.close();

            conexion.disconnect();

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        return resultado.toString();
    }
}
