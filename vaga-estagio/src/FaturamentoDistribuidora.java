public import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class FaturamentoDistribuidora {
    public static void main(String[] args) {
        List<Double> faturamento = new ArrayList<>();

        JSONParser parser = new JSONParser();
        try {
            JSONArray jsonArray = (JSONArray) parser.parse(new FileReader("faturamento.json"));

            for (Object obj : jsonArray) {
                JSONObject jsonObject = (JSONObject) obj;
                double valor = (double) jsonObject.get("valor");
                if (valor > 0) {
                    faturamento.add(valor);
                }
            }
        } catch (IOException | ParseException e) {
            System.err.println("Erro ao processar o arquivo JSON: " + e.getMessage());
            e.printStackTrace();
            return
 {
    
}
