package com.squareup.moshi;

import java.lang.reflect.Type;

public final class l0 extends JsonAdapter {
    public final Type a;
    public final String b;
    public final Object c;
    public JsonAdapter d;

    public l0(Type type0, String s, Object object0) {
        this.a = type0;
        this.b = s;
        this.c = object0;
    }

    @Override  // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader0) {
        JsonAdapter jsonAdapter0 = this.d;
        if(jsonAdapter0 == null) {
            throw new IllegalStateException("JsonAdapter isn\'t ready");
        }
        return jsonAdapter0.fromJson(jsonReader0);
    }

    @Override  // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter0, Object object0) {
        JsonAdapter jsonAdapter0 = this.d;
        if(jsonAdapter0 == null) {
            throw new IllegalStateException("JsonAdapter isn\'t ready");
        }
        jsonAdapter0.toJson(jsonWriter0, object0);
    }

    @Override
    public final String toString() {
        return this.d == null ? super.toString() : this.d.toString();
    }
}

