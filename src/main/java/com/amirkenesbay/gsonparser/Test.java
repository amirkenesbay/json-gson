package com.amirkenesbay.gsonparser;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Test {
    public static void main(String[] args) {
        File input = new File("wiki.json");
        try {
            JsonElement fileElement = JsonParser.parseReader(new FileReader(input));
            JsonObject fileObject = fileElement.getAsJsonObject();

            String batchcomplete = fileObject.get("continue").getAsString();
            System.out.println("Batchcomplete: " + batchcomplete);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
