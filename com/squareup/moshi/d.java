package com.squareup.moshi;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Set;

public final class d extends e {
    public JsonAdapter h;
    public final Type[] i;
    public final Type j;
    public final Set k;
    public final Set l;

    public d(Type type0, Set set0, Object object0, Method method0, int v, boolean z, Type[] arr_type, Type type1, Set set1, Set set2) {
        this.i = arr_type;
        this.j = type1;
        this.k = set1;
        this.l = set2;
        super(type0, set0, object0, method0, v, 1, z);
    }

    @Override  // com.squareup.moshi.e
    public final void a(Moshi moshi0, f f0) {
        super.a(moshi0, f0);
        this.h = !Types.equals(this.i[0], this.j) || !this.k.equals(this.l) ? moshi0.adapter(this.i[0], this.k) : moshi0.nextAdapter(f0, this.i[0], this.k);
    }

    @Override  // com.squareup.moshi.e
    public final Object b(JsonReader jsonReader0) {
        return this.c(this.h.fromJson(jsonReader0));
    }
}

