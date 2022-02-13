package com.amirkenesbay.files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileParser {
    private final static String FILE_SEPARATOR = File.separator;
    private final static String PATH_NAME = "D:" + FILE_SEPARATOR + "Codes" + FILE_SEPARATOR + "JavaProjects" + FILE_SEPARATOR + "JsonExample";
    private final static String FILE_NAME = "wiki.json";

    public void createFile() {
        File filePath = new File(PATH_NAME);
        filePath.mkdir();
        File file = new File(filePath + FILE_SEPARATOR + FILE_NAME);
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeInfoToFile(String textInfo) {
        try (FileWriter writer = new FileWriter(FILE_NAME, false)) {
            writer.write(textInfo);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
