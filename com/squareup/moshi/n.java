package com.squareup.moshi;

import com.squareup.moshi.internal.Util;
import g.b;
import java.lang.reflect.InvocationTargetException;
import java.util.TreeMap;

public final class n extends JsonAdapter {
    public final b a;
    public final m[] b;
    public final Options c;
    public static final l d;

    static {
        n.d = new l();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public n(b b0, TreeMap treeMap0) {
        this.a = b0;
        this.b = (m[])treeMap0.values().toArray(new m[treeMap0.size()]);
        this.c = Options.of(((String[])treeMap0.keySet().toArray(new String[treeMap0.size()])));
    }

    @Override  // com.squareup.moshi.JsonAdapter
    public final Object fromJson(JsonReader jsonReader0) {
        Object object0;
        try {
            object0 = this.a.t();
        }
        catch(InstantiationException instantiationException0) {
            throw new RuntimeException(instantiationException0);
        }
        catch(InvocationTargetException invocationTargetException0) {
            throw Util.rethrowCause(invocationTargetException0);
        }
        catch(IllegalAccessException unused_ex) {
            throw new AssertionError();
        }
        try {
            jsonReader0.beginObject();
            while(jsonReader0.hasNext()) {
                int v = jsonReader0.selectName(this.c);
                if(v == -1) {
                    jsonReader0.skipName();
                    jsonReader0.skipValue();
                }
                else {
                    m m0 = this.b[v];
                    Object object1 = m0.c.fromJson(jsonReader0);
                    m0.b.set(object0, object1);
                }
            }
            jsonReader0.endObject();
            return object0;
        }
        catch(IllegalAccessException unused_ex) {
            throw new AssertionError();
        }
    }

    @Override  // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter0, Object object0) {
        try {
            jsonWriter0.beginObject();
            m[] arr_m = this.b;
            for(int v = 0; v < arr_m.length; ++v) {
                m m0 = arr_m[v];
                jsonWriter0.name(m0.a);
                Object object1 = m0.b.get(object0);
                m0.c.toJson(jsonWriter0, object1);
            }
            jsonWriter0.endObject();
        }
        catch(IllegalAccessException unused_ex) {
            throw new AssertionError();
        }
    }

    @Override
    public final String toString() {
        return "JsonAdapter(" + this.a + ")";
    }
}

