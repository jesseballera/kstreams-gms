package com.purplemango.gms.service;

import com.purplemango.gms.models.systemtype.SystemType;
import lombok.experimental.FieldDefaults;
import org.apache.kafka.streams.KeyValue;
import org.apache.kafka.streams.kstream.KGroupedStream;
import org.apache.kafka.streams.kstream.KStream;
import org.apache.kafka.streams.kstream.KTable;
import org.apache.kafka.streams.state.KeyValueBytesStoreSupplier;
import org.apache.kafka.streams.state.Stores;
import org.springframework.stereotype.Component;

@Component
@FieldDefaults(level = lombok.AccessLevel.PRIVATE)
public class KTableSystemTypeProcessor {

    // Add processing logic for KTable here
    public void process(KStream<String, SystemType> object) {
        //Create a new KeyValue Store
        KeyValueBytesStoreSupplier storeSupplier = Stores.persistentKeyValueStore("system-type-store");

        KGroupedStream<SystemType.Type, SystemType> kGroupedStream = object.map((key, value) -> new KeyValue<>(value.getType(), value)).groupByKey();

//        KTable<String Sts>
    }
}
