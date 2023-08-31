package dao;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import dto.ResultadoDni;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import javax.swing.JOptionPane;

public class ResultadoDniDAO {

    private String apitoken = "5de6591d68ff26fa772da0188ee0acaf5a8763411fb5b8f50d799b3bd5f0a8c4";

    public ResultadoDniDAO() {

    }

    public ResultadoDni obtenerDatosPorDni(String dni) {
        try {
            String url = "https://apiperu.dev/api/dni/" + dni + "?api_token=" + apitoken;
            URL enlace = new URL(url);
            URLConnection request = enlace.openConnection();
            request.connect();

            JsonParser jp = new JsonParser();
            JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
            JsonObject rootObject = root.getAsJsonObject();
            if (rootObject.get("success").getAsBoolean()) {
                JsonObject dataObject = rootObject.getAsJsonObject("data");

                String nombreCompleto = dataObject.get("nombre_completo").getAsString();
                String numero = dataObject.get("numero").getAsString();
                String nombres = dataObject.get("nombres").getAsString();
                String apellidoPaterno = dataObject.get("apellido_paterno").getAsString();
                String apellidoMaterno = dataObject.get("apellido_materno").getAsString();

                ResultadoDni resultado = new ResultadoDni();

                resultado.setDni(numero);
                resultado.setNombre_completo(nombreCompleto);
                resultado.setNombres(nombres);
                resultado.setApellido_paterno(apellidoPaterno);
                resultado.setApellido_materno(apellidoMaterno);

                return resultado;
            }
            return null;
        } catch (Exception e) {
            return null;
        }
    }
}
