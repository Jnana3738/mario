
package com.demo.json

import java.util.ArrayList;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "car"
})
public class Cars {

    @JsonProperty("car")
    private List<Car> car = new ArrayList<Car>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("car")
    private List<Car> getCar() {
        return car;
    }

    @JsonProperty("car")
    public void setCar(List<car> car) {
        this.car = car
    }
    }