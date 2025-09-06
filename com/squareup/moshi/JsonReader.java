package com.squareup.moshi;

import a5.b;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;

public abstract class JsonReader implements Closeable {
    public static final class Options {
        public final String[] a;
        public final okio.Options b;

        public Options(String[] arr_s, okio.Options options0) {
            this.a = arr_s;
            this.b = options0;
        }

        @CheckReturnValue
        public static Options of(String[] arr_s) {
            try {
                ByteString[] arr_byteString = new ByteString[arr_s.length];
                Buffer buffer0 = new Buffer();
                for(int v = 0; v < arr_s.length; ++v) {
                    x.h(buffer0, arr_s[v]);
                    buffer0.readByte();
                    arr_byteString[v] = buffer0.readByteString();
                }
                return new Options(((String[])arr_s.clone()), okio.Options.of(arr_byteString));
            }
            catch(IOException iOException0) {
            }
            throw new AssertionError(iOException0);
        }

        public List strings() {
            return Collections.unmodifiableList(Arrays.asList(this.a));
        }
    }

    public static enum Token {
        BEGIN_ARRAY,
        END_ARRAY,
        BEGIN_OBJECT,
        END_OBJECT,
        NAME,
        STRING,
        NUMBER,
        BOOLEAN,
        NULL,
        END_DOCUMENT;

    }

    public int a;
    public int[] b;
    public String[] c;
    public int[] d;
    public boolean e;
    public boolean f;
    public LinkedHashMap g;

    public JsonReader() {
        this.b = new int[0x20];
        this.c = new String[0x20];
        this.d = new int[0x20];
    }

    public JsonReader(JsonReader jsonReader0) {
        this.a = jsonReader0.a;
        this.b = (int[])jsonReader0.b.clone();
        this.c = (String[])jsonReader0.c.clone();
        this.d = (int[])jsonReader0.d.clone();
        this.e = jsonReader0.e;
        this.f = jsonReader0.f;
    }

    public final void a(int v) {
        int v1 = this.a;
        int[] arr_v = this.b;
        if(v1 == arr_v.length) {
            if(v1 == 0x100) {
                throw new JsonDataException("Nesting too deep at $");
            }
            this.b = Arrays.copyOf(arr_v, arr_v.length * 2);
            this.c = (String[])Arrays.copyOf(this.c, this.c.length * 2);
            this.d = Arrays.copyOf(this.d, this.d.length * 2);
        }
        int v2 = this.a;
        this.a = v2 + 1;
        this.b[v2] = v;
    }

    public final void b(String s) {
        StringBuilder stringBuilder0 = b.u(s, " at path ");
        stringBuilder0.append("$");
        throw new JsonEncodingException(stringBuilder0.toString());
    }

    public abstract void beginArray() throws IOException;

    public abstract void beginObject() throws IOException;

    // 去混淆评级： 中等(50)
    public final JsonDataException c(Object object0, Object object1) {
        return object0 == null ? new JsonDataException("Expected " + object1 + " but was null at path " + "$") : new JsonDataException("Expected " + object1 + " but was " + object0 + ", a " + object0.getClass().getName() + ", at path " + "$");
    }

    public abstract void endArray() throws IOException;

    public abstract void endObject() throws IOException;

    @CheckReturnValue
    public final boolean failOnUnknown() {
        return this.f;
    }

    @CheckReturnValue
    public final String getPath() [...] // 潜在的解密器

    @CheckReturnValue
    public abstract boolean hasNext() throws IOException;

    @CheckReturnValue
    public final boolean isLenient() {
        return this.e;
    }

    public abstract boolean nextBoolean() throws IOException;

    public abstract double nextDouble() throws IOException;

    public abstract int nextInt() throws IOException;

    public abstract long nextLong() throws IOException;

    @CheckReturnValue
    public abstract String nextName() throws IOException;

    @Nullable
    public abstract Object nextNull() throws IOException;

    public abstract BufferedSource nextSource() throws IOException;

    public abstract String nextString() throws IOException;

    @CheckReturnValue
    public static JsonReader of(BufferedSource bufferedSource0) {
        return new v(bufferedSource0);
    }

    @CheckReturnValue
    public abstract Token peek() throws IOException;

    @CheckReturnValue
    public abstract JsonReader peekJson();

    public abstract void promoteNameToValue() throws IOException;

    @Nullable
    public final Object readJsonValue() throws IOException {
        switch(u.a[this.peek().ordinal()]) {
            case 1: {
                ArrayList arrayList0 = new ArrayList();
                this.beginArray();
                while(this.hasNext()) {
                    arrayList0.add(this.readJsonValue());
                }
                this.endArray();
                return arrayList0;
            }
            case 2: {
                g0 g00 = new g0();
                this.beginObject();
                while(this.hasNext()) {
                    String s = this.nextName();
                    Object object0 = this.readJsonValue();
                    Object object1 = g00.put(s, object0);
                    if(object1 != null) {
                        StringBuilder stringBuilder0 = b.v("Map key \'", s, "\' has multiple values at path ");
                        stringBuilder0.append("$");
                        stringBuilder0.append(": ");
                        stringBuilder0.append(object1);
                        stringBuilder0.append(" and ");
                        stringBuilder0.append(object0);
                        throw new JsonDataException(stringBuilder0.toString());
                    }
                    if(false) {
                        break;
                    }
                }
                this.endObject();
                return g00;
            }
            case 3: {
                return this.nextString();
            }
            case 4: {
                return this.nextDouble();
            }
            case 5: {
                return Boolean.valueOf(this.nextBoolean());
            }
            case 6: {
                return this.nextNull();
            }
            default: {
                throw new IllegalStateException("Expected a value but was " + this.peek() + " at path " + "$");
            }
        }
    }

    @CheckReturnValue
    public abstract int selectName(Options arg1) throws IOException;

    @CheckReturnValue
    public abstract int selectString(Options arg1) throws IOException;

    public final void setFailOnUnknown(boolean z) {
        this.f = z;
    }

    public final void setLenient(boolean z) {
        this.e = z;
    }

    public final void setTag(Class class0, Object object0) {
        if(!class0.isAssignableFrom(object0.getClass())) {
            throw new IllegalArgumentException("Tag value must be of type " + class0.getName());
        }
        if(this.g == null) {
            this.g = new LinkedHashMap();
        }
        this.g.put(class0, object0);
    }

    public abstract void skipName() throws IOException;

    public abstract void skipValue() throws IOException;

    @CheckReturnValue
    @Nullable
    public final Object tag(Class class0) {
        return this.g == null ? null : this.g.get(class0);
    }
}

