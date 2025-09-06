package com.google.gson;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.util.concurrent.atomic.AtomicLong;

class Gson.4 extends TypeAdapter {
    public final TypeAdapter a;

    public Gson.4(TypeAdapter typeAdapter0) {
        this.a = typeAdapter0;
        super();
    }

    @Override  // com.google.gson.TypeAdapter
    public final Object read(JsonReader jsonReader0) {
        return new AtomicLong(((Number)this.a.read(jsonReader0)).longValue());
    }

    @Override  // com.google.gson.TypeAdapter
    public final void write(JsonWriter jsonWriter0, Object object0) {
        Long long0 = ((AtomicLong)object0).get();
        this.a.write(jsonWriter0, long0);
    }
}

