package JsonExample;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.List;


public class bikejsonex {

    public static String BikeToJSON(bike Bike) {

        ObjectMapper mapper = new ObjectMapper();
        String jBike = "";

        try {
            jBike = mapper.writeValueAsString(Bike);
        } catch (JsonProcessingException e) {
            System.err.println(e.toString());
        }

        return jBike;
    }


    public static bike JSONTobike(String jBike) {

        ObjectMapper mapper = new ObjectMapper();
        bike Bike = null;

        try {
            Bike = mapper.readValue(jBike, bike.class);
        } catch (JsonProcessingException e) {
            System.err.println(e.toString());
        }

        return Bike;

       }

        public static void main (String[] args) {

            bike cust = new bike();
            cust.setBiketype("Road");
            cust.setMaker("Canyon");
            cust.setModel("Endurance");
            cust.setSize(56);

            String json = bikejsonex.BikeToJSON(cust);
            System.out.println(json);

            bike cust2 = bikejsonex.JSONTobike(json);
            System.out.println(cust2);
        }
    }





