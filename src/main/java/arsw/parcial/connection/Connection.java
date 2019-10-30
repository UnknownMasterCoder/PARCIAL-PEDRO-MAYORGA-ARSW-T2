package arsw.parcial.connection;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.springframework.stereotype.Service;

/**
 *
 * @author 2099190
 */
@Service
public class Connection {

    //cometari-airportsfinder-v1.p.rapidapi.com
    //http://cometari-airportsfinder-v1.p.rapidapi.com/api/airports/by-text?text=Berlin
    private static final String USER_AGENT = "Mozilla/5.0";
    private static String city;
    private static String airportsFinderKey = "d6a1132c34msh746191d900fc3eap1a3744jsnf42559e541bd";
    private static String GET_URL = "http://cometari-airportsfinder-v1.p.rapidapi.com/api/airports/by-text?text=" + city;
    private static String HOST = "cometari-airportsfinder-v1.p.rapidapi.com";
    //        + "&APPID=d6a1132c34msh746191d900fc3eap1a3744jsnf42559e541bd";

    public static String connection() throws IOException {

        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url("https://cometari-airportsfinder-v1.p.rapidapi.com/api/airports/by-text?text=Berlin")
                .get()
                .addHeader("x-rapidapi-host", "cometari-airportsfinder-v1.p.rapidapi.com")
                .addHeader("x-rapidapi-key", "d6a1132c34msh746191d900fc3eap1a3744jsnf42559e541bd")
                .build();

        Response response = client.newCall(request).execute();
        return response.body().string();
        /*
        URL obj = new URL(GET_URL);
        //obj.
        
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("User-Agent", USER_AGENT);
        con.setRequestProperty("x-rapidapi-host", HOST);
        con.setRequestProperty("x-rapidapi-key", airportsFinderKey);
         */
        // The following invocation perform the connection implicitly before getting the
        // code
        /*
        int responseCode = con.getResponseCode();
        System.out.println("GET Response Code :: " + responseCode);
        
        if (responseCode == HttpURLConnection.HTTP_OK) { // success
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            //con.
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            // print result
            return (response.toString());
        } else {
            System.out.println("GET request not worked");
        }
        */
        //return null;
    }

    public static void setCity(String c) {
        GET_URL = "http://cometari-airportsfinder-v1.p.rapidapi.com/api/airports/by-text?text=" + c + "&APPID=227fac8f36cb40ed1efe0aec04f2417b";

    }
}
