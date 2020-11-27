package org.example.simplehttpserver.config;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Configuration {
    private Integer port;
    private String webroot;
}
