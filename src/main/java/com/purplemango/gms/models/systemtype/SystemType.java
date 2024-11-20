package com.purplemango.gms.models.systemtype;

import com.purplemango.gms.models.core.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

@Data
@FieldDefaults(level = lombok.AccessLevel.PRIVATE)
public class SystemType {

    String name;
    Integer numberOfBall;
    Type type;
    Status status;

    @Getter
    @AllArgsConstructor
    @FieldDefaults(level = lombok.AccessLevel.PRIVATE)
    public static enum Type {
        ROLL("Roll"),
        SYSTEM("System");

        final String name;

        public static Map<String, String> asMap(final String name) {
            Map<String, String> map = new TreeMap<>();
            for (final Type type : Type.values()) {
                map.put(type.name(), type.getName());
            }
            return Collections.unmodifiableMap(map);
        }
    }
}
