package com.google.gson;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

class Gson.1 extends TypeAdapter {
    @Override  // com.google.gson.TypeAdapter
    public final Object read(JsonReader jsonReader0) {
        if(jsonReader0.peek() == JsonToken.NULL) {
            jsonReader0.nextNull();
            return null;
        }
        return jsonReader0.nextDouble();
    }

    @Override  // com.google.gson.TypeAdapter
    public final void write(JsonWriter jsonWriter0, Object object0) {
        if(((Number)object0) == null) {
            jsonWriter0.nullValue();
            return;
        }
        double f = ((Number)object0).doubleValue();
        Gson.a(f);
        jsonWriter0.value(f);
    }
}

