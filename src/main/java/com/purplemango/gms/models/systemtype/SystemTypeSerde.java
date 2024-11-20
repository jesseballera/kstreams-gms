package com.purplemango.gms.models.systemtype;

import org.apache.kafka.common.serialization.Serdes;
import org.springframework.kafka.support.serializer.JsonDeserializer;
import org.springframework.kafka.support.serializer.JsonSerializer;

public class SystemTypeSerde extends Serdes.WrapperSerde<SystemType> {
    public SystemTypeSerde() {
        super(new JsonSerializer<>(), new JsonDeserializer<>(SystemType.class));
    }
}
