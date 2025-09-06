package com.google.gson;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLongArray;

class Gson.5 extends TypeAdapter {
    public final TypeAdapter a;

    public Gson.5(TypeAdapter typeAdapter0) {
        this.a = typeAdapter0;
        super();
    }

    @Override  // com.google.gson.TypeAdapter
    public final Object read(JsonReader jsonReader0) {
        ArrayList arrayList0 = new ArrayList();
        jsonReader0.beginArray();
        while(jsonReader0.hasNext()) {
            arrayList0.add(((Number)this.a.read(jsonReader0)).longValue());
        }
        jsonReader0.endArray();
        int v = arrayList0.size();
        AtomicLongArray atomicLongArray0 = new AtomicLongArray(v);
        for(int v1 = 0; v1 < v; ++v1) {
            atomicLongArray0.set(v1, ((long)(((Long)arrayList0.get(v1)))));
        }
        return atomicLongArray0;
    }

    @Override  // com.google.gson.TypeAdapter
    public final void write(JsonWriter jsonWriter0, Object object0) {
        jsonWriter0.beginArray();
        int v = ((AtomicLongArray)object0).length();
        for(int v1 = 0; v1 < v; ++v1) {
            Long long0 = ((AtomicLongArray)object0).get(v1);
            this.a.write(jsonWriter0, long0);
        }
        jsonWriter0.endArray();
    }
}

