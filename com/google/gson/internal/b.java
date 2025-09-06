package com.google.gson.internal;

import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Objects;

public final class b implements Serializable, ParameterizedType {
    public final Type a;
    public final Type b;
    public final Type[] c;

    public b(Type type0, Type type1, Type[] arr_type) {
        boolean z = true;
        super();
        Objects.requireNonNull(type1);
        if(type1 instanceof Class) {
            if(type0 == null && (!Modifier.isStatic(((Class)type1).getModifiers()) && ((Class)type1).getEnclosingClass() != null)) {
                z = false;
            }
            .Gson.Preconditions.checkArgument(z);
        }
        this.a = type0 == null ? null : .Gson.Types.canonicalize(type0);
        this.b = .Gson.Types.canonicalize(type1);
        Type[] arr_type1 = (Type[])arr_type.clone();
        this.c = arr_type1;
        for(int v = 0; v < arr_type1.length; ++v) {
            Objects.requireNonNull(this.c[v]);
            .Gson.Types.a(this.c[v]);
            this.c[v] = .Gson.Types.canonicalize(this.c[v]);
        }
    }

    // 去混淆评级： 低(20)
    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof ParameterizedType && .Gson.Types.equals(this, ((ParameterizedType)object0));
    }

    @Override
    public final Type[] getActualTypeArguments() {
        return (Type[])this.c.clone();
    }

    @Override
    public final Type getOwnerType() {
        return this.a;
    }

    @Override
    public final Type getRawType() {
        return this.b;
    }

    @Override
    public final int hashCode() {
        int v = Arrays.hashCode(this.c);
        int v1 = this.b.hashCode();
        return this.a == null ? v ^ v1 : v ^ v1 ^ this.a.hashCode();
    }

    @Override
    public final String toString() {
        Type[] arr_type = this.c;
        Type type0 = this.b;
        if(arr_type.length == 0) {
            return .Gson.Types.typeToString(type0);
        }
        StringBuilder stringBuilder0 = new StringBuilder((arr_type.length + 1) * 30);
        stringBuilder0.append(.Gson.Types.typeToString(type0));
        stringBuilder0.append("<");
        stringBuilder0.append(.Gson.Types.typeToString(arr_type[0]));
        for(int v = 1; v < arr_type.length; ++v) {
            stringBuilder0.append(", ");
            stringBuilder0.append(.Gson.Types.typeToString(arr_type[v]));
        }
        stringBuilder0.append(">");
        return stringBuilder0.toString();
    }
}

