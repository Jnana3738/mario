
package com.demo.json

import java.util.HashMap;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "name",
        "age",
        "cars"
})
public class Person {

    @JsonProperty("name")
    private String name;
    @JsonProperty("age")
    private String age;
    @JsonProperty("cars")
    private String cars;
    private Cars cars;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("name")
    private String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
    }