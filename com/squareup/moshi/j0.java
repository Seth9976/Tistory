package com.squareup.moshi;

import com.squareup.moshi.internal.Util;
import java.lang.reflect.Type;
import java.util.Set;

public final class j0 implements Factory {
    public final Type a;
    public final JsonAdapter b;

    public j0(Type type0, JsonAdapter jsonAdapter0) {
        this.a = type0;
        this.b = jsonAdapter0;
    }

    // 去混淆评级： 低(20)
    @Override  // com.squareup.moshi.JsonAdapter$Factory
    public final JsonAdapter create(Type type0, Set set0, Moshi moshi0) {
        return !set0.isEmpty() || !Util.typesMatch(this.a, type0) ? null : this.b;
    }
}

