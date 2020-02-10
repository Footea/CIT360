/**
 * Aaron Foote
 * URLandHTTP
 */

package URLandHTTP;
import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;

public class HTTPRequest {
    public static void main(String[] args) throws Exception {
        String ipAddress;

        System.out.print("\nIf you input your public IP Address this will give your location based on API from ipinfodb.com\n");
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your IP Address:");
        ipAddress = input.next();

        try {

            String url = "http://api.ipinfodb.com/v3/ip-city/?key=fb8df0bf1e7e7fe0a37cce7aae067e9112806e04d0c9cd9cc5ae4953cd65aead&ip=" + ipAddress +"&format=json";
            URL address = new URL(url);
            HttpURLConnection apiConnection = (HttpURLConnection) address.openConnection();
            // optional default is GET
            apiConnection.setRequestMethod("GET");

            System.out.println("\nSending 'GET' request to URL : " + url);
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(apiConnection.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();
            //print in String
            System.out.print("\n" + "JSON String");
            System.out.print("\n" + response.toString() + "\n");
            //Read JSON data and print
            JSONObject httpResponse = new JSONObject(response.toString());
            System.out.print("\n\n" + "JSON Data" + "\n");
            System.out.println("Status Code: " + httpResponse.getString("statusCode"));
            //   System.out.println("statusMessage- "+httpResponse.getString("statusMessage")); is null ""
            System.out.println("IP Address: " + httpResponse.getString("ipAddress"));
            System.out.println("Country Code: " + httpResponse.getString("countryCode"));
            System.out.println("Country Name: " + httpResponse.getString("countryName"));
            System.out.println("Region Name: " + httpResponse.getString("regionName"));
            System.out.println("City Name: " + httpResponse.getString("cityName"));
            System.out.println("Zipcode: " + httpResponse.getString("zipCode"));
            System.out.println("Latitude: " + httpResponse.getString("latitude"));
            System.out.println("Longitude: " + httpResponse.getString("longitude"));
            System.out.println("Time Zone: " + httpResponse.getString("timeZone"));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}