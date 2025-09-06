package com.google.gson.internal;

import com.google.gson.JsonIOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumMap;
import java.util.EnumSet;
import retrofit2.Call;
import retrofit2.CallAdapter;
import retrofit2.e;

public final class f implements ObjectConstructor, CallAdapter {
    public final int a;
    public final Type b;

    public f(int v, Type type0) {
        this.a = v;
        this.b = type0;
        super();
    }

    @Override  // retrofit2.CallAdapter
    public Object adapt(Call call0) {
        if(this.a != 2) {
            retrofit2.f f0 = new retrofit2.f(call0);
            call0.enqueue(new e(f0, 1));
            return f0;
        }
        retrofit2.f f1 = new retrofit2.f(call0);
        call0.enqueue(new e(f1, 0));
        return f1;
    }

    @Override  // com.google.gson.internal.ObjectConstructor
    public Object construct() {
        if(this.a != 0) {
            Type type0 = this.b;
            if(!(type0 instanceof ParameterizedType)) {
                throw new JsonIOException("Invalid EnumMap type: " + type0.toString());
            }
            Type type1 = ((ParameterizedType)type0).getActualTypeArguments()[0];
            if(!(type1 instanceof Class)) {
                throw new JsonIOException("Invalid EnumMap type: " + type0.toString());
            }
            return new EnumMap(((Class)type1));
        }
        Type type2 = this.b;
        if(!(type2 instanceof ParameterizedType)) {
            throw new JsonIOException("Invalid EnumSet type: " + type2.toString());
        }
        Type type3 = ((ParameterizedType)type2).getActualTypeArguments()[0];
        if(!(type3 instanceof Class)) {
            throw new JsonIOException("Invalid EnumSet type: " + type2.toString());
        }
        return EnumSet.noneOf(((Class)type3));
    }

    @Override  // retrofit2.CallAdapter
    public Type responseType() {
        return this.b;
    }
}

