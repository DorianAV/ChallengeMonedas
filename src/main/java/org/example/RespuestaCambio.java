package org.example;

import com.google.gson.annotations.SerializedName;

import java.util.Map;

public class RespuestaCambio {
    @SerializedName("result")
    public String resultado;

    @SerializedName("conversion_rates")
    public Map<String, Double> tasasConversion;
}
