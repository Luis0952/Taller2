package com.i012215.taller2.Parser;

import com.i012215.taller2.Models.Country;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Luis Eduardo on 27/09/2017.
 */

public class JsonCountry {

    public static List<Country> getData(String content) throws JSONException {
        JSONArray jsonArray = new JSONArray(content);
        List<Country> countryList = new ArrayList<>();
        for (int i = 0; i < jsonArray.length(); i++){
            JSONObject item = jsonArray.getJSONObject(i);
            Country country = new Country();

            country.setName(item.getString("name"));
            country.setCapital(item.getString("capital"));
            country.setAlphacode(item.getString("alpha3Code"));
            country.setRegion(item.getString("region"));
            country.setSubregion(item.getString("subregion"));

            countryList.add(country);
        }
        return countryList; }
}
