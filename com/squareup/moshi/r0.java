package com.squareup.moshi;

import com.squareup.moshi.internal.Util;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public final class r0 extends JsonAdapter {
    public final Moshi a;
    public final JsonAdapter b;
    public final JsonAdapter c;
    public final JsonAdapter d;
    public final JsonAdapter e;
    public final JsonAdapter f;

    public r0(Moshi moshi0) {
        this.a = moshi0;
        this.b = moshi0.adapter(List.class);
        this.c = moshi0.adapter(Map.class);
        this.d = moshi0.adapter(String.class);
        this.e = moshi0.adapter(Double.class);
        this.f = moshi0.adapter(Boolean.class);
    }

    @Override  // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader0) {
        switch(jsonReader0.peek()) {
            case 1: {
                return this.b.fromJson(jsonReader0);
            }
            case 2: {
                return this.c.fromJson(jsonReader0);
            }
            case 3: {
                return this.d.fromJson(jsonReader0);
            }
            case 4: {
                return this.e.fromJson(jsonReader0);
            }
            case 5: {
                return this.f.fromJson(jsonReader0);
            }
            case 6: {
                return jsonReader0.nextNull();
            }
            default: {
                throw new IllegalStateException("Expected a value but was " + jsonReader0.peek() + " at path " + "$");
            }
        }
    }

    @Override  // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter0, Object object0) {
        Class class0 = object0.getClass();
        if(class0 == Object.class) {
            jsonWriter0.beginObject();
            jsonWriter0.endObject();
            return;
        }
        Class class1 = Map.class;
        if(class1.isAssignableFrom(class0)) {
            class0 = class1;
        }
        else {
            class1 = Collection.class;
            if(class1.isAssignableFrom(class0)) {
                class0 = class1;
            }
        }
        this.a.adapter(class0, Util.NO_ANNOTATIONS).toJson(jsonWriter0, object0);
    }

    @Override
    public final String toString() {
        return "JsonAdapter(Object)";
    }
}

