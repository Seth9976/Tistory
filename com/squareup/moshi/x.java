package com.squareup.moshi;

import java.io.IOException;
import okio.BufferedSink;
import okio.Okio;

public final class x extends JsonWriter {
    public final BufferedSink k;
    public String l;
    public String m;
    public static final String[] n;

    static {
        x.n = new String[0x80];
        for(int v = 0; v <= 0x1F; ++v) {
            x.n[v] = "\\u001f";
        }
        x.n[34] = "\\\"";
        x.n[92] = "\\\\";
        x.n[9] = "\\t";
        x.n[8] = "\\b";
        x.n[10] = "\\n";
        x.n[13] = "\\r";
        x.n[12] = "\\f";
    }

    public x(BufferedSink bufferedSink0) {
        this.l = ":";
        if(bufferedSink0 == null) {
            throw new NullPointerException("sink == null");
        }
        this.k = bufferedSink0;
        this.c(6);
    }

    @Override  // com.squareup.moshi.JsonWriter
    public final JsonWriter beginArray() {
        if(this.h) {
            throw new IllegalStateException("Array cannot be used as a map key in JSON at path $");
        }
        this.i();
        this.g(1, 2, '[');
        return this;
    }

    @Override  // com.squareup.moshi.JsonWriter
    public final JsonWriter beginObject() {
        if(this.h) {
            throw new IllegalStateException("Object cannot be used as a map key in JSON at path $");
        }
        this.i();
        this.g(3, 5, '{');
        return this;
    }

    @Override
    public final void close() {
        this.k.close();
        if(this.a > 1 || this.a == 1 && this.b[0] != 7) {
            throw new IOException("Incomplete document");
        }
        this.a = 0;
    }

    public final void d() {
        int v = this.b();
        int v1 = 2;
        if(v == 1) {
            this.f();
        }
        else {
            BufferedSink bufferedSink0 = this.k;
            switch(v) {
                case 2: {
                    bufferedSink0.writeByte(44);
                    this.f();
                    break;
                }
                case 4: {
                    bufferedSink0.writeUtf8(this.l);
                    v1 = 5;
                    break;
                }
                case 6: {
                    v1 = 7;
                    break;
                }
                case 7: {
                    if(!this.f) {
                        throw new IllegalStateException("JSON must have only one top-level value.");
                    }
                    v1 = 7;
                    break;
                }
                case 9: {
                    throw new IllegalStateException("Sink from valueSink() was not closed");
                }
                default: {
                    throw new IllegalStateException("Nesting problem.");
                }
            }
        }
        this.b[this.a - 1] = v1;
    }

    public final void e(int v, int v1, char c) {
        int v2 = this.b();
        if(v2 != v1 && v2 != v) {
            throw new IllegalStateException("Nesting problem.");
        }
        if(this.m != null) {
            throw new IllegalStateException("Dangling name: " + this.m);
        }
        int v3 = this.a;
        int v4 = ~this.i;
        if(v3 == v4) {
            this.i = v4;
            return;
        }
        this.a = v3 - 1;
        this.c[v3 - 1] = null;
        ++this.d[v3 - 2];
        if(v2 == v1) {
            this.f();
        }
        this.k.writeByte(((int)c));
    }

    @Override  // com.squareup.moshi.JsonWriter
    public final JsonWriter endArray() {
        this.e(1, 2, ']');
        return this;
    }

    @Override  // com.squareup.moshi.JsonWriter
    public final JsonWriter endObject() {
        this.h = false;
        this.e(3, 5, '}');
        return this;
    }

    public final void f() {
        if(this.e == null) {
            return;
        }
        BufferedSink bufferedSink0 = this.k;
        bufferedSink0.writeByte(10);
        int v = this.a;
        for(int v1 = 1; v1 < v; ++v1) {
            bufferedSink0.writeUtf8(this.e);
        }
    }

    @Override
    public final void flush() {
        if(this.a == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.k.flush();
    }

    public final void g(int v, int v1, char c) {
        int v2 = this.a;
        int v3 = this.i;
        if(v2 == v3) {
            int v4 = this.b[v2 - 1];
            if(v4 == v || v4 == v1) {
                this.i = ~v3;
                return;
            }
        }
        this.d();
        this.a();
        this.c(v);
        this.d[this.a - 1] = 0;
        this.k.writeByte(((int)c));
    }

    public static void h(BufferedSink bufferedSink0, String s) {
        String s2;
        String[] arr_s = x.n;
        bufferedSink0.writeByte(34);
        int v = s.length();
        int v1 = 0;
        int v2 = 0;
        while(v1 < v) {
            int v3 = s.charAt(v1);
            if(v3 < 0x80) {
                String s1 = arr_s[v3];
                if(s1 != null) {
                    s2 = s1;
                    goto label_17;
                }
            }
            else {
                switch(v3) {
                    case 0x2028: {
                        s2 = "\\u2028";
                        break;
                    }
                    case 0x2029: {
                        s2 = "\\u2029";
                        break;
                    }
                    default: {
                        goto label_21;
                    }
                }
            label_17:
                if(v2 < v1) {
                    bufferedSink0.writeUtf8(s, v2, v1);
                }
                bufferedSink0.writeUtf8(s2);
                v2 = v1 + 1;
            }
        label_21:
            ++v1;
        }
        if(v2 < v) {
            bufferedSink0.writeUtf8(s, v2, v);
        }
        bufferedSink0.writeByte(34);
    }

    public final void i() {
        if(this.m != null) {
            int v = this.b();
            BufferedSink bufferedSink0 = this.k;
            if(v == 5) {
                bufferedSink0.writeByte(44);
            }
            else if(v == 3) {
            }
            else {
                throw new IllegalStateException("Nesting problem.");
            }
            this.f();
            this.b[this.a - 1] = 4;
            x.h(bufferedSink0, this.m);
            this.m = null;
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
        switch(this.b()) {
            case 3: 
            case 5: {
                if(this.m == null && !this.h) {
                    this.m = s;
                    this.c[this.a - 1] = s;
                    return this;
                }
            }
        }
        throw new IllegalStateException("Nesting problem.");
    }

    @Override  // com.squareup.moshi.JsonWriter
    public final JsonWriter nullValue() {
        if(this.h) {
            throw new IllegalStateException("null cannot be used as a map key in JSON at path $");
        }
        if(this.m != null) {
            if(this.g) {
                this.i();
                goto label_7;
            }
            this.m = null;
            return this;
        }
    label_7:
        this.d();
        this.k.writeUtf8("null");
        int v = this.a - 1;
        ++this.d[v];
        return this;
    }

    @Override  // com.squareup.moshi.JsonWriter
    public final void setIndent(String s) {
        super.setIndent(s);
        this.l = s.isEmpty() ? ":" : ": ";
    }

    @Override  // com.squareup.moshi.JsonWriter
    public final JsonWriter value(double f) {
        if(!this.f && (Double.isNaN(f) || Double.isInfinite(f))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + f);
        }
        if(this.h) {
            this.h = false;
            this.name(Double.toString(f));
            return this;
        }
        this.i();
        this.d();
        this.k.writeUtf8(Double.toString(f));
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
        this.i();
        this.d();
        this.k.writeUtf8(Long.toString(v));
        int v1 = this.a - 1;
        ++this.d[v1];
        return this;
    }

    @Override  // com.squareup.moshi.JsonWriter
    public final JsonWriter value(Boolean boolean0) {
        if(boolean0 == null) {
            this.nullValue();
            return this;
        }
        this.value(boolean0.booleanValue());
        return this;
    }

    @Override  // com.squareup.moshi.JsonWriter
    public final JsonWriter value(Number number0) {
        if(number0 == null) {
            this.nullValue();
            return this;
        }
        String s = number0.toString();
        if(!this.f && (s.equals("-Infinity") || s.equals("Infinity") || s.equals("NaN"))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + number0);
        }
        if(this.h) {
            this.h = false;
            this.name(s);
            return this;
        }
        this.i();
        this.d();
        this.k.writeUtf8(s);
        int v = this.a - 1;
        ++this.d[v];
        return this;
    }

    @Override  // com.squareup.moshi.JsonWriter
    public final JsonWriter value(String s) {
        if(s == null) {
            this.nullValue();
            return this;
        }
        if(this.h) {
            this.h = false;
            this.name(s);
            return this;
        }
        this.i();
        this.d();
        x.h(this.k, s);
        int v = this.a - 1;
        ++this.d[v];
        return this;
    }

    @Override  // com.squareup.moshi.JsonWriter
    public final JsonWriter value(boolean z) {
        if(this.h) {
            throw new IllegalStateException("Boolean cannot be used as a map key in JSON at path $");
        }
        this.i();
        this.d();
        this.k.writeUtf8((z ? "true" : "false"));
        int v = this.a - 1;
        ++this.d[v];
        return this;
    }

    @Override  // com.squareup.moshi.JsonWriter
    public final BufferedSink valueSink() {
        if(this.h) {
            throw new IllegalStateException("BufferedSink cannot be used as a map key in JSON at path $");
        }
        this.i();
        this.d();
        this.c(9);
        return Okio.buffer(new w(this));
    }
}

