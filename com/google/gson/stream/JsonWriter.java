package com.google.gson.stream;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

public class JsonWriter implements Closeable, Flushable {
    public final Writer a;
    public int[] b;
    public int c;
    public String d;
    public String e;
    public boolean f;
    public boolean g;
    public String h;
    public boolean i;
    public static final Pattern j;
    public static final String[] k;
    public static final String[] l;

    static {
        JsonWriter.j = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");
        JsonWriter.k = new String[0x80];
        for(int v = 0; v <= 0x1F; ++v) {
            JsonWriter.k[v] = "\\u001f";
        }
        JsonWriter.k[34] = "\\\"";
        JsonWriter.k[92] = "\\\\";
        JsonWriter.k[9] = "\\t";
        JsonWriter.k[8] = "\\b";
        JsonWriter.k[10] = "\\n";
        JsonWriter.k[13] = "\\r";
        JsonWriter.k[12] = "\\f";
        String[] arr_s = (String[])JsonWriter.k.clone();
        JsonWriter.l = arr_s;
        arr_s[60] = "\\u003c";
        arr_s[62] = "\\u003e";
        arr_s[38] = "\\u0026";
        arr_s[61] = "\\u003d";
        arr_s[39] = "\\u0027";
    }

    public JsonWriter(Writer writer0) {
        this.b = new int[0x20];
        int v = this.c;
        this.c = v + 1;
        this.b[v] = 6;
        this.e = ":";
        this.i = true;
        Objects.requireNonNull(writer0, "out == null");
        this.a = writer0;
    }

    public final void a() {
        int v = this.d();
        if(v != 1) {
            Writer writer0 = this.a;
            switch(v) {
                case 2: {
                    writer0.append(',');
                    this.c();
                    return;
                }
                case 4: {
                    writer0.append(this.e);
                    this.b[this.c - 1] = 5;
                    return;
                }
                case 6: {
                    break;
                }
                case 7: {
                    if(!this.f) {
                        throw new IllegalStateException("JSON must have only one top-level value.");
                    }
                    break;
                }
                default: {
                    throw new IllegalStateException("Nesting problem.");
                }
            }
            this.b[this.c - 1] = 7;
            return;
        }
        this.b[this.c - 1] = 2;
        this.c();
    }

    public final void b(int v, int v1, char c) {
        int v2 = this.d();
        if(v2 != v1 && v2 != v) {
            throw new IllegalStateException("Nesting problem.");
        }
        if(this.h != null) {
            throw new IllegalStateException("Dangling name: " + this.h);
        }
        --this.c;
        if(v2 == v1) {
            this.c();
        }
        this.a.write(((int)c));
    }

    public JsonWriter beginArray() throws IOException {
        this.f();
        this.a();
        int v = this.c;
        int[] arr_v = this.b;
        if(v == arr_v.length) {
            this.b = Arrays.copyOf(arr_v, v * 2);
        }
        int v1 = this.c;
        this.c = v1 + 1;
        this.b[v1] = 1;
        this.a.write(91);
        return this;
    }

    public JsonWriter beginObject() throws IOException {
        this.f();
        this.a();
        int v = this.c;
        int[] arr_v = this.b;
        if(v == arr_v.length) {
            this.b = Arrays.copyOf(arr_v, v * 2);
        }
        int v1 = this.c;
        this.c = v1 + 1;
        this.b[v1] = 3;
        this.a.write(0x7B);
        return this;
    }

    public final void c() {
        if(this.d == null) {
            return;
        }
        Writer writer0 = this.a;
        writer0.write(10);
        int v = this.c;
        for(int v1 = 1; v1 < v; ++v1) {
            writer0.write(this.d);
        }
    }

    @Override
    public void close() throws IOException {
        this.a.close();
        if(this.c > 1 || this.c == 1 && this.b[0] != 7) {
            throw new IOException("Incomplete document");
        }
        this.c = 0;
    }

    public final int d() {
        int v = this.c;
        if(v == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        return this.b[v - 1];
    }

    public final void e(String s) {
        String s2;
        String[] arr_s = this.g ? JsonWriter.l : JsonWriter.k;
        Writer writer0 = this.a;
        writer0.write(34);
        int v = s.length();
        int v1 = 0;
        int v2 = 0;
        while(v1 < v) {
            int v3 = s.charAt(v1);
            if(v3 < 0x80) {
                String s1 = arr_s[v3];
                if(s1 != null) {
                    s2 = s1;
                    goto label_18;
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
                        goto label_22;
                    }
                }
            label_18:
                if(v2 < v1) {
                    writer0.write(s, v2, v1 - v2);
                }
                writer0.write(s2);
                v2 = v1 + 1;
            }
        label_22:
            ++v1;
        }
        if(v2 < v) {
            writer0.write(s, v2, v - v2);
        }
        writer0.write(34);
    }

    public JsonWriter endArray() throws IOException {
        this.b(1, 2, ']');
        return this;
    }

    public JsonWriter endObject() throws IOException {
        this.b(3, 5, '}');
        return this;
    }

    public final void f() {
        if(this.h != null) {
            int v = this.d();
            if(v == 5) {
                this.a.write(44);
            }
            else if(v == 3) {
            }
            else {
                throw new IllegalStateException("Nesting problem.");
            }
            this.c();
            this.b[this.c - 1] = 4;
            this.e(this.h);
            this.h = null;
        }
    }

    @Override
    public void flush() throws IOException {
        if(this.c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.a.flush();
    }

    public final boolean getSerializeNulls() {
        return this.i;
    }

    public final boolean isHtmlSafe() {
        return this.g;
    }

    public boolean isLenient() {
        return this.f;
    }

    public JsonWriter jsonValue(String s) throws IOException {
        if(s == null) {
            return this.nullValue();
        }
        this.f();
        this.a();
        this.a.append(s);
        return this;
    }

    public JsonWriter name(String s) throws IOException {
        Objects.requireNonNull(s, "name == null");
        if(this.h != null) {
            throw new IllegalStateException();
        }
        if(this.c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.h = s;
        return this;
    }

    public JsonWriter nullValue() throws IOException {
        if(this.h != null) {
            if(this.i) {
                this.f();
                this.a();
                this.a.write("null");
                return this;
            }
            this.h = null;
            return this;
        }
        this.a();
        this.a.write("null");
        return this;
    }

    public final void setHtmlSafe(boolean z) {
        this.g = z;
    }

    public final void setIndent(String s) {
        if(s.length() == 0) {
            this.d = null;
            this.e = ":";
            return;
        }
        this.d = s;
        this.e = ": ";
    }

    public final void setLenient(boolean z) {
        this.f = z;
    }

    public final void setSerializeNulls(boolean z) {
        this.i = z;
    }

    public JsonWriter value(double f) throws IOException {
        this.f();
        if(!this.f && (Double.isNaN(f) || Double.isInfinite(f))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + f);
        }
        this.a();
        this.a.append(Double.toString(f));
        return this;
    }

    public JsonWriter value(float f) throws IOException {
        this.f();
        if(!this.f && (Float.isNaN(f) || Float.isInfinite(f))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + f);
        }
        this.a();
        this.a.append(Float.toString(f));
        return this;
    }

    public JsonWriter value(long v) throws IOException {
        this.f();
        this.a();
        this.a.write(Long.toString(v));
        return this;
    }

    public JsonWriter value(Boolean boolean0) throws IOException {
        if(boolean0 == null) {
            return this.nullValue();
        }
        this.f();
        this.a();
        this.a.write((boolean0.booleanValue() ? "true" : "false"));
        return this;
    }

    public JsonWriter value(Number number0) throws IOException {
        if(number0 == null) {
            return this.nullValue();
        }
        this.f();
        String s = number0.toString();
        if(!s.equals("-Infinity") && !s.equals("Infinity") && !s.equals("NaN")) {
            Class class0 = number0.getClass();
            if(class0 != Integer.class && class0 != Long.class && class0 != Double.class && class0 != Float.class && class0 != Byte.class && class0 != Short.class && class0 != BigDecimal.class && class0 != BigInteger.class && class0 != AtomicInteger.class && class0 != AtomicLong.class && !JsonWriter.j.matcher(s).matches()) {
                throw new IllegalArgumentException("String created by " + class0 + " is not a valid JSON number: " + s);
            }
        }
        else if(!this.f) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + s);
        }
        this.a();
        this.a.append(s);
        return this;
    }

    public JsonWriter value(String s) throws IOException {
        if(s == null) {
            return this.nullValue();
        }
        this.f();
        this.a();
        this.e(s);
        return this;
    }

    public JsonWriter value(boolean z) throws IOException {
        this.f();
        this.a();
        this.a.write((z ? "true" : "false"));
        return this;
    }
}

