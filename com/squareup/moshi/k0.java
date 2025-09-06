package com.squareup.moshi;

import com.squareup.moshi.internal.Util;
import java.lang.reflect.Type;
import java.util.Set;

public final class k0 implements Factory {
    public final Type a;
    public final Class b;
    public final JsonAdapter c;

    public k0(Type type0, Class class0, JsonAdapter jsonAdapter0) {
        this.a = type0;
        this.b = class0;
        this.c = jsonAdapter0;
    }

    // 去混淆评级： 低(20)
    @Override  // com.squareup.moshi.JsonAdapter$Factory
    public final JsonAdapter create(Type type0, Set set0, Moshi moshi0) {
        return !Util.typesMatch(this.a, type0) || set0.size() != 1 || !Util.isAnnotationPresent(set0, this.b) ? null : this.c;
    }
}

