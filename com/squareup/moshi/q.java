package com.squareup.moshi;

import java.util.Collection;

public abstract class q extends JsonAdapter {
    public final JsonAdapter a;
    public static final o b;

    static {
        q.b = new o();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public q(JsonAdapter jsonAdapter0) {
        this.a = jsonAdapter0;
    }

    public abstract Collection b();

    @Override  // com.squareup.moshi.JsonAdapter
    public Object fromJson(JsonReader jsonReader0) {
        Collection collection0 = this.b();
        jsonReader0.beginArray();
        while(jsonReader0.hasNext()) {
            collection0.add(this.a.fromJson(jsonReader0));
        }
        jsonReader0.endArray();
        return collection0;
    }

    @Override  // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter jsonWriter0, Object object0) {
        jsonWriter0.beginArray();
        for(Object object1: ((Collection)object0)) {
            this.a.toJson(jsonWriter0, object1);
        }
        jsonWriter0.endArray();
    }

    @Override
    public final String toString() {
        return this.a + ".collection()";
    }
}

