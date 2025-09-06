package com.google.gson.internal.bind;

import a5.b;
import androidx.room.a;
import com.google.gson.FieldNamingStrategy;
import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.ReflectionAccessFilter.FilterResult;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.internal..Gson.Types;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.internal.Primitives;
import com.google.gson.internal.ReflectionAccessFilterHelper;
import com.google.gson.internal.reflect.ReflectionHelper;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public final class ReflectiveTypeAdapterFactory implements TypeAdapterFactory {
    public static abstract class Adapter extends TypeAdapter {
        public final LinkedHashMap a;

        public Adapter(LinkedHashMap linkedHashMap0) {
            this.a = linkedHashMap0;
        }

        public abstract Object a();

        public abstract Object b(Object arg1);

        public abstract void c(Object arg1, JsonReader arg2, g arg3);

        @Override  // com.google.gson.TypeAdapter
        public Object read(JsonReader jsonReader0) throws IOException {
            if(jsonReader0.peek() == JsonToken.NULL) {
                jsonReader0.nextNull();
                return null;
            }
            Object object0 = this.a();
            try {
                jsonReader0.beginObject();
                while(true) {
                    if(!jsonReader0.hasNext()) {
                        goto label_18;
                    }
                    String s = jsonReader0.nextName();
                    g g0 = (g)this.a.get(s);
                    if(g0 != null && g0.e) {
                        this.c(object0, jsonReader0, g0);
                    }
                    else {
                        jsonReader0.skipValue();
                    }
                }
            }
            catch(IllegalStateException illegalStateException0) {
            }
            catch(IllegalAccessException illegalAccessException0) {
                throw ReflectionHelper.createExceptionForUnexpectedIllegalAccess(illegalAccessException0);
            }
            throw new JsonSyntaxException(illegalStateException0);
        label_18:
            jsonReader0.endObject();
            return this.b(object0);
        }

        @Override  // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter0, Object object0) throws IOException {
            if(object0 == null) {
                jsonWriter0.nullValue();
                return;
            }
            jsonWriter0.beginObject();
            try {
                for(Object object1: this.a.values()) {
                    ((g)object1).a(jsonWriter0, object0);
                }
            }
            catch(IllegalAccessException illegalAccessException0) {
                throw ReflectionHelper.createExceptionForUnexpectedIllegalAccess(illegalAccessException0);
            }
            jsonWriter0.endObject();
        }
    }

    static final class FieldReflectionAdapter extends Adapter {
        public final ObjectConstructor b;

        public FieldReflectionAdapter(ObjectConstructor objectConstructor0, LinkedHashMap linkedHashMap0) {
            super(linkedHashMap0);
            this.b = objectConstructor0;
        }

        @Override  // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$Adapter
        public final Object a() {
            return this.b.construct();
        }

        @Override  // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$Adapter
        public final Object b(Object object0) {
            return object0;
        }

        @Override  // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$Adapter
        public final void c(Object object0, JsonReader jsonReader0, g g0) {
            Object object1 = g0.i.read(jsonReader0);
            if(object1 != null || !g0.l) {
                Field field0 = g0.b;
                if(g0.f) {
                    ReflectiveTypeAdapterFactory.a(field0, object0);
                    field0.set(object0, object1);
                    return;
                }
                if(g0.m) {
                    throw new JsonIOException(a.j("Cannot set value of \'static final\' ", ReflectionHelper.getAccessibleObjectDescription(field0, false)));
                }
                field0.set(object0, object1);
            }
        }
    }

    static final class RecordAdapter extends Adapter {
        public final Constructor b;
        public final Object[] c;
        public final HashMap d;
        public static final HashMap e;

        static {
            HashMap hashMap0 = new HashMap();
            hashMap0.put(Byte.TYPE, ((byte)0));
            hashMap0.put(Short.TYPE, ((short)0));
            hashMap0.put(Integer.TYPE, 0);
            hashMap0.put(Long.TYPE, 0L);
            hashMap0.put(Float.TYPE, 0.0f);
            hashMap0.put(Double.TYPE, 0.0);
            hashMap0.put(Character.TYPE, Character.valueOf('\u0000'));
            hashMap0.put(Boolean.TYPE, Boolean.FALSE);
            RecordAdapter.e = hashMap0;
        }

        public RecordAdapter(Class class0, LinkedHashMap linkedHashMap0, boolean z) {
            super(linkedHashMap0);
            this.d = new HashMap();
            Constructor constructor0 = ReflectionHelper.getCanonicalRecordConstructor(class0);
            this.b = constructor0;
            if(z) {
                ReflectiveTypeAdapterFactory.a(constructor0, null);
            }
            else {
                ReflectionHelper.makeAccessible(constructor0);
            }
            String[] arr_s = ReflectionHelper.getRecordComponentNames(class0);
            for(int v1 = 0; v1 < arr_s.length; ++v1) {
                this.d.put(arr_s[v1], v1);
            }
            Class[] arr_class = this.b.getParameterTypes();
            this.c = new Object[arr_class.length];
            for(int v = 0; v < arr_class.length; ++v) {
                this.c[v] = RecordAdapter.e.get(arr_class[v]);
            }
        }

        @Override  // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$Adapter
        public final Object a() {
            return (Object[])this.c.clone();
        }

        @Override  // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$Adapter
        public final Object b(Object object0) {
            Object[] arr_object = (Object[])object0;
            Constructor constructor0 = this.b;
            try {
                return constructor0.newInstance(arr_object);
            }
            catch(IllegalAccessException illegalAccessException0) {
                throw ReflectionHelper.createExceptionForUnexpectedIllegalAccess(illegalAccessException0);
            }
            catch(InstantiationException | IllegalArgumentException instantiationException0) {
                throw new RuntimeException("Failed to invoke constructor \'" + ReflectionHelper.constructorToString(constructor0) + "\' with args " + Arrays.toString(arr_object), instantiationException0);
            }
            catch(InvocationTargetException invocationTargetException0) {
                throw new RuntimeException("Failed to invoke constructor \'" + ReflectionHelper.constructorToString(constructor0) + "\' with args " + Arrays.toString(arr_object), invocationTargetException0.getCause());
            }
        }

        @Override  // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$Adapter
        public final void c(Object object0, JsonReader jsonReader0, g g0) {
            String s = g0.c;
            Integer integer0 = (Integer)this.d.get(s);
            if(integer0 == null) {
                throw new IllegalStateException("Could not find the index in the constructor \'" + ReflectionHelper.constructorToString(this.b) + "\' for field with name \'" + s + "\', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
            }
            int v = (int)integer0;
            Object object1 = g0.i.read(jsonReader0);
            if(object1 == null && g0.l) {
                StringBuilder stringBuilder0 = b.v("null is not allowed as value for record component \'", s, "\' of primitive type; at path ");
                stringBuilder0.append(jsonReader0.getPath());
                throw new JsonParseException(stringBuilder0.toString());
            }
            ((Object[])object0)[v] = object1;
        }
    }

    public final ConstructorConstructor a;
    public final FieldNamingStrategy b;
    public final Excluder c;
    public final JsonAdapterAnnotationTypeAdapterFactory d;
    public final List e;

    public ReflectiveTypeAdapterFactory(ConstructorConstructor constructorConstructor0, FieldNamingStrategy fieldNamingStrategy0, Excluder excluder0, JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory0, List list0) {
        this.a = constructorConstructor0;
        this.b = fieldNamingStrategy0;
        this.c = excluder0;
        this.d = jsonAdapterAnnotationTypeAdapterFactory0;
        this.e = list0;
    }

    public static void a(AccessibleObject accessibleObject0, Object object0) {
        if(Modifier.isStatic(((Member)accessibleObject0).getModifiers())) {
            object0 = null;
        }
        if(!ReflectionAccessFilterHelper.canAccess(accessibleObject0, object0)) {
            throw new JsonIOException(a.z(ReflectionHelper.getAccessibleObjectDescription(accessibleObject0, true), " is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type, adjust the access filter or increase the visibility of the element and its declaring type."));
        }
    }

    public final LinkedHashMap b(Gson gson0, TypeToken typeToken0, Class class0, boolean z, boolean z1) {
        Class class3;
        Field[] arr_field1;
        int v3;
        int v2;
        TypeAdapter typeAdapter0;
        List list0;
        Method method1;
        boolean z6;
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        if(class0.isInterface()) {
            return linkedHashMap0;
        }
        TypeToken typeToken1 = typeToken0;
        boolean z2 = z;
        Class class1 = class0;
        while(class1 != Object.class) {
            Field[] arr_field = class1.getDeclaredFields();
            if(class1 != class0 && arr_field.length > 0) {
                FilterResult reflectionAccessFilter$FilterResult0 = ReflectionAccessFilterHelper.getFilterResult(this.e, class1);
                if(reflectionAccessFilter$FilterResult0 == FilterResult.BLOCK_ALL) {
                    throw new JsonIOException("ReflectionAccessFilter does not permit using reflection for " + class1 + " (supertype of " + class0 + "). Register a TypeAdapter for this type or adjust the access filter.");
                }
                z2 = reflectionAccessFilter$FilterResult0 == FilterResult.BLOCK_INACCESSIBLE;
            }
            boolean z3 = z2;
            int v = arr_field.length;
            int v1 = 0;
            while(v1 < v) {
                Field field0 = arr_field[v1];
                Class class2 = field0.getType();
                boolean z4 = !this.c.excludeClass(class2, ((boolean)1)) && !this.c.excludeField(field0, ((boolean)1));
                boolean z5 = !this.c.excludeClass(field0.getType(), false) && !this.c.excludeField(field0, false);
                if(z4 || z5) {
                    Class class4 = SerializedName.class;
                    if(z1) {
                        if(Modifier.isStatic(field0.getModifiers())) {
                            z6 = false;
                            goto label_42;
                        }
                        else {
                            Method method0 = ReflectionHelper.getAccessor(class1, field0);
                            if(!z3) {
                                ReflectionHelper.makeAccessible(method0);
                            }
                            if(method0.getAnnotation(class4) != null && field0.getAnnotation(class4) == null) {
                                throw new JsonIOException(wb.a.d("@SerializedName on ", ReflectionHelper.getAccessibleObjectDescription(method0, false), " is not supported"));
                            }
                            z6 = z5;
                            method1 = method0;
                            goto label_43;
                        }
                        goto label_41;
                    }
                    else {
                    label_41:
                        z6 = z5;
                    }
                label_42:
                    method1 = null;
                label_43:
                    if(!z3 && method1 == null) {
                        ReflectionHelper.makeAccessible(field0);
                    }
                    Type type0 = .Gson.Types.resolve(typeToken1.getType(), class1, field0.getGenericType());
                    SerializedName serializedName0 = (SerializedName)field0.getAnnotation(class4);
                    if(serializedName0 == null) {
                        list0 = Collections.singletonList(this.b.translateName(field0));
                    }
                    else {
                        String s = serializedName0.value();
                        String[] arr_s = serializedName0.alternate();
                        if(arr_s.length == 0) {
                            list0 = Collections.singletonList(s);
                        }
                        else {
                            ArrayList arrayList0 = new ArrayList(arr_s.length + 1);
                            arrayList0.add(s);
                            Collections.addAll(arrayList0, arr_s);
                            list0 = arrayList0;
                        }
                    }
                    int v4 = list0.size();
                    int v5 = false;
                    g g0 = null;
                    while(v5 < v4) {
                        Object object0 = list0.get(v5);
                        boolean z7 = v5 == 0 ? z4 : false;
                        TypeToken typeToken2 = TypeToken.get(type0);
                        boolean z8 = Primitives.isPrimitive(typeToken2.getRawType());
                        int v6 = field0.getModifiers();
                        boolean z9 = Modifier.isStatic(v6) && Modifier.isFinal(v6);
                        JsonAdapter jsonAdapter0 = (JsonAdapter)field0.getAnnotation(JsonAdapter.class);
                        if(jsonAdapter0 == null) {
                            typeAdapter0 = null;
                        }
                        else {
                            this.d.getClass();
                            typeAdapter0 = JsonAdapterAnnotationTypeAdapterFactory.a(this.a, gson0, typeToken2, jsonAdapter0);
                        }
                        boolean z10 = typeAdapter0 != null;
                        if(typeAdapter0 == null) {
                            typeAdapter0 = gson0.getAdapter(typeToken2);
                        }
                        g g1 = g0;
                        g0 = (g)linkedHashMap0.put(((String)object0), new g(((String)object0), field0, z7, z6, z3, method1, z10, typeAdapter0, gson0, typeToken2, z8, z9));
                        if(g1 != null) {
                            g0 = g1;
                        }
                        ++v5;
                        z4 = z7;
                    }
                    v2 = v1;
                    v3 = v;
                    arr_field1 = arr_field;
                    class3 = class1;
                    if(g0 != null) {
                        throw new IllegalArgumentException("Class " + class0.getName() + " declares multiple JSON fields named \'" + g0.a + "\'; conflict is caused by fields " + ReflectionHelper.fieldToString(g0.b) + " and " + ReflectionHelper.fieldToString(field0));
                    }
                }
                else {
                    v2 = v1;
                    v3 = v;
                    arr_field1 = arr_field;
                    class3 = class1;
                }
                v1 = v2 + 1;
                class1 = class3;
                v = v3;
                arr_field = arr_field1;
            }
            typeToken1 = TypeToken.get(.Gson.Types.resolve(typeToken1.getType(), class1, class1.getGenericSuperclass()));
            class1 = typeToken1.getRawType();
        }
        return linkedHashMap0;
    }

    @Override  // com.google.gson.TypeAdapterFactory
    public TypeAdapter create(Gson gson0, TypeToken typeToken0) {
        Class class0 = typeToken0.getRawType();
        if(!Object.class.isAssignableFrom(class0)) {
            return null;
        }
        FilterResult reflectionAccessFilter$FilterResult0 = ReflectionAccessFilterHelper.getFilterResult(this.e, class0);
        if(reflectionAccessFilter$FilterResult0 == FilterResult.BLOCK_ALL) {
            throw new JsonIOException("ReflectionAccessFilter does not permit using reflection for " + class0 + ". Register a TypeAdapter for this type or adjust the access filter.");
        }
        boolean z = reflectionAccessFilter$FilterResult0 == FilterResult.BLOCK_INACCESSIBLE;
        return ReflectionHelper.isRecord(class0) ? new RecordAdapter(class0, this.b(gson0, typeToken0, class0, z, true), z) : new FieldReflectionAdapter(this.a.get(typeToken0), this.b(gson0, typeToken0, class0, z, false));
    }
}

