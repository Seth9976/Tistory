package com.google.gson.internal.bind;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map.Entry;

public final class JsonTreeReader extends JsonReader {
    public Object[] p;
    public int q;
    public String[] r;
    public int[] s;
    public static final b t;
    public static final Object u;

    static {
        JsonTreeReader.t = new b();
        JsonTreeReader.u = new Object();
    }

    public JsonTreeReader(JsonElement jsonElement0) {
        super(JsonTreeReader.t);
        this.p = new Object[0x20];
        this.q = 0;
        this.r = new String[0x20];
        this.s = new int[0x20];
        this.v(jsonElement0);
    }

    @Override  // com.google.gson.stream.JsonReader
    public void beginArray() throws IOException {
        this.p(JsonToken.BEGIN_ARRAY);
        this.v(((JsonArray)this.t()).iterator());
        this.s[this.q - 1] = 0;
    }

    @Override  // com.google.gson.stream.JsonReader
    public void beginObject() throws IOException {
        this.p(JsonToken.BEGIN_OBJECT);
        this.v(((JsonObject)this.t()).entrySet().iterator());
    }

    @Override  // com.google.gson.stream.JsonReader
    public void close() throws IOException {
        this.p = new Object[]{JsonTreeReader.u};
        this.q = 1;
    }

    @Override  // com.google.gson.stream.JsonReader
    public void endArray() throws IOException {
        this.p(JsonToken.END_ARRAY);
        this.u();
        this.u();
        int v = this.q;
        if(v > 0) {
            ++this.s[v - 1];
        }
    }

    @Override  // com.google.gson.stream.JsonReader
    public void endObject() throws IOException {
        this.p(JsonToken.END_OBJECT);
        this.r[this.q - 1] = null;
        this.u();
        this.u();
        int v = this.q;
        if(v > 0) {
            ++this.s[v - 1];
        }
    }

    @Override  // com.google.gson.stream.JsonReader
    public String getPath() {
        return this.q(false);
    }

    @Override  // com.google.gson.stream.JsonReader
    public String getPreviousPath() {
        return this.q(true);
    }

    @Override  // com.google.gson.stream.JsonReader
    public boolean hasNext() throws IOException {
        JsonToken jsonToken0 = this.peek();
        return jsonToken0 != JsonToken.END_OBJECT && jsonToken0 != JsonToken.END_ARRAY && jsonToken0 != JsonToken.END_DOCUMENT;
    }

    @Override  // com.google.gson.stream.JsonReader
    public boolean nextBoolean() throws IOException {
        this.p(JsonToken.BOOLEAN);
        boolean z = ((JsonPrimitive)this.u()).getAsBoolean();
        int v = this.q;
        if(v > 0) {
            ++this.s[v - 1];
        }
        return z;
    }

    @Override  // com.google.gson.stream.JsonReader
    public double nextDouble() throws IOException {
        JsonToken jsonToken0 = this.peek();
        JsonToken jsonToken1 = JsonToken.NUMBER;
        if(jsonToken0 != jsonToken1 && jsonToken0 != JsonToken.STRING) {
            throw new IllegalStateException("Expected " + jsonToken1 + " but was " + jsonToken0 + this.r());
        }
        double f = ((JsonPrimitive)this.t()).getAsDouble();
        if(!this.isLenient() && (Double.isNaN(f) || Double.isInfinite(f))) {
            throw new MalformedJsonException("JSON forbids NaN and infinities: " + f);
        }
        this.u();
        int v = this.q;
        if(v > 0) {
            ++this.s[v - 1];
        }
        return f;
    }

    @Override  // com.google.gson.stream.JsonReader
    public int nextInt() throws IOException {
        JsonToken jsonToken0 = this.peek();
        JsonToken jsonToken1 = JsonToken.NUMBER;
        if(jsonToken0 != jsonToken1 && jsonToken0 != JsonToken.STRING) {
            throw new IllegalStateException("Expected " + jsonToken1 + " but was " + jsonToken0 + this.r());
        }
        int v = ((JsonPrimitive)this.t()).getAsInt();
        this.u();
        int v1 = this.q;
        if(v1 > 0) {
            ++this.s[v1 - 1];
        }
        return v;
    }

    @Override  // com.google.gson.stream.JsonReader
    public long nextLong() throws IOException {
        JsonToken jsonToken0 = this.peek();
        JsonToken jsonToken1 = JsonToken.NUMBER;
        if(jsonToken0 != jsonToken1 && jsonToken0 != JsonToken.STRING) {
            throw new IllegalStateException("Expected " + jsonToken1 + " but was " + jsonToken0 + this.r());
        }
        long v = ((JsonPrimitive)this.t()).getAsLong();
        this.u();
        int v1 = this.q;
        if(v1 > 0) {
            ++this.s[v1 - 1];
        }
        return v;
    }

    @Override  // com.google.gson.stream.JsonReader
    public String nextName() throws IOException {
        return this.s(false);
    }

    @Override  // com.google.gson.stream.JsonReader
    public void nextNull() throws IOException {
        this.p(JsonToken.NULL);
        this.u();
        int v = this.q;
        if(v > 0) {
            ++this.s[v - 1];
        }
    }

    @Override  // com.google.gson.stream.JsonReader
    public String nextString() throws IOException {
        JsonToken jsonToken0 = this.peek();
        JsonToken jsonToken1 = JsonToken.STRING;
        if(jsonToken0 != jsonToken1 && jsonToken0 != JsonToken.NUMBER) {
            throw new IllegalStateException("Expected " + jsonToken1 + " but was " + jsonToken0 + this.r());
        }
        String s = ((JsonPrimitive)this.u()).getAsString();
        int v = this.q;
        if(v > 0) {
            ++this.s[v - 1];
        }
        return s;
    }

    public final void p(JsonToken jsonToken0) {
        if(this.peek() != jsonToken0) {
            throw new IllegalStateException("Expected " + jsonToken0 + " but was " + this.peek() + this.r());
        }
    }

    @Override  // com.google.gson.stream.JsonReader
    public JsonToken peek() throws IOException {
        if(this.q == 0) {
            return JsonToken.END_DOCUMENT;
        }
        Object object0 = this.t();
        if(object0 instanceof Iterator) {
            boolean z = this.p[this.q - 2] instanceof JsonObject;
            if(((Iterator)object0).hasNext()) {
                if(z) {
                    return JsonToken.NAME;
                }
                Object object1 = ((Iterator)object0).next();
                this.v(object1);
                return this.peek();
            }
            return z ? JsonToken.END_OBJECT : JsonToken.END_ARRAY;
        }
        if(object0 instanceof JsonObject) {
            return JsonToken.BEGIN_OBJECT;
        }
        if(object0 instanceof JsonArray) {
            return JsonToken.BEGIN_ARRAY;
        }
        if(object0 instanceof JsonPrimitive) {
            if(((JsonPrimitive)object0).isString()) {
                return JsonToken.STRING;
            }
            if(((JsonPrimitive)object0).isBoolean()) {
                return JsonToken.BOOLEAN;
            }
            if(!((JsonPrimitive)object0).isNumber()) {
                throw new AssertionError();
            }
            return JsonToken.NUMBER;
        }
        if(object0 instanceof JsonNull) {
            return JsonToken.NULL;
        }
        if(object0 != JsonTreeReader.u) {
            throw new MalformedJsonException("Custom JsonElement subclass " + object0.getClass().getName() + " is not supported");
        }
        throw new IllegalStateException("JsonReader is closed");
    }

    public void promoteNameToValue() throws IOException {
        this.p(JsonToken.NAME);
        Object object0 = ((Iterator)this.t()).next();
        this.v(((Map.Entry)object0).getValue());
        this.v(new JsonPrimitive(((String)((Map.Entry)object0).getKey())));
    }

    public final String q(boolean z) {
        StringBuilder stringBuilder0 = new StringBuilder("$");
        for(int v = 0; true; ++v) {
            int v1 = this.q;
            if(v >= v1) {
                break;
            }
            Object[] arr_object = this.p;
            Object object0 = arr_object[v];
            if(object0 instanceof JsonArray) {
                ++v;
                if(v < v1 && arr_object[v] instanceof Iterator) {
                    int v2 = this.s[v];
                    if(z && v2 > 0 && (v == v1 - 1 || v == v1 - 2)) {
                        --v2;
                    }
                    stringBuilder0.append('[');
                    stringBuilder0.append(v2);
                    stringBuilder0.append(']');
                }
            }
            else if(object0 instanceof JsonObject) {
                ++v;
                if(v < v1 && arr_object[v] instanceof Iterator) {
                    stringBuilder0.append('.');
                    String s = this.r[v];
                    if(s != null) {
                        stringBuilder0.append(s);
                    }
                }
            }
        }
        return stringBuilder0.toString();
    }

    public final String r() {
        return " at path " + this.getPath();
    }

    public final String s(boolean z) {
        this.p(JsonToken.NAME);
        Object object0 = ((Iterator)this.t()).next();
        String s = (String)((Map.Entry)object0).getKey();
        this.r[this.q - 1] = z ? "<skipped>" : s;
        this.v(((Map.Entry)object0).getValue());
        return s;
    }

    @Override  // com.google.gson.stream.JsonReader
    public void skipValue() throws IOException {
        switch(c.a[this.peek().ordinal()]) {
            case 1: {
                this.s(true);
                break;
            }
            case 2: {
                this.endArray();
                return;
            }
            case 3: {
                this.endObject();
                return;
            label_6:
                this.u();
                int v = this.q;
                if(v > 0) {
                    ++this.s[v - 1];
                    return;
                }
                break;
            }
            case 4: {
                break;
            }
            default: {
                goto label_6;
            }
        }
    }

    public final Object t() {
        return this.p[this.q - 1];
    }

    @Override  // com.google.gson.stream.JsonReader
    public String toString() {
        return "JsonTreeReader" + this.r();
    }

    public final Object u() {
        Object[] arr_object = this.p;
        int v = this.q - 1;
        this.q = v;
        Object object0 = arr_object[v];
        arr_object[v] = null;
        return object0;
    }

    public final void v(Object object0) {
        int v = this.q;
        Object[] arr_object = this.p;
        if(v == arr_object.length) {
            this.p = Arrays.copyOf(arr_object, v * 2);
            this.s = Arrays.copyOf(this.s, v * 2);
            this.r = (String[])Arrays.copyOf(this.r, v * 2);
        }
        int v1 = this.q;
        this.q = v1 + 1;
        this.p[v1] = object0;
    }
}

