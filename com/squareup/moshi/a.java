package com.squareup.moshi;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.util.Set;

public final class a extends JsonAdapter {
    public final e a;
    public final JsonAdapter b;
    public final e c;
    public final Set d;
    public final Type e;

    public a(e e0, JsonAdapter jsonAdapter0, Moshi moshi0, e e1, Set set0, Type type0) {
        this.a = e0;
        this.b = jsonAdapter0;
        this.c = e1;
        this.d = set0;
        this.e = type0;
        super();
    }

    @Override  // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader0) {
        e e0 = this.c;
        if(e0 == null) {
            return this.b.fromJson(jsonReader0);
        }
        if(!e0.g && jsonReader0.peek() == Token.NULL) {
            jsonReader0.nextNull();
            return null;
        }
        try {
            return e0.b(jsonReader0);
        }
        catch(InvocationTargetException invocationTargetException0) {
            Throwable throwable0 = invocationTargetException0.getCause();
            if(!(throwable0 instanceof IOException)) {
                throw new JsonDataException(throwable0 + " at " + "$", throwable0);
            }
            throw (IOException)throwable0;
        }
    }

    @Override  // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter0, Object object0) {
        e e0 = this.a;
        if(e0 == null) {
            this.b.toJson(jsonWriter0, object0);
            return;
        }
        if(!e0.g && object0 == null) {
            jsonWriter0.nullValue();
            return;
        }
        try {
            e0.d(jsonWriter0, object0);
            return;
        }
        catch(InvocationTargetException invocationTargetException0) {
            Throwable throwable0 = invocationTargetException0.getCause();
            if(!(throwable0 instanceof IOException)) {
                throw new JsonDataException(throwable0 + " at " + "$", throwable0);
            }
            throw (IOException)throwable0;
        }
    }

    @Override
    public final String toString() {
        return "JsonAdapter" + this.d + "(" + this.e + ")";
    }
}

