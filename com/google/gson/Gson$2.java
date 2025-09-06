package com.google.gson;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

class Gson.2 extends TypeAdapter {
    @Override  // com.google.gson.TypeAdapter
    public final Object read(JsonReader jsonReader0) {
        if(jsonReader0.peek() == JsonToken.NULL) {
            jsonReader0.nextNull();
            return null;
        }
        return (float)jsonReader0.nextDouble();
    }

    @Override  // com.google.gson.TypeAdapter
    public final void write(JsonWriter jsonWriter0, Object object0) {
        Number number0 = (Number)object0;
        if(number0 == null) {
            jsonWriter0.nullValue();
            return;
        }
        float f = number0.floatValue();
        Gson.a(f);
        if(!(number0 instanceof Float)) {
            number0 = f;
        }
        jsonWriter0.value(number0);
    }
}

