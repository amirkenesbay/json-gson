package com.amirkenesbay.gsonparser;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class GsonParserFromWiki {
    public String gsonParse(String jsonFileName){
        JsonObject object = new Gson().fromJson(jsonFileName, JsonObject.class);
        String result = object
                .get("wiki.json")
                .toString();
        return result;
    }
}
