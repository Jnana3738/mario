
package com.demo.json

import java.util.HashMap;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "brand",
        "color"

})
public class Car {

    @JsonProperty("brand")
    private String brand;
    @JsonProperty("color")
    private String color;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("brand")
    private String getBrand() {
        return brand;
    }

    @JsonProperty("brand")
    public void setBrand(String brand) {
    }