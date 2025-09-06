package com.google.gson;

import com.google.gson.internal..Gson.Preconditions;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.DefaultDateTypeAdapter.DateType;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.internal.sql.SqlTypesSupport;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Objects;

public final class GsonBuilder {
    public Excluder a;
    public LongSerializationPolicy b;
    public FieldNamingStrategy c;
    public final HashMap d;
    public final ArrayList e;
    public final ArrayList f;
    public boolean g;
    public String h;
    public int i;
    public int j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public ToNumberStrategy r;
    public ToNumberStrategy s;
    public final LinkedList t;

    public GsonBuilder() {
        this.a = Excluder.DEFAULT;
        this.b = LongSerializationPolicy.DEFAULT;
        this.c = FieldNamingPolicy.IDENTITY;
        this.d = new HashMap();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = false;
        this.h = null;
        this.i = 2;
        this.j = 2;
        this.k = false;
        this.l = false;
        this.m = true;
        this.n = false;
        this.o = false;
        this.p = false;
        this.q = true;
        this.r = Gson.A;
        this.s = Gson.B;
        this.t = new LinkedList();
    }

    public GsonBuilder(Gson gson0) {
        this.a = Excluder.DEFAULT;
        this.b = LongSerializationPolicy.DEFAULT;
        this.c = FieldNamingPolicy.IDENTITY;
        HashMap hashMap0 = new HashMap();
        this.d = hashMap0;
        ArrayList arrayList0 = new ArrayList();
        this.e = arrayList0;
        ArrayList arrayList1 = new ArrayList();
        this.f = arrayList1;
        this.g = false;
        this.h = null;
        this.i = 2;
        this.j = 2;
        this.k = false;
        this.l = false;
        this.m = true;
        this.n = false;
        this.o = false;
        this.p = false;
        this.q = true;
        this.r = Gson.A;
        this.s = Gson.B;
        LinkedList linkedList0 = new LinkedList();
        this.t = linkedList0;
        this.a = gson0.f;
        this.c = gson0.g;
        hashMap0.putAll(gson0.h);
        this.g = gson0.i;
        this.k = gson0.j;
        this.o = gson0.k;
        this.m = gson0.l;
        this.n = gson0.m;
        this.p = gson0.n;
        this.l = gson0.o;
        this.b = gson0.t;
        this.h = gson0.q;
        this.i = gson0.r;
        this.j = gson0.s;
        arrayList0.addAll(gson0.u);
        arrayList1.addAll(gson0.v);
        this.q = gson0.p;
        this.r = gson0.w;
        this.s = gson0.x;
        linkedList0.addAll(gson0.y);
    }

    public GsonBuilder addDeserializationExclusionStrategy(ExclusionStrategy exclusionStrategy0) {
        Objects.requireNonNull(exclusionStrategy0);
        this.a = this.a.withExclusionStrategy(exclusionStrategy0, false, true);
        return this;
    }

    public GsonBuilder addReflectionAccessFilter(ReflectionAccessFilter reflectionAccessFilter0) {
        Objects.requireNonNull(reflectionAccessFilter0);
        this.t.addFirst(reflectionAccessFilter0);
        return this;
    }

    public GsonBuilder addSerializationExclusionStrategy(ExclusionStrategy exclusionStrategy0) {
        Objects.requireNonNull(exclusionStrategy0);
        this.a = this.a.withExclusionStrategy(exclusionStrategy0, true, false);
        return this;
    }

    public Gson create() {
        TypeAdapterFactory typeAdapterFactory2;
        TypeAdapterFactory typeAdapterFactory1;
        ArrayList arrayList0 = this.e;
        ArrayList arrayList1 = this.f;
        ArrayList arrayList2 = new ArrayList(arrayList1.size() + arrayList0.size() + 3);
        arrayList2.addAll(arrayList0);
        Collections.reverse(arrayList2);
        ArrayList arrayList3 = new ArrayList(arrayList1);
        Collections.reverse(arrayList3);
        arrayList2.addAll(arrayList3);
        String s = this.h;
        int v = this.i;
        int v1 = this.j;
        boolean z = SqlTypesSupport.SUPPORTS_SQL_TYPES;
        TypeAdapterFactory typeAdapterFactory0 = null;
        if(s != null && !s.trim().isEmpty()) {
            typeAdapterFactory1 = DateType.DATE.createAdapterFactory(s);
            if(z) {
                typeAdapterFactory0 = SqlTypesSupport.TIMESTAMP_DATE_TYPE.createAdapterFactory(s);
                typeAdapterFactory2 = SqlTypesSupport.DATE_DATE_TYPE.createAdapterFactory(s);
            }
            else {
                typeAdapterFactory2 = null;
            }
            goto label_30;
        }
        else if(v != 2 && v1 != 2) {
            TypeAdapterFactory typeAdapterFactory3 = DateType.DATE.createAdapterFactory(v, v1);
            if(z) {
                typeAdapterFactory0 = SqlTypesSupport.TIMESTAMP_DATE_TYPE.createAdapterFactory(v, v1);
                typeAdapterFactory1 = typeAdapterFactory3;
                typeAdapterFactory2 = SqlTypesSupport.DATE_DATE_TYPE.createAdapterFactory(v, v1);
            }
            else {
                typeAdapterFactory1 = typeAdapterFactory3;
                typeAdapterFactory2 = null;
            }
        label_30:
            arrayList2.add(typeAdapterFactory1);
            if(z) {
                arrayList2.add(typeAdapterFactory0);
                arrayList2.add(typeAdapterFactory2);
            }
        }
        return new Gson(this.a, this.c, new HashMap(this.d), this.g, this.k, this.o, this.m, this.n, this.p, this.l, this.q, this.b, this.h, this.i, this.j, new ArrayList(arrayList0), new ArrayList(arrayList1), arrayList2, this.r, this.s, new ArrayList(this.t));
    }

    public GsonBuilder disableHtmlEscaping() {
        this.m = false;
        return this;
    }

    public GsonBuilder disableInnerClassSerialization() {
        this.a = this.a.disableInnerClassSerialization();
        return this;
    }

    public GsonBuilder disableJdkUnsafe() {
        this.q = false;
        return this;
    }

    public GsonBuilder enableComplexMapKeySerialization() {
        this.k = true;
        return this;
    }

    public GsonBuilder excludeFieldsWithModifiers(int[] arr_v) {
        Objects.requireNonNull(arr_v);
        this.a = this.a.withModifiers(arr_v);
        return this;
    }

    public GsonBuilder excludeFieldsWithoutExposeAnnotation() {
        this.a = this.a.excludeFieldsWithoutExposeAnnotation();
        return this;
    }

    public GsonBuilder generateNonExecutableJson() {
        this.o = true;
        return this;
    }

    public GsonBuilder registerTypeAdapter(Type type0, Object object0) {
        Objects.requireNonNull(type0);
        .Gson.Preconditions.checkArgument(object0 instanceof JsonSerializer || object0 instanceof JsonDeserializer || object0 instanceof InstanceCreator || object0 instanceof TypeAdapter);
        if(object0 instanceof InstanceCreator) {
            this.d.put(type0, ((InstanceCreator)object0));
        }
        ArrayList arrayList0 = this.e;
        if(object0 instanceof JsonSerializer || object0 instanceof JsonDeserializer) {
            arrayList0.add(TreeTypeAdapter.newFactoryWithMatchRawType(TypeToken.get(type0), object0));
        }
        if(object0 instanceof TypeAdapter) {
            arrayList0.add(TypeAdapters.newFactory(TypeToken.get(type0), ((TypeAdapter)object0)));
        }
        return this;
    }

    public GsonBuilder registerTypeAdapterFactory(TypeAdapterFactory typeAdapterFactory0) {
        Objects.requireNonNull(typeAdapterFactory0);
        this.e.add(typeAdapterFactory0);
        return this;
    }

    public GsonBuilder registerTypeHierarchyAdapter(Class class0, Object object0) {
        Objects.requireNonNull(class0);
        .Gson.Preconditions.checkArgument(object0 instanceof JsonSerializer || object0 instanceof JsonDeserializer || object0 instanceof TypeAdapter);
        if(object0 instanceof JsonDeserializer || object0 instanceof JsonSerializer) {
            TypeAdapterFactory typeAdapterFactory0 = TreeTypeAdapter.newTypeHierarchyFactory(class0, object0);
            this.f.add(typeAdapterFactory0);
        }
        if(object0 instanceof TypeAdapter) {
            TypeAdapterFactory typeAdapterFactory1 = TypeAdapters.newTypeHierarchyFactory(class0, ((TypeAdapter)object0));
            this.e.add(typeAdapterFactory1);
        }
        return this;
    }

    public GsonBuilder serializeNulls() {
        this.g = true;
        return this;
    }

    public GsonBuilder serializeSpecialFloatingPointValues() {
        this.l = true;
        return this;
    }

    public GsonBuilder setDateFormat(int v) {
        this.i = v;
        this.h = null;
        return this;
    }

    public GsonBuilder setDateFormat(int v, int v1) {
        this.i = v;
        this.j = v1;
        this.h = null;
        return this;
    }

    public GsonBuilder setDateFormat(String s) {
        this.h = s;
        return this;
    }

    public GsonBuilder setExclusionStrategies(ExclusionStrategy[] arr_exclusionStrategy) {
        Objects.requireNonNull(arr_exclusionStrategy);
        for(int v = 0; v < arr_exclusionStrategy.length; ++v) {
            this.a = this.a.withExclusionStrategy(arr_exclusionStrategy[v], true, true);
        }
        return this;
    }

    public GsonBuilder setFieldNamingPolicy(FieldNamingPolicy fieldNamingPolicy0) {
        return this.setFieldNamingStrategy(fieldNamingPolicy0);
    }

    public GsonBuilder setFieldNamingStrategy(FieldNamingStrategy fieldNamingStrategy0) {
        Objects.requireNonNull(fieldNamingStrategy0);
        this.c = fieldNamingStrategy0;
        return this;
    }

    public GsonBuilder setLenient() {
        this.p = true;
        return this;
    }

    public GsonBuilder setLongSerializationPolicy(LongSerializationPolicy longSerializationPolicy0) {
        Objects.requireNonNull(longSerializationPolicy0);
        this.b = longSerializationPolicy0;
        return this;
    }

    public GsonBuilder setNumberToNumberStrategy(ToNumberStrategy toNumberStrategy0) {
        Objects.requireNonNull(toNumberStrategy0);
        this.s = toNumberStrategy0;
        return this;
    }

    public GsonBuilder setObjectToNumberStrategy(ToNumberStrategy toNumberStrategy0) {
        Objects.requireNonNull(toNumberStrategy0);
        this.r = toNumberStrategy0;
        return this;
    }

    public GsonBuilder setPrettyPrinting() {
        this.n = true;
        return this;
    }

    public GsonBuilder setVersion(double f) {
        if(Double.isNaN(f) || f < 0.0) {
            throw new IllegalArgumentException("Invalid version: " + f);
        }
        this.a = this.a.withVersion(f);
        return this;
    }
}

