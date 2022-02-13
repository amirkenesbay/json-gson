package com.amirkenesbay.javatojson;

import com.google.gson.Gson;

public class UseGSONapitoConvertJavaOBJtoJASONstring {
    public static void main(String[] args) {
        CarDetails user = new CarDetails("SiAm",
                "Siamese",
                "siam.cat@gmail.com",
                9,
                2129991234L,
                "NewCatadonia",
                true);
        Gson gson = new Gson();
        String json = gson.toJson(user);
        System.out.println(json);
        StringToFileJson stringToFileJson = new StringToFileJson();
        stringToFileJson.writeToFile(json);
    }
}
