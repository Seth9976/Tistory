package com.squareup.moshi;

import java.lang.reflect.Array;
import java.util.ArrayList;

public final class h extends JsonAdapter {
    public final Class a;
    public final JsonAdapter b;
    public static final g c;

    static {
        h.c = new g();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public h(Class class0, JsonAdapter jsonAdapter0) {
        this.a = class0;
        this.b = jsonAdapter0;
    }

    @Override  // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader0) {
        ArrayList arrayList0 = new ArrayList();
        jsonReader0.beginArray();
        while(jsonReader0.hasNext()) {
            arrayList0.add(this.b.fromJson(jsonReader0));
        }
        jsonReader0.endArray();
        Object object0 = Array.newInstance(this.a, arrayList0.size());
        for(int v = 0; v < arrayList0.size(); ++v) {
            Array.set(object0, v, arrayList0.get(v));
        }
        return object0;
    }

    @Override  // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter0, Object object0) {
        jsonWriter0.beginArray();
        int v = Array.getLength(object0);
        for(int v1 = 0; v1 < v; ++v1) {
            Object object1 = Array.get(object0, v1);
            this.b.toJson(jsonWriter0, object1);
        }
        jsonWriter0.endArray();
    }

    @Override
    public final String toString() {
        return this.b + ".array()";
    }
}

