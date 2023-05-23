package com.cleam.cleanarchitecture;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "buckpal")
public class ConfigProperties {
    private long transferThreshold = Long.MAX_VALUE;
}
