package org.example;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.JSONArray;
import org.json.JSONObject;

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
       final String content = Files.readString(Paths.get(filePath));
        parseApiResponse(content);
    }

    public static void parseApiResponse(final String apiResponse) {

        final JSONObject jsonObject = new JSONObject(apiResponse);
        final JSONArray actions = jsonObject.getJSONArray(ACTIONS);

        for (int i = 0; i < actions.length(); i++) {
            JSONObject action = actions.getJSONObject(i);
            JSONArray returnValue = action.getJSONArray(RETURN_VALUE);
            for (int j = 0; j < returnValue.length(); j++) {
                JSONObject returnValueObject = returnValue.getJSONObject(j);
                System.out.println("Developer Name: " + returnValueObject.getString("developerName"));
                // Add more fields as needed
            }
        }
    }
}
