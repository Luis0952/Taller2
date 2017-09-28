package com.i012215.taller2.Models;

/**
 * Created by Luis Eduardo on 27/09/2017.
 */

public class Country {

    private String Name;
    private String Capital;
    private String Alphacode;
    private String Region;
    private String Subregion;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCapital() {
        return Capital;
    }

    public void setCapital(String capital) {
        Capital = capital;
    }

    public String getAlphacode() {
        return Alphacode;
    }

    public void setAlphacode(String alphacode) {
        Alphacode = alphacode;
    }

    public String getRegion() {
        return Region;
    }

    public void setRegion(String region) {
        Region = region;
    }

    public String getSubregion() {
        return Subregion;
    }

    public void setSubregion(String subregion) {
        Subregion = subregion;
    }
}
