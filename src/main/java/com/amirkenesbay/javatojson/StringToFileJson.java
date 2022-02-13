package com.amirkenesbay.javatojson;

import java.io.FileWriter;
import java.io.IOException;

public class StringToFileJson {
    public void writeToFile(String toJson){
        try (FileWriter writer = new FileWriter("test2.json")){
            writer.write(toJson);
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
