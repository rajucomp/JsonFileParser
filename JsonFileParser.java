package org.example;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;

/**
 * @author raju.gupta
 * @since Mar-2025
 */
public final class JsonFileParser {

    private static final String ACTIONS = "actions";
    private static final String RETURN_VALUE = "returnValue";

    private JsonFileParser() {
        // Private constructor to prevent instantiation
    }

    public static void parse(final String filePath)
        throws IOException {
        try (InputStream fis = new FileInputStream(filePath);
            JsonReader reader = Json.createReader(fis)) {

            JsonObject jsonObject = reader.readObject();
            JsonArray actions = jsonObject.getJsonArray(ACTIONS);


            for (JsonObject action : actions.getValuesAs(JsonObject.class)) {
                JsonArray returnValue = action.getJsonArray(RETURN_VALUE);
                for (JsonObject returnValueObject : returnValue.getValuesAs(JsonObject.class)) {
                    System.out.println("Developer Name: " + returnValueObject.getString("developerName"));
                    // Add more fields as needed
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
            e.printStackTrace();
            throw e;
        }
    }

    public static void parseApiResponse(final String apiResponse) {

        try(JsonReader reader = Json.createReader(new ByteArrayInputStream(apiResponse.getBytes()))) {
            JsonObject jsonObject = reader.readObject();
            JsonArray actions = jsonObject.getJsonArray(ACTIONS);

            for (JsonObject action : actions.getValuesAs(JsonObject.class)) {
                JsonArray returnValue = action.getJsonArray(RETURN_VALUE);
                for (JsonObject returnValueObject : returnValue.getValuesAs(JsonObject.class)) {
                    System.out.println("Developer Name: " + returnValueObject.getString("developerName"));
                    // Add more fields as needed
                }
            }
        }
        catch (final Exception ex) {
            System.out.println("An error occurred while parsing the API response: " + ex.getMessage());
            ex.printStackTrace();
            throw ex;
        }
    }
}
