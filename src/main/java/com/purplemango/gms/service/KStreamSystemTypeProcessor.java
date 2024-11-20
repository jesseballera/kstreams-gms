package com.purplemango.gms.service;

import com.purplemango.gms.models.systemtype.SystemType;
import lombok.experimental.FieldDefaults;
import org.apache.kafka.streams.kstream.KStream;
import org.apache.kafka.streams.kstream.Predicate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@FieldDefaults(level = lombok.AccessLevel.PRIVATE)
public class KStreamSystemTypeProcessor {

    @Value("${spring.kafka.topic.system_type}")
    String topic;

    public void  process(KStream<String, SystemType> kStream) {
        kStream.filter(new Predicate<String, SystemType>() {
            @Override
            public boolean test(String s, SystemType object) {
                if (object !=  null  && object.getName() != null && object.getType() != null) {
                    return true;
                } else {
                    return false;
                }
            }
        }).to(topic);
    }
}
