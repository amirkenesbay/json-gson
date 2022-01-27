package com.amirkenesbay.jsonparser;

import com.amirkenesbay.model.Root;

public class Main {
    public static void main(String[] args) {
        JsonSimpleParser parser = new JsonSimpleParser();
        Root root = parser.parse();

        System.out.println("Root:\n" + root.toString());
    }
}
