package com.squareup.moshi;

import com.squareup.moshi.internal.Util;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Set;

public abstract class e {
    public final Type a;
    public final Set b;
    public final Object c;
    public final Method d;
    public final int e;
    public final JsonAdapter[] f;
    public final boolean g;

    public e(Type type0, Set set0, Object object0, Method method0, int v, int v1, boolean z) {
        this.a = Util.canonicalize(type0);
        this.b = set0;
        this.c = object0;
        this.d = method0;
        this.e = v1;
        this.f = new JsonAdapter[v - v1];
        this.g = z;
    }

    public void a(Moshi moshi0, f f0) {
        JsonAdapter[] arr_jsonAdapter = this.f;
        if(arr_jsonAdapter.length > 0) {
            Type[] arr_type = this.d.getGenericParameterTypes();
            Annotation[][] arr2_annotation = this.d.getParameterAnnotations();
            int v = this.e;
            for(int v1 = v; v1 < arr_type.length; ++v1) {
                Type type0 = ((ParameterizedType)arr_type[v1]).getActualTypeArguments()[0];
                Set set0 = Util.jsonAnnotations(arr2_annotation[v1]);
                arr_jsonAdapter[v1 - v] = !Types.equals(this.a, type0) || !this.b.equals(set0) ? moshi0.adapter(type0, set0) : moshi0.nextAdapter(f0, type0, set0);
            }
        }
    }

    public Object b(JsonReader jsonReader0) {
        throw new AssertionError();
    }

    public final Object c(Object object0) {
        Object[] arr_object = new Object[this.f.length + 1];
        arr_object[0] = object0;
        System.arraycopy(this.f, 0, arr_object, 1, this.f.length);
        try {
            return this.d.invoke(this.c, arr_object);
        }
        catch(IllegalAccessException unused_ex) {
            throw new AssertionError();
        }
    }

    public void d(JsonWriter jsonWriter0, Object object0) {
        throw new AssertionError();
    }
}

