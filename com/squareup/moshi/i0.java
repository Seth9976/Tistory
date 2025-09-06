package com.squareup.moshi;

import java.lang.reflect.Type;
import java.util.Map.Entry;
import java.util.Map;

public final class i0 extends JsonAdapter {
    public final JsonAdapter a;
    public final JsonAdapter b;
    public static final h0 c;

    static {
        i0.c = new h0();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public i0(Moshi moshi0, Type type0, Type type1) {
        this.a = moshi0.adapter(type0);
        this.b = moshi0.adapter(type1);
    }

    @Override  // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader0) {
        g0 g00 = new g0();
        jsonReader0.beginObject();
        while(jsonReader0.hasNext()) {
            jsonReader0.promoteNameToValue();
            Object object0 = this.a.fromJson(jsonReader0);
            Object object1 = this.b.fromJson(jsonReader0);
            Object object2 = g00.put(object0, object1);
            if(object2 != null) {
                throw new JsonDataException("Map key \'" + object0 + "\' has multiple values at path " + "$" + ": " + object2 + " and " + object1);
            }
            if(false) {
                break;
            }
        }
        jsonReader0.endObject();
        return g00;
    }

    @Override  // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter0, Object object0) {
        jsonWriter0.beginObject();
        for(Object object1: ((Map)object0).entrySet()) {
            if(((Map.Entry)object1).getKey() == null) {
                throw new JsonDataException("Map key is null at $");
            }
            jsonWriter0.promoteValueToName();
            Object object2 = ((Map.Entry)object1).getKey();
            this.a.toJson(jsonWriter0, object2);
            Object object3 = ((Map.Entry)object1).getValue();
            this.b.toJson(jsonWriter0, object3);
        }
        jsonWriter0.endObject();
    }

    @Override
    public final String toString() {
        return "JsonAdapter(" + this.a + "=" + this.b + ")";
    }
}

