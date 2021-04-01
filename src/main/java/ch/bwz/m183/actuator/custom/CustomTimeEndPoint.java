package ch.bwz.m183.actuator.custom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.Selector;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

@Component
@Endpoint(id="bwz-time")
public class CustomTimeEndPoint {

     private final InstantWrapper instantWrapper;

    public CustomTimeEndPoint(InstantWrapper instantWrapper) {
        this.instantWrapper = instantWrapper;
    }

    @ReadOperation
    public CustomTime time() {
        CustomTime customTime = new CustomTime();
        customTime.setHealthDetails( instantWrapper.now());
        return customTime;

    }

    @ReadOperation
    public String customEndPointByName(@Selector String name) {
        return "custom-time-end-point";
    }

}

