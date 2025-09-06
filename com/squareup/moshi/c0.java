package com.squareup.moshi;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import okio.Buffer;
import okio.BufferedSink;
import okio.Okio;

public final class c0 extends JsonWriter {
    public Object[] k;
    public String l;

    @Override  // com.squareup.moshi.JsonWriter
    public final JsonWriter beginArray() {
        if(this.h) {
            throw new IllegalStateException("Array cannot be used as a map key in JSON at path $");
        }
        int v = this.i;
        if(this.a == v && this.b[this.a - 1] == 1) {
            this.i = ~v;
            return this;
        }
        this.a();
        ArrayList arrayList0 = new ArrayList();
        this.d(arrayList0);
        int v1 = this.a;
        this.k[v1] = arrayList0;
        this.d[v1] = 0;
        this.c(1);
        return this;
    }

    @Override  // com.squareup.moshi.JsonWriter
    public final JsonWriter beginObject() {
        if(this.h) {
            throw new IllegalStateException("Object cannot be used as a map key in JSON at path $");
        }
        int v = this.i;
        if(this.a == v && this.b[this.a - 1] == 3) {
            this.i = ~v;
            return this;
        }
        this.a();
        g0 g00 = new g0();
        this.d(g00);
        this.k[this.a] = g00;
        this.c(3);
        return this;
    }

    @Override
    public final void close() {
        if(this.a > 1 || this.a == 1 && this.b[0] != 7) {
            throw new IOException("Incomplete document");
        }
        this.a = 0;
    }

    public final void d(Object object0) {
        int v = this.b();
        int v1 = this.a;
        if(v1 == 1) {
            if(v != 6) {
                throw new IllegalStateException("JSON must have only one top-level value.");
            }
            this.b[0] = 7;
            this.k[0] = object0;
            return;
        }
        if(v == 3) {
            String s = this.l;
            if(s != null) {
                if(object0 != null || this.g) {
                    Object object1 = ((Map)this.k[v1 - 1]).put(s, object0);
                    if(object1 != null) {
                        throw new IllegalArgumentException("Map key \'" + this.l + "\' has multiple values at path " + "$" + ": " + object1 + " and " + object0);
                    }
                }
                this.l = null;
                return;
            }
        }
        if(v != 1) {
            throw v == 9 ? new IllegalStateException("Sink from valueSink() was not closed") : new IllegalStateException("Nesting problem.");
        }
        ((List)this.k[v1 - 1]).add(object0);
    }

    @Override  // com.squareup.moshi.JsonWriter
    public final JsonWriter endArray() {
        if(this.b() != 1) {
            throw new IllegalStateException("Nesting problem.");
        }
        int v = this.a;
        int v1 = this.i;
        if(v == ~v1) {
            this.i = ~v1;
            return this;
        }
        this.a = v - 1;
        this.k[v - 1] = null;
        ++this.d[v - 2];
        return this;
    }

    @Override  // com.squareup.moshi.JsonWriter
    public final JsonWriter endObject() {
        if(this.b() != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        if(this.l != null) {
            throw new IllegalStateException("Dangling name: " + this.l);
        }
        int v = this.a;
        int v1 = this.i;
        if(v == ~v1) {
            this.i = ~v1;
            return this;
        }
        this.h = false;
        this.a = v - 1;
        this.k[v - 1] = null;
        this.c[v - 1] = null;
        ++this.d[v - 2];
        return this;
    }

    @Override
    public final void flush() {
        if(this.a == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }

    @Override  // com.squareup.moshi.JsonWriter
    public final JsonWriter name(String s) {
        if(s == null) {
            throw new NullPointerException("name == null");
        }
        if(this.a == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        if(this.b() != 3 || this.l != null || this.h) {
            throw new IllegalStateException("Nesting problem.");
        }
        this.l = s;
        this.c[this.a - 1] = s;
        return this;
    }

    @Override  // com.squareup.moshi.JsonWriter
    public final JsonWriter nullValue() {
        if(this.h) {
            throw new IllegalStateException("null cannot be used as a map key in JSON at path $");
        }
        this.d(null);
        int v = this.a - 1;
        ++this.d[v];
        return this;
    }

    @Override  // com.squareup.moshi.JsonWriter
    public final JsonWriter value(double f) {
        if(!this.f && (Double.isNaN(f) || f == -Infinity || f == Infinity)) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + f);
        }
        if(this.h) {
            this.h = false;
            this.name(Double.toString(f));
            return this;
        }
        this.d(f);
        int v = this.a - 1;
        ++this.d[v];
        return this;
    }

    @Override  // com.squareup.moshi.JsonWriter
    public final JsonWriter value(long v) {
        if(this.h) {
            this.h = false;
            this.name(Long.toString(v));
            return this;
        }
        this.d(v);
        int v1 = this.a - 1;
        ++this.d[v1];
        return this;
    }

    @Override  // com.squareup.moshi.JsonWriter
    public final JsonWriter value(Boolean boolean0) {
        if(this.h) {
            throw new IllegalStateException("Boolean cannot be used as a map key in JSON at path $");
        }
        this.d(boolean0);
        int v = this.a - 1;
        ++this.d[v];
        return this;
    }

    @Override  // com.squareup.moshi.JsonWriter
    public final JsonWriter value(Number number0) {
        if(!(number0 instanceof Byte) && !(number0 instanceof Short) && !(number0 instanceof Integer) && !(number0 instanceof Long)) {
            if(!(number0 instanceof Float) && !(number0 instanceof Double)) {
                if(number0 == null) {
                    this.nullValue();
                    return this;
                }
                BigDecimal bigDecimal0 = number0 instanceof BigDecimal ? ((BigDecimal)number0) : new BigDecimal(number0.toString());
                if(this.h) {
                    this.h = false;
                    this.name(bigDecimal0.toString());
                    return this;
                }
                this.d(bigDecimal0);
                int v = this.a - 1;
                ++this.d[v];
                return this;
            }
            this.value(number0.doubleValue());
            return this;
        }
        this.value(number0.longValue());
        return this;
    }

    @Override  // com.squareup.moshi.JsonWriter
    public final JsonWriter value(String s) {
        if(this.h) {
            this.h = false;
            this.name(s);
            return this;
        }
        this.d(s);
        int v = this.a - 1;
        ++this.d[v];
        return this;
    }

    @Override  // com.squareup.moshi.JsonWriter
    public final JsonWriter value(boolean z) {
        if(this.h) {
            throw new IllegalStateException("Boolean cannot be used as a map key in JSON at path $");
        }
        this.d(Boolean.valueOf(z));
        int v = this.a - 1;
        ++this.d[v];
        return this;
    }

    @Override  // com.squareup.moshi.JsonWriter
    public final BufferedSink valueSink() {
        if(this.h) {
            throw new IllegalStateException("BufferedSink cannot be used as a map key in JSON at path $");
        }
        if(this.b() == 9) {
            throw new IllegalStateException("Sink from valueSink() was not closed");
        }
        this.c(9);
        Buffer buffer0 = new Buffer();
        return Okio.buffer(new b0(this, buffer0, buffer0));
    }
}

