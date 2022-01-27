package com.amirkenesbay.gsonparser;

import com.amirkenesbay.model.People;
import com.amirkenesbay.model.Root;
import com.google.gson.Gson;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class GsonParser {
    public Root parse() {
        Gson gson = new Gson();
        try (FileReader reader = new FileReader("test.json")) {
            Root root = gson.fromJson(reader, Root.class);
            return root;
        } catch (Exception e) {
            System.out.println("Parsing error: " + e.toString());
        }
        return null;
    }
}
