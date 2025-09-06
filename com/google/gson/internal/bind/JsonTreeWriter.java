package com.google.gson.internal.bind;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

public final class JsonTreeWriter extends JsonWriter {
    public final ArrayList m;
    public String n;
    public JsonElement o;
    public static final d p;
    public static final JsonPrimitive q;

    static {
        JsonTreeWriter.p = new d();
        JsonTreeWriter.q = new JsonPrimitive("closed");
    }

    public JsonTreeWriter() {
        super(JsonTreeWriter.p);
        this.m = new ArrayList();
        this.o = JsonNull.INSTANCE;
    }

    @Override  // com.google.gson.stream.JsonWriter
    public JsonWriter beginArray() throws IOException {
        JsonArray jsonArray0 = new JsonArray();
        this.h(jsonArray0);
        this.m.add(jsonArray0);
        return this;
    }

    @Override  // com.google.gson.stream.JsonWriter
    public JsonWriter beginObject() throws IOException {
        JsonObject jsonObject0 = new JsonObject();
        this.h(jsonObject0);
        this.m.add(jsonObject0);
        return this;
    }

    @Override  // com.google.gson.stream.JsonWriter
    public void close() throws IOException {
        ArrayList arrayList0 = this.m;
        if(!arrayList0.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        arrayList0.add(JsonTreeWriter.q);
    }

    @Override  // com.google.gson.stream.JsonWriter
    public JsonWriter endArray() throws IOException {
        ArrayList arrayList0 = this.m;
        if(arrayList0.isEmpty() || this.n != null || !(this.g() instanceof JsonArray)) {
            throw new IllegalStateException();
        }
        arrayList0.remove(arrayList0.size() - 1);
        return this;
    }

    @Override  // com.google.gson.stream.JsonWriter
    public JsonWriter endObject() throws IOException {
        ArrayList arrayList0 = this.m;
        if(arrayList0.isEmpty() || this.n != null || !(this.g() instanceof JsonObject)) {
            throw new IllegalStateException();
        }
        arrayList0.remove(arrayList0.size() - 1);
        return this;
    }

    @Override  // com.google.gson.stream.JsonWriter
    public void flush() throws IOException {
    }

    public final JsonElement g() {
        return (JsonElement)this.m.get(this.m.size() - 1);
    }

    public JsonElement get() {
        ArrayList arrayList0 = this.m;
        if(!arrayList0.isEmpty()) {
            throw new IllegalStateException("Expected one JSON element but was " + arrayList0);
        }
        return this.o;
    }

    public final void h(JsonElement jsonElement0) {
        if(this.n != null) {
            ((JsonObject)this.g()).add(this.n, jsonElement0);
            this.n = null;
            return;
        }
        if(this.m.isEmpty()) {
            this.o = jsonElement0;
            return;
        }
        JsonElement jsonElement1 = this.g();
        if(!(jsonElement1 instanceof JsonArray)) {
            throw new IllegalStateException();
        }
        ((JsonArray)jsonElement1).add(jsonElement0);
    }

    @Override  // com.google.gson.stream.JsonWriter
    public JsonWriter jsonValue(String s) throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override  // com.google.gson.stream.JsonWriter
    public JsonWriter name(String s) throws IOException {
        Objects.requireNonNull(s, "name == null");
        if(this.m.isEmpty() || this.n != null || !(this.g() instanceof JsonObject)) {
            throw new IllegalStateException();
        }
        this.n = s;
        return this;
    }

    @Override  // com.google.gson.stream.JsonWriter
    public JsonWriter nullValue() throws IOException {
        this.h(JsonNull.INSTANCE);
        return this;
    }

    @Override  // com.google.gson.stream.JsonWriter
    public JsonWriter value(double f) throws IOException {
        if(!this.isLenient() && (Double.isNaN(f) || Double.isInfinite(f))) {
            throw new IllegalArgumentException("JSON forbids NaN and infinities: " + f);
        }
        this.h(new JsonPrimitive(f));
        return this;
    }

    @Override  // com.google.gson.stream.JsonWriter
    public JsonWriter value(float f) throws IOException {
        if(!this.isLenient() && (Float.isNaN(f) || Float.isInfinite(f))) {
            throw new IllegalArgumentException("JSON forbids NaN and infinities: " + f);
        }
        this.h(new JsonPrimitive(f));
        return this;
    }

    @Override  // com.google.gson.stream.JsonWriter
    public JsonWriter value(long v) throws IOException {
        this.h(new JsonPrimitive(v));
        return this;
    }

    @Override  // com.google.gson.stream.JsonWriter
    public JsonWriter value(Boolean boolean0) throws IOException {
        if(boolean0 == null) {
            return this.nullValue();
        }
        this.h(new JsonPrimitive(boolean0));
        return this;
    }

    @Override  // com.google.gson.stream.JsonWriter
    public JsonWriter value(Number number0) throws IOException {
        if(number0 == null) {
            return this.nullValue();
        }
        if(!this.isLenient()) {
            double f = number0.doubleValue();
            if(Double.isNaN(f) || Double.isInfinite(f)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number0);
            }
        }
        this.h(new JsonPrimitive(number0));
        return this;
    }

    @Override  // com.google.gson.stream.JsonWriter
    public JsonWriter value(String s) throws IOException {
        if(s == null) {
            return this.nullValue();
        }
        this.h(new JsonPrimitive(s));
        return this;
    }

    @Override  // com.google.gson.stream.JsonWriter
    public JsonWriter value(boolean z) throws IOException {
        this.h(new JsonPrimitive(Boolean.valueOf(z)));
        return this;
    }
}

