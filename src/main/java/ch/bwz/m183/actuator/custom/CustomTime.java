package ch.bwz.m183.actuator.custom;

import com.fasterxml.jackson.annotation.JsonAnyGetter;

import java.time.Instant;

public class CustomTime {

    private Instant timestamp;

    @JsonAnyGetter
    public Instant getTimestamp() {
        return this.timestamp;
    }

    public void setHealthDetails(Instant timestamp) {
        this.timestamp = timestamp;
    }

}
