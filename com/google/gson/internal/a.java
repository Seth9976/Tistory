package com.google.gson.internal;

import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.Objects;

public final class a implements Serializable, GenericArrayType {
    public final Type a;

    public a(Type type0) {
        Objects.requireNonNull(type0);
        this.a = .Gson.Types.canonicalize(type0);
    }

    // 去混淆评级： 低(20)
    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof GenericArrayType && .Gson.Types.equals(this, ((GenericArrayType)object0));
    }

    @Override
    public final Type getGenericComponentType() {
        return this.a;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return .Gson.Types.typeToString(this.a) + "[]";
    }
}

