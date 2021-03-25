package ch.bwz.m183.actuator.custom;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class CustomHealth {

    private final Map<String, Object> healthDetails = new HashMap<>();

    @JsonAnyGetter
    public Map<String, Object> getHealthDetails() {
        return this.healthDetails;
    }

    public void setHealthDetails(Map<String, Object> details) {
        this.healthDetails.putAll(details);
    }

}
