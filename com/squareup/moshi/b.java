package com.squareup.moshi;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Set;

public final class b extends e {
    public final int h;

    public b(Type type0, Set set0, Object object0, Method method0, int v, int v1, boolean z, int v2) {
        this.h = v2;
        super(type0, set0, object0, method0, v, v1, z);
    }

    @Override  // com.squareup.moshi.e
    public Object b(JsonReader jsonReader0) {
        return this.h == 1 ? this.c(jsonReader0) : super.b(jsonReader0);
    }

    @Override  // com.squareup.moshi.e
    public void d(JsonWriter jsonWriter0, Object object0) {
        if(this.h != 0) {
            super.d(jsonWriter0, object0);
            return;
        }
        Object[] arr_object = new Object[this.f.length + 2];
        arr_object[0] = jsonWriter0;
        arr_object[1] = object0;
        System.arraycopy(this.f, 0, arr_object, 2, this.f.length);
        try {
            this.d.invoke(this.c, arr_object);
        }
        catch(IllegalAccessException unused_ex) {
            throw new AssertionError();
        }
    }
}

