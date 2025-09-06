package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.reflect.ReflectionHelper;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonWriter;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import wb.a;

public final class g {
    public final String a;
    public final Field b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final Method g;
    public final boolean h;
    public final TypeAdapter i;
    public final Gson j;
    public final TypeToken k;
    public final boolean l;
    public final boolean m;

    public g(String s, Field field0, boolean z, boolean z1, boolean z2, Method method0, boolean z3, TypeAdapter typeAdapter0, Gson gson0, TypeToken typeToken0, boolean z4, boolean z5) {
        this.f = z2;
        this.g = method0;
        this.h = z3;
        this.i = typeAdapter0;
        this.j = gson0;
        this.k = typeToken0;
        this.l = z4;
        this.m = z5;
        this.a = s;
        this.b = field0;
        this.c = field0.getName();
        this.d = z;
        this.e = z1;
    }

    public final void a(JsonWriter jsonWriter0, Object object0) {
        Object object1;
        if(!this.d) {
            return;
        }
        Field field0 = this.b;
        Method method0 = this.g;
        if(this.f) {
            if(method0 == null) {
                ReflectiveTypeAdapterFactory.a(field0, object0);
            }
            else {
                ReflectiveTypeAdapterFactory.a(method0, object0);
            }
        }
        if(method0 == null) {
            object1 = field0.get(object0);
        }
        else {
            try {
                object1 = method0.invoke(object0, null);
            }
            catch(InvocationTargetException invocationTargetException0) {
                throw new JsonIOException(a.d("Accessor ", ReflectionHelper.getAccessibleObjectDescription(method0, false), " threw exception"), invocationTargetException0.getCause());
            }
        }
        if(object1 == object0) {
            return;
        }
        jsonWriter0.name(this.a);
        TypeAdapter typeAdapter0 = this.i;
        if(!this.h) {
            typeAdapter0 = new TypeAdapterRuntimeTypeWrapper(this.j, typeAdapter0, this.k.getType());
        }
        typeAdapter0.write(jsonWriter0, object1);
    }
}

