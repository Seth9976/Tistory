package com.squareup.moshi;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;

public final class z extends JsonReader {
    public Object[] h;
    public static final Object i;

    static {
        z.i = new Object();
    }

    @Override  // com.squareup.moshi.JsonReader
    public final void beginArray() {
        List list0 = (List)this.f(List.class, Token.BEGIN_ARRAY);
        Object[] arr_object = list0.toArray(new Object[list0.size()]);
        y y0 = new y(Token.END_ARRAY, arr_object, 0);
        int v = this.a;
        this.h[v - 1] = y0;
        this.b[v - 1] = 1;
        this.d[v - 1] = 0;
        if(y0.hasNext()) {
            this.d(y0.next());
        }
    }

    @Override  // com.squareup.moshi.JsonReader
    public final void beginObject() {
        Map map0 = (Map)this.f(Map.class, Token.BEGIN_OBJECT);
        Object[] arr_object = map0.entrySet().toArray(new Object[map0.size()]);
        y y0 = new y(Token.END_OBJECT, arr_object, 0);
        int v = this.a;
        this.h[v - 1] = y0;
        this.b[v - 1] = 3;
        if(y0.hasNext()) {
            this.d(y0.next());
        }
    }

    @Override
    public final void close() {
        Arrays.fill(this.h, 0, this.a, null);
        this.h[0] = z.i;
        this.b[0] = 8;
        this.a = 1;
    }

    public final void d(Object object0) {
        int v = this.a;
        if(v == this.h.length) {
            if(v == 0x100) {
                throw new JsonDataException("Nesting too deep at $");
            }
            this.b = Arrays.copyOf(this.b, this.b.length * 2);
            this.c = (String[])Arrays.copyOf(this.c, this.c.length * 2);
            this.d = Arrays.copyOf(this.d, this.d.length * 2);
            this.h = Arrays.copyOf(this.h, this.h.length * 2);
        }
        int v1 = this.a;
        this.a = v1 + 1;
        this.h[v1] = object0;
    }

    public final void e() {
        int v = this.a;
        this.a = v - 1;
        Object[] arr_object = this.h;
        arr_object[v - 1] = null;
        this.b[v - 1] = 0;
        if(v - 1 > 0) {
            ++this.d[v - 2];
            Object object0 = arr_object[v - 2];
            if(object0 instanceof Iterator && ((Iterator)object0).hasNext()) {
                Object object1 = ((Iterator)object0).next();
                this.d(object1);
            }
        }
    }

    @Override  // com.squareup.moshi.JsonReader
    public final void endArray() {
        Token jsonReader$Token0 = Token.END_ARRAY;
        y y0 = (y)this.f(y.class, jsonReader$Token0);
        if(y0.a != jsonReader$Token0 || y0.hasNext()) {
            throw this.c(y0, jsonReader$Token0);
        }
        this.e();
    }

    @Override  // com.squareup.moshi.JsonReader
    public final void endObject() {
        Token jsonReader$Token0 = Token.END_OBJECT;
        y y0 = (y)this.f(y.class, jsonReader$Token0);
        if(y0.a != jsonReader$Token0 || y0.hasNext()) {
            throw this.c(y0, jsonReader$Token0);
        }
        this.c[this.a - 1] = null;
        this.e();
    }

    public final Object f(Class class0, Token jsonReader$Token0) {
        Object object0 = this.a == 0 ? null : this.h[this.a - 1];
        if(class0.isInstance(object0)) {
            return class0.cast(object0);
        }
        if(object0 == null && jsonReader$Token0 == Token.NULL) {
            return null;
        }
        if(object0 == z.i) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw this.c(object0, jsonReader$Token0);
    }

    @Override  // com.squareup.moshi.JsonReader
    public final boolean hasNext() {
        int v = this.a;
        if(v == 0) {
            return false;
        }
        Object object0 = this.h[v - 1];
        return !(object0 instanceof Iterator) || ((Iterator)object0).hasNext();
    }

    @Override  // com.squareup.moshi.JsonReader
    public final boolean nextBoolean() {
        Boolean boolean0 = (Boolean)this.f(Boolean.class, Token.BOOLEAN);
        this.e();
        return boolean0.booleanValue();
    }

    @Override  // com.squareup.moshi.JsonReader
    public final double nextDouble() {
        double f;
        Token jsonReader$Token0 = Token.NUMBER;
        Object object0 = this.f(Object.class, jsonReader$Token0);
        if(object0 instanceof Number) {
            f = ((Number)object0).doubleValue();
        }
        else if(object0 instanceof String) {
            try {
                f = Double.parseDouble(((String)object0));
            }
            catch(NumberFormatException unused_ex) {
                throw this.c(object0, Token.NUMBER);
            }
        }
        else {
            throw this.c(object0, jsonReader$Token0);
        }
        if(!this.e && (Double.isNaN(f) || Double.isInfinite(f))) {
            throw new JsonEncodingException("JSON forbids NaN and infinities: " + f + " at path " + "$");
        }
        this.e();
        return f;
    }

    @Override  // com.squareup.moshi.JsonReader
    public final int nextInt() {
        int v;
        Token jsonReader$Token0 = Token.NUMBER;
        Object object0 = this.f(Object.class, jsonReader$Token0);
        if(object0 instanceof Number) {
            v = ((Number)object0).intValue();
        }
        else if(object0 instanceof String) {
            try {
                v = Integer.parseInt(((String)object0));
            }
            catch(NumberFormatException unused_ex) {
                try {
                    v = new BigDecimal(((String)object0)).intValueExact();
                }
                catch(NumberFormatException unused_ex) {
                    throw this.c(object0, Token.NUMBER);
                }
            }
        }
        else {
            throw this.c(object0, jsonReader$Token0);
        }
        this.e();
        return v;
    }

    @Override  // com.squareup.moshi.JsonReader
    public final long nextLong() {
        long v;
        Token jsonReader$Token0 = Token.NUMBER;
        Object object0 = this.f(Object.class, jsonReader$Token0);
        if(object0 instanceof Number) {
            v = ((Number)object0).longValue();
        }
        else if(object0 instanceof String) {
            try {
                v = Long.parseLong(((String)object0));
            }
            catch(NumberFormatException unused_ex) {
                try {
                    v = new BigDecimal(((String)object0)).longValueExact();
                }
                catch(NumberFormatException unused_ex) {
                    throw this.c(object0, Token.NUMBER);
                }
            }
        }
        else {
            throw this.c(object0, jsonReader$Token0);
        }
        this.e();
        return v;
    }

    @Override  // com.squareup.moshi.JsonReader
    public final String nextName() {
        Token jsonReader$Token0 = Token.NAME;
        Map.Entry map$Entry0 = (Map.Entry)this.f(Map.Entry.class, jsonReader$Token0);
        Object object0 = map$Entry0.getKey();
        if(!(object0 instanceof String)) {
            throw this.c(object0, jsonReader$Token0);
        }
        Object[] arr_object = this.h;
        int v = this.a - 1;
        arr_object[v] = map$Entry0.getValue();
        this.c[this.a - 2] = (String)object0;
        return (String)object0;
    }

    @Override  // com.squareup.moshi.JsonReader
    public final Object nextNull() {
        this.f(Void.class, Token.NULL);
        this.e();
        return null;
    }

    @Override  // com.squareup.moshi.JsonReader
    public final BufferedSource nextSource() {
        try {
            Object object0 = this.readJsonValue();
            BufferedSource bufferedSource0 = new Buffer();
            try(JsonWriter jsonWriter0 = JsonWriter.of(((BufferedSink)bufferedSource0))) {
                jsonWriter0.jsonValue(object0);
            }
            return bufferedSource0;
        }
        catch(Throwable throwable0) {
            throw throwable0;
        }
    }

    @Override  // com.squareup.moshi.JsonReader
    public final String nextString() {
        Object object0 = this.a == 0 ? null : this.h[this.a - 1];
        if(object0 instanceof String) {
            this.e();
            return (String)object0;
        }
        if(object0 instanceof Number) {
            this.e();
            return object0.toString();
        }
        if(object0 != z.i) {
            throw this.c(object0, Token.STRING);
        }
        throw new IllegalStateException("JsonReader is closed");
    }

    @Override  // com.squareup.moshi.JsonReader
    public final Token peek() {
        int v = this.a;
        if(v == 0) {
            return Token.END_DOCUMENT;
        }
        Object object0 = this.h[v - 1];
        if(object0 instanceof y) {
            return ((y)object0).a;
        }
        if(object0 instanceof List) {
            return Token.BEGIN_ARRAY;
        }
        if(object0 instanceof Map) {
            return Token.BEGIN_OBJECT;
        }
        if(object0 instanceof Map.Entry) {
            return Token.NAME;
        }
        if(object0 instanceof String) {
            return Token.STRING;
        }
        if(object0 instanceof Boolean) {
            return Token.BOOLEAN;
        }
        if(object0 instanceof Number) {
            return Token.NUMBER;
        }
        if(object0 == null) {
            return Token.NULL;
        }
        if(object0 != z.i) {
            throw this.c(object0, "a JSON value");
        }
        throw new IllegalStateException("JsonReader is closed");
    }

    @Override  // com.squareup.moshi.JsonReader
    public final JsonReader peekJson() {
        JsonReader jsonReader0 = new z(this);  // 初始化器: Lcom/squareup/moshi/JsonReader;-><init>(Lcom/squareup/moshi/JsonReader;)V
        jsonReader0.h = (Object[])this.h.clone();
        for(int v = 0; v < jsonReader0.a; ++v) {
            Object[] arr_object = jsonReader0.h;
            Object object0 = arr_object[v];
            if(object0 instanceof y) {
                arr_object[v] = new y(((y)object0).a, ((y)object0).b, ((y)object0).c);
            }
        }
        return jsonReader0;
    }

    @Override  // com.squareup.moshi.JsonReader
    public final void promoteNameToValue() {
        if(this.hasNext()) {
            this.d(this.nextName());
        }
    }

    @Override  // com.squareup.moshi.JsonReader
    public final int selectName(Options jsonReader$Options0) {
        Token jsonReader$Token0 = Token.NAME;
        Map.Entry map$Entry0 = (Map.Entry)this.f(Map.Entry.class, jsonReader$Token0);
        Object object0 = map$Entry0.getKey();
        if(!(object0 instanceof String)) {
            throw this.c(object0, jsonReader$Token0);
        }
        for(int v = 0; v < jsonReader$Options0.a.length; ++v) {
            if(jsonReader$Options0.a[v].equals(((String)object0))) {
                Object[] arr_object = this.h;
                int v1 = this.a - 1;
                arr_object[v1] = map$Entry0.getValue();
                this.c[this.a - 2] = (String)object0;
                return v;
            }
        }
        return -1;
    }

    @Override  // com.squareup.moshi.JsonReader
    public final int selectString(Options jsonReader$Options0) {
        Object object0 = this.a == 0 ? null : this.h[this.a - 1];
        if(!(object0 instanceof String)) {
            if(object0 == z.i) {
                throw new IllegalStateException("JsonReader is closed");
            }
            return -1;
        }
        for(int v = 0; v < jsonReader$Options0.a.length; ++v) {
            if(jsonReader$Options0.a[v].equals(((String)object0))) {
                this.e();
                return v;
            }
        }
        return -1;
    }

    @Override  // com.squareup.moshi.JsonReader
    public final void skipName() {
        if(!this.f) {
            Map.Entry map$Entry0 = (Map.Entry)this.f(Map.Entry.class, Token.NAME);
            Object[] arr_object = this.h;
            int v = this.a - 1;
            arr_object[v] = map$Entry0.getValue();
            this.c[this.a - 2] = "null";
            return;
        }
        Token jsonReader$Token0 = this.peek();
        this.nextName();
        throw new JsonDataException("Cannot skip unexpected " + jsonReader$Token0 + " at " + "$");
    }

    @Override  // com.squareup.moshi.JsonReader
    public final void skipValue() {
        if(this.f) {
            throw new JsonDataException("Cannot skip unexpected " + this.peek() + " at " + "$");
        }
        int v = this.a;
        if(v > 1) {
            this.c[v - 2] = "null";
        }
        Object object0 = v == 0 ? null : this.h[v - 1];
        if(object0 instanceof y) {
            throw new JsonDataException("Expected a value but was " + this.peek() + " at path " + "$");
        }
        if(object0 instanceof Map.Entry) {
            Object[] arr_object = this.h;
            arr_object[v - 1] = ((Map.Entry)arr_object[v - 1]).getValue();
            return;
        }
        if(v <= 0) {
            throw new JsonDataException("Expected a value but was " + this.peek() + " at path " + "$");
        }
        this.e();
    }
}

