package com.google.gson;

import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.internal.Primitives;
import com.google.gson.internal.Streams;
import com.google.gson.internal.bind.ArrayTypeAdapter;
import com.google.gson.internal.bind.CollectionTypeAdapterFactory;
import com.google.gson.internal.bind.DateTypeAdapter;
import com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import com.google.gson.internal.bind.JsonTreeReader;
import com.google.gson.internal.bind.JsonTreeWriter;
import com.google.gson.internal.bind.MapTypeAdapterFactory;
import com.google.gson.internal.bind.NumberTypeAdapter;
import com.google.gson.internal.bind.ObjectTypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.internal.bind.SerializationDelegatingTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.internal.sql.SqlTypesSupport;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

public final class Gson {
    static class FutureTypeAdapter extends SerializationDelegatingTypeAdapter {
        public TypeAdapter a;

        public FutureTypeAdapter() {
            this.a = null;
        }

        @Override  // com.google.gson.internal.bind.SerializationDelegatingTypeAdapter
        public final TypeAdapter getSerializationDelegate() {
            TypeAdapter typeAdapter0 = this.a;
            if(typeAdapter0 == null) {
                throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
            }
            return typeAdapter0;
        }

        @Override  // com.google.gson.TypeAdapter
        public final Object read(JsonReader jsonReader0) {
            TypeAdapter typeAdapter0 = this.a;
            if(typeAdapter0 == null) {
                throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
            }
            return typeAdapter0.read(jsonReader0);
        }

        @Override  // com.google.gson.TypeAdapter
        public final void write(JsonWriter jsonWriter0, Object object0) {
            TypeAdapter typeAdapter0 = this.a;
            if(typeAdapter0 == null) {
                throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
            }
            typeAdapter0.write(jsonWriter0, object0);
        }
    }

    public static final ToNumberPolicy A;
    public static final ToNumberPolicy B;
    public final ThreadLocal a;
    public final ConcurrentHashMap b;
    public final ConstructorConstructor c;
    public final JsonAdapterAnnotationTypeAdapterFactory d;
    public final List e;
    public final Excluder f;
    public final FieldNamingStrategy g;
    public final Map h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final String q;
    public final int r;
    public final int s;
    public final LongSerializationPolicy t;
    public final List u;
    public final List v;
    public final ToNumberStrategy w;
    public final ToNumberStrategy x;
    public final List y;
    public static final FieldNamingPolicy z;

    static {
        Gson.z = FieldNamingPolicy.IDENTITY;
        Gson.A = ToNumberPolicy.DOUBLE;
        Gson.B = ToNumberPolicy.LAZILY_PARSED_NUMBER;
    }

    public Gson() {
        Map map0 = Collections.emptyMap();
        List list0 = Collections.emptyList();
        List list1 = Collections.emptyList();
        List list2 = Collections.emptyList();
        List list3 = Collections.emptyList();
        this(Excluder.DEFAULT, Gson.z, map0, false, false, false, true, false, false, false, true, LongSerializationPolicy.DEFAULT, null, 2, 2, list0, list1, list2, Gson.A, Gson.B, list3);
    }

    public Gson(Excluder excluder0, FieldNamingStrategy fieldNamingStrategy0, Map map0, boolean z, boolean z1, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, LongSerializationPolicy longSerializationPolicy0, String s, int v, int v1, List list0, List list1, List list2, ToNumberStrategy toNumberStrategy0, ToNumberStrategy toNumberStrategy1, List list3) {
        this.a = new ThreadLocal();
        this.b = new ConcurrentHashMap();
        this.f = excluder0;
        this.g = fieldNamingStrategy0;
        this.h = map0;
        ConstructorConstructor constructorConstructor0 = new ConstructorConstructor(map0, z7, list3);
        this.c = constructorConstructor0;
        this.i = z;
        this.j = z1;
        this.k = z2;
        this.l = z3;
        this.m = z4;
        this.n = z5;
        this.o = z6;
        this.p = z7;
        this.t = longSerializationPolicy0;
        this.q = s;
        this.r = v;
        this.s = v1;
        this.u = list0;
        this.v = list1;
        this.w = toNumberStrategy0;
        this.x = toNumberStrategy1;
        this.y = list3;
        ArrayList arrayList0 = new ArrayList();
        arrayList0.add(TypeAdapters.JSON_ELEMENT_FACTORY);
        arrayList0.add(ObjectTypeAdapter.getFactory(toNumberStrategy0));
        arrayList0.add(excluder0);
        arrayList0.addAll(list2);
        arrayList0.add(TypeAdapters.STRING_FACTORY);
        arrayList0.add(TypeAdapters.INTEGER_FACTORY);
        arrayList0.add(TypeAdapters.BOOLEAN_FACTORY);
        arrayList0.add(TypeAdapters.BYTE_FACTORY);
        arrayList0.add(TypeAdapters.SHORT_FACTORY);
        TypeAdapter typeAdapter0 = longSerializationPolicy0 == LongSerializationPolicy.DEFAULT ? TypeAdapters.LONG : new Gson.3();
        arrayList0.add(TypeAdapters.newFactory(Long.TYPE, Long.class, typeAdapter0));
        Class class0 = Double.TYPE;
        TypeAdapter typeAdapter1 = z6 ? TypeAdapters.DOUBLE : new Gson.1();  // 初始化器: Lcom/google/gson/TypeAdapter;-><init>()V
        arrayList0.add(TypeAdapters.newFactory(class0, Double.class, typeAdapter1));
        Class class1 = Float.TYPE;
        TypeAdapter typeAdapter2 = z6 ? TypeAdapters.FLOAT : new Gson.2();  // 初始化器: Lcom/google/gson/TypeAdapter;-><init>()V
        arrayList0.add(TypeAdapters.newFactory(class1, Float.class, typeAdapter2));
        arrayList0.add(NumberTypeAdapter.getFactory(toNumberStrategy1));
        arrayList0.add(TypeAdapters.ATOMIC_INTEGER_FACTORY);
        arrayList0.add(TypeAdapters.ATOMIC_BOOLEAN_FACTORY);
        TypeAdapter typeAdapter3 = new Gson.4(typeAdapter0).nullSafe();
        arrayList0.add(TypeAdapters.newFactory(AtomicLong.class, typeAdapter3));
        TypeAdapter typeAdapter4 = new Gson.5(typeAdapter0).nullSafe();
        arrayList0.add(TypeAdapters.newFactory(AtomicLongArray.class, typeAdapter4));
        arrayList0.add(TypeAdapters.ATOMIC_INTEGER_ARRAY_FACTORY);
        arrayList0.add(TypeAdapters.CHARACTER_FACTORY);
        arrayList0.add(TypeAdapters.STRING_BUILDER_FACTORY);
        arrayList0.add(TypeAdapters.STRING_BUFFER_FACTORY);
        arrayList0.add(TypeAdapters.newFactory(BigDecimal.class, TypeAdapters.BIG_DECIMAL));
        arrayList0.add(TypeAdapters.newFactory(BigInteger.class, TypeAdapters.BIG_INTEGER));
        arrayList0.add(TypeAdapters.newFactory(LazilyParsedNumber.class, TypeAdapters.LAZILY_PARSED_NUMBER));
        arrayList0.add(TypeAdapters.URL_FACTORY);
        arrayList0.add(TypeAdapters.URI_FACTORY);
        arrayList0.add(TypeAdapters.UUID_FACTORY);
        arrayList0.add(TypeAdapters.CURRENCY_FACTORY);
        arrayList0.add(TypeAdapters.LOCALE_FACTORY);
        arrayList0.add(TypeAdapters.INET_ADDRESS_FACTORY);
        arrayList0.add(TypeAdapters.BIT_SET_FACTORY);
        arrayList0.add(DateTypeAdapter.FACTORY);
        arrayList0.add(TypeAdapters.CALENDAR_FACTORY);
        if(SqlTypesSupport.SUPPORTS_SQL_TYPES) {
            arrayList0.add(SqlTypesSupport.TIME_FACTORY);
            arrayList0.add(SqlTypesSupport.DATE_FACTORY);
            arrayList0.add(SqlTypesSupport.TIMESTAMP_FACTORY);
        }
        arrayList0.add(ArrayTypeAdapter.FACTORY);
        arrayList0.add(TypeAdapters.CLASS_FACTORY);
        arrayList0.add(new CollectionTypeAdapterFactory(constructorConstructor0));
        arrayList0.add(new MapTypeAdapterFactory(constructorConstructor0, z1));
        JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory0 = new JsonAdapterAnnotationTypeAdapterFactory(constructorConstructor0);
        this.d = jsonAdapterAnnotationTypeAdapterFactory0;
        arrayList0.add(jsonAdapterAnnotationTypeAdapterFactory0);
        arrayList0.add(TypeAdapters.ENUM_FACTORY);
        arrayList0.add(new ReflectiveTypeAdapterFactory(constructorConstructor0, fieldNamingStrategy0, excluder0, jsonAdapterAnnotationTypeAdapterFactory0, list3));
        this.e = Collections.unmodifiableList(arrayList0);
    }

    public static void a(double f) {
        if(Double.isNaN(f) || Double.isInfinite(f)) {
            throw new IllegalArgumentException(f + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    @Deprecated
    public Excluder excluder() {
        return this.f;
    }

    public FieldNamingStrategy fieldNamingStrategy() {
        return this.g;
    }

    public Object fromJson(JsonElement jsonElement0, TypeToken typeToken0) throws JsonSyntaxException {
        return jsonElement0 == null ? null : this.fromJson(new JsonTreeReader(jsonElement0), typeToken0);
    }

    public Object fromJson(JsonElement jsonElement0, Class class0) throws JsonSyntaxException {
        return Primitives.wrap(class0).cast(this.fromJson(jsonElement0, TypeToken.get(class0)));
    }

    public Object fromJson(JsonElement jsonElement0, Type type0) throws JsonSyntaxException {
        return this.fromJson(jsonElement0, TypeToken.get(type0));
    }

    public Object fromJson(JsonReader jsonReader0, TypeToken typeToken0) throws JsonIOException, JsonSyntaxException {
        boolean z = jsonReader0.isLenient();
        boolean z1 = true;
        jsonReader0.setLenient(true);
        try {
            jsonReader0.peek();
            z1 = false;
            return this.getAdapter(typeToken0).read(jsonReader0);
        }
        catch(EOFException eOFException0) {
            if(!z1) {
                throw new JsonSyntaxException(eOFException0);
            }
            return null;
        }
        catch(IllegalStateException illegalStateException0) {
            throw new JsonSyntaxException(illegalStateException0);
        }
        catch(IOException iOException0) {
            throw new JsonSyntaxException(iOException0);
        }
        catch(AssertionError assertionError0) {
            throw new AssertionError("AssertionError (GSON 2.10.1): " + assertionError0.getMessage(), assertionError0);
        }
        finally {
            jsonReader0.setLenient(z);
        }
    }

    public Object fromJson(JsonReader jsonReader0, Type type0) throws JsonIOException, JsonSyntaxException {
        return this.fromJson(jsonReader0, TypeToken.get(type0));
    }

    public Object fromJson(Reader reader0, TypeToken typeToken0) throws JsonIOException, JsonSyntaxException {
        JsonReader jsonReader0 = this.newJsonReader(reader0);
        Object object0 = this.fromJson(jsonReader0, typeToken0);
        if(object0 == null) {
            return object0;
        }
        else {
            try {
                if(jsonReader0.peek() != JsonToken.END_DOCUMENT) {
                    throw new JsonSyntaxException("JSON document was not fully consumed.");
                }
                return object0;
            }
            catch(MalformedJsonException malformedJsonException0) {
            }
            catch(IOException iOException0) {
                throw new JsonIOException(iOException0);
            }
        }
        throw new JsonSyntaxException(malformedJsonException0);
    }

    public Object fromJson(Reader reader0, Class class0) throws JsonSyntaxException, JsonIOException {
        return Primitives.wrap(class0).cast(this.fromJson(reader0, TypeToken.get(class0)));
    }

    public Object fromJson(Reader reader0, Type type0) throws JsonIOException, JsonSyntaxException {
        return this.fromJson(reader0, TypeToken.get(type0));
    }

    public Object fromJson(String s, TypeToken typeToken0) throws JsonSyntaxException {
        return s == null ? null : this.fromJson(new StringReader(s), typeToken0);
    }

    public Object fromJson(String s, Class class0) throws JsonSyntaxException {
        return Primitives.wrap(class0).cast(this.fromJson(s, TypeToken.get(class0)));
    }

    public Object fromJson(String s, Type type0) throws JsonSyntaxException {
        return this.fromJson(s, TypeToken.get(type0));
    }

    public TypeAdapter getAdapter(TypeToken typeToken0) {
        TypeAdapter typeAdapter2;
        boolean z;
        Objects.requireNonNull(typeToken0, "type must not be null");
        ConcurrentHashMap concurrentHashMap0 = this.b;
        TypeAdapter typeAdapter0 = (TypeAdapter)concurrentHashMap0.get(typeToken0);
        if(typeAdapter0 != null) {
            return typeAdapter0;
        }
        ThreadLocal threadLocal0 = this.a;
        Map map0 = (Map)threadLocal0.get();
        if(map0 == null) {
            map0 = new HashMap();
            threadLocal0.set(map0);
            z = true;
        }
        else {
            TypeAdapter typeAdapter1 = (TypeAdapter)map0.get(typeToken0);
            if(typeAdapter1 != null) {
                return typeAdapter1;
            }
            z = false;
        }
        try {
            FutureTypeAdapter gson$FutureTypeAdapter0 = new FutureTypeAdapter();
            map0.put(typeToken0, gson$FutureTypeAdapter0);
            typeAdapter2 = null;
            for(Object object0: this.e) {
                typeAdapter2 = ((TypeAdapterFactory)object0).create(this, typeToken0);
                if(typeAdapter2 != null) {
                    if(gson$FutureTypeAdapter0.a != null) {
                        throw new AssertionError("Delegate is already set");
                    }
                    gson$FutureTypeAdapter0.a = typeAdapter2;
                    map0.put(typeToken0, typeAdapter2);
                    break;
                }
                if(false) {
                    break;
                }
            }
        }
        finally {
            if(z) {
                threadLocal0.remove();
            }
        }
        if(typeAdapter2 == null) {
            throw new IllegalArgumentException("GSON (2.10.1) cannot handle " + typeToken0);
        }
        if(z) {
            concurrentHashMap0.putAll(map0);
        }
        return typeAdapter2;
    }

    public TypeAdapter getAdapter(Class class0) {
        return this.getAdapter(TypeToken.get(class0));
    }

    public TypeAdapter getDelegateAdapter(TypeAdapterFactory typeAdapterFactory0, TypeToken typeToken0) {
        List list0 = this.e;
        if(!list0.contains(typeAdapterFactory0)) {
            typeAdapterFactory0 = this.d;
        }
        boolean z = false;
        for(Object object0: list0) {
            TypeAdapterFactory typeAdapterFactory1 = (TypeAdapterFactory)object0;
            if(z) {
                TypeAdapter typeAdapter0 = typeAdapterFactory1.create(this, typeToken0);
                if(typeAdapter0 != null) {
                    return typeAdapter0;
                }
                if(false) {
                    break;
                }
            }
            else {
                if(typeAdapterFactory1 != typeAdapterFactory0) {
                    continue;
                }
                z = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + typeToken0);
    }

    public boolean htmlSafe() {
        return this.l;
    }

    public GsonBuilder newBuilder() {
        return new GsonBuilder(this);
    }

    public JsonReader newJsonReader(Reader reader0) {
        JsonReader jsonReader0 = new JsonReader(reader0);
        jsonReader0.setLenient(this.n);
        return jsonReader0;
    }

    public JsonWriter newJsonWriter(Writer writer0) throws IOException {
        if(this.k) {
            writer0.write(")]}\'\n");
        }
        JsonWriter jsonWriter0 = new JsonWriter(writer0);
        if(this.m) {
            jsonWriter0.setIndent("  ");
        }
        jsonWriter0.setHtmlSafe(this.l);
        jsonWriter0.setLenient(this.n);
        jsonWriter0.setSerializeNulls(this.i);
        return jsonWriter0;
    }

    public boolean serializeNulls() {
        return this.i;
    }

    public String toJson(JsonElement jsonElement0) [...] // 潜在的解密器

    // 去混淆评级： 低(30)
    public String toJson(Object object0) {
        return object0 == null ? "null" : this.toJson(object0, object0.getClass());
    }

    public String toJson(Object object0, Type type0) {
        StringWriter stringWriter0 = new StringWriter();
        this.toJson(object0, type0, stringWriter0);
        return stringWriter0.toString();
    }

    public void toJson(JsonElement jsonElement0, JsonWriter jsonWriter0) throws JsonIOException {
        boolean z = jsonWriter0.isLenient();
        jsonWriter0.setLenient(true);
        boolean z1 = jsonWriter0.isHtmlSafe();
        jsonWriter0.setHtmlSafe(this.l);
        boolean z2 = jsonWriter0.getSerializeNulls();
        jsonWriter0.setSerializeNulls(this.i);
        try {
            Streams.write(jsonElement0, jsonWriter0);
        }
        catch(IOException iOException0) {
            throw new JsonIOException(iOException0);
        }
        catch(AssertionError assertionError0) {
            throw new AssertionError("AssertionError (GSON 2.10.1): " + assertionError0.getMessage(), assertionError0);
        }
        finally {
            jsonWriter0.setLenient(z);
            jsonWriter0.setHtmlSafe(z1);
            jsonWriter0.setSerializeNulls(z2);
        }
    }

    public void toJson(JsonElement jsonElement0, Appendable appendable0) throws JsonIOException {
        try {
            this.toJson(jsonElement0, this.newJsonWriter(Streams.writerForAppendable(appendable0)));
        }
        catch(IOException iOException0) {
            throw new JsonIOException(iOException0);
        }
    }

    public void toJson(Object object0, Appendable appendable0) throws JsonIOException {
        if(object0 != null) {
            this.toJson(object0, object0.getClass(), appendable0);
            return;
        }
        this.toJson(JsonNull.INSTANCE, appendable0);
    }

    public void toJson(Object object0, Type type0, JsonWriter jsonWriter0) throws JsonIOException {
        TypeAdapter typeAdapter0 = this.getAdapter(TypeToken.get(type0));
        boolean z = jsonWriter0.isLenient();
        jsonWriter0.setLenient(true);
        boolean z1 = jsonWriter0.isHtmlSafe();
        jsonWriter0.setHtmlSafe(this.l);
        boolean z2 = jsonWriter0.getSerializeNulls();
        jsonWriter0.setSerializeNulls(this.i);
        try {
            typeAdapter0.write(jsonWriter0, object0);
        }
        catch(IOException iOException0) {
            throw new JsonIOException(iOException0);
        }
        catch(AssertionError assertionError0) {
            throw new AssertionError("AssertionError (GSON 2.10.1): " + assertionError0.getMessage(), assertionError0);
        }
        finally {
            jsonWriter0.setLenient(z);
            jsonWriter0.setHtmlSafe(z1);
            jsonWriter0.setSerializeNulls(z2);
        }
    }

    public void toJson(Object object0, Type type0, Appendable appendable0) throws JsonIOException {
        try {
            this.toJson(object0, type0, this.newJsonWriter(Streams.writerForAppendable(appendable0)));
        }
        catch(IOException iOException0) {
            throw new JsonIOException(iOException0);
        }
    }

    public JsonElement toJsonTree(Object object0) {
        return object0 == null ? JsonNull.INSTANCE : this.toJsonTree(object0, object0.getClass());
    }

    public JsonElement toJsonTree(Object object0, Type type0) {
        JsonTreeWriter jsonTreeWriter0 = new JsonTreeWriter();
        this.toJson(object0, type0, jsonTreeWriter0);
        return jsonTreeWriter0.get();
    }

    @Override
    public String toString() {
        return "{serializeNulls:" + this.i + ",factories:" + this.e + ",instanceCreators:" + this.c + "}";
    }
}

