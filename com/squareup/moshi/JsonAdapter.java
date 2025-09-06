package com.squareup.moshi;

import com.squareup.moshi.internal.NonNullJsonAdapter;
import com.squareup.moshi.internal.NullSafeJsonAdapter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Set;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;

public abstract class JsonAdapter {
    public interface Factory {
        @CheckReturnValue
        @Nullable
        JsonAdapter create(Type arg1, Set arg2, Moshi arg3);
    }

    public boolean a() {
        return this instanceof s;
    }

    @CheckReturnValue
    public final JsonAdapter failOnUnknown() {
        return new r(this, 1);
    }

    @CheckReturnValue
    @Nullable
    public abstract Object fromJson(JsonReader arg1) throws IOException;

    @CheckReturnValue
    @Nullable
    public final Object fromJson(String s) throws IOException {
        JsonReader jsonReader0 = JsonReader.of(new Buffer().writeUtf8(s));
        Object object0 = this.fromJson(jsonReader0);
        if(!this.a() && jsonReader0.peek() != Token.END_DOCUMENT) {
            throw new JsonDataException("JSON document was not fully consumed.");
        }
        return object0;
    }

    @CheckReturnValue
    @Nullable
    public final Object fromJson(BufferedSource bufferedSource0) throws IOException {
        return this.fromJson(JsonReader.of(bufferedSource0));
    }

    @CheckReturnValue
    @Nullable
    public final Object fromJsonValue(@Nullable Object object0) {
        z z0 = new z();  // 初始化器: Lcom/squareup/moshi/JsonReader;-><init>()V
        int v = z0.a;
        z0.b[v] = 7;
        Object[] arr_object = new Object[0x20];
        z0.h = arr_object;
        z0.a = v + 1;
        arr_object[v] = object0;
        try {
            return this.fromJson(z0);
        }
        catch(IOException iOException0) {
            throw new AssertionError(iOException0);
        }
    }

    @CheckReturnValue
    public JsonAdapter indent(String s) {
        if(s == null) {
            throw new NullPointerException("indent == null");
        }
        return new t(this, s);
    }

    @CheckReturnValue
    public final JsonAdapter lenient() {
        return new s(this);
    }

    @CheckReturnValue
    public final JsonAdapter nonNull() {
        return this instanceof NonNullJsonAdapter ? this : new NonNullJsonAdapter(this);
    }

    @CheckReturnValue
    public final JsonAdapter nullSafe() {
        return this instanceof NullSafeJsonAdapter ? this : new NullSafeJsonAdapter(this);
    }

    @CheckReturnValue
    public final JsonAdapter serializeNulls() {
        return new r(this, 0);
    }

    @CheckReturnValue
    public final String toJson(@Nullable Object object0) {
        Buffer buffer0 = new Buffer();
        try {
            this.toJson(buffer0, object0);
            return "";
        }
        catch(IOException iOException0) {
            throw new AssertionError(iOException0);
        }
    }

    public abstract void toJson(JsonWriter arg1, @Nullable Object arg2) throws IOException;

    public final void toJson(BufferedSink bufferedSink0, @Nullable Object object0) throws IOException {
        this.toJson(JsonWriter.of(bufferedSink0), object0);
    }

    @CheckReturnValue
    @Nullable
    public final Object toJsonValue(@Nullable Object object0) {
        c0 c00 = new c0();  // 初始化器: Lcom/squareup/moshi/JsonWriter;-><init>()V
        c00.k = new Object[0x20];
        c00.c(6);
        try {
            this.toJson(c00, object0);
            if(c00.a > 1 || c00.a == 1 && c00.b[0] != 7) {
                throw new IllegalStateException("Incomplete document");
            }
            return c00.k[0];
        }
        catch(IOException iOException0) {
            throw new AssertionError(iOException0);
        }
    }
}

