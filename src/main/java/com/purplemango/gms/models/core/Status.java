package com.purplemango.gms.models.core;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@Getter
@AllArgsConstructor
public enum Status {
    ACTIVE("Active"),
    INACTIVE("Inactive");

    private final String value;

    public static Map<String, String> asMap() {
        Map<String, String> map = new HashMap<>();
        for (Status e : values()) {
            map.put(e.toString(), e.getValue());
        }

        return Collections.unmodifiableMap(map);
    }
}
