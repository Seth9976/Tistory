package com.squareup.moshi;

import com.squareup.moshi.internal.Util;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Set;

public final class f implements Factory {
    public final ArrayList a;
    public final ArrayList b;

    public f(ArrayList arrayList0, ArrayList arrayList1) {
        this.a = arrayList0;
        this.b = arrayList1;
    }

    public static e a(ArrayList arrayList0, Type type0, Set set0) {
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            e e0 = (e)arrayList0.get(v1);
            if(Types.equals(e0.a, type0) && e0.b.equals(set0)) {
                return e0;
            }
        }
        return null;
    }

    public static f b(Object object0) {
        d d0;
        Method method2;
        b b0;
        int v4;
        Method method1;
        Class class2;
        Method[] arr_method1;
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        Class class0 = object0.getClass();
        while(class0 != Object.class) {
            Method[] arr_method = class0.getDeclaredMethods();
            int v = arr_method.length;
            int v1 = 0;
            while(v1 < v) {
                Method method0 = arr_method[v1];
                boolean z = method0.isAnnotationPresent(ToJson.class);
                Class class1 = JsonAdapter.class;
                if(z) {
                    method0.setAccessible(true);
                    Type type0 = method0.getGenericReturnType();
                    Type[] arr_type = method0.getGenericParameterTypes();
                    Annotation[][] arr2_annotation = method0.getParameterAnnotations();
                    if(arr_type.length < 2 || arr_type[0] != JsonWriter.class || type0 != Void.TYPE) {
                        arr_method1 = arr_method;
                    }
                    else {
                        int v2 = arr_type.length;
                        int v3 = 2;
                        while(v3 < v2) {
                            Type type1 = arr_type[v3];
                            arr_method1 = arr_method;
                            if(!(type1 instanceof ParameterizedType) || ((ParameterizedType)type1).getRawType() != class1) {
                                goto label_34;
                            }
                            ++v3;
                            arr_method = arr_method1;
                        }
                        arr_method1 = arr_method;
                        Set set0 = Util.jsonAnnotations(arr2_annotation[1]);
                        class2 = class1;
                        method1 = method0;
                        v4 = v;
                        b0 = new b(arr_type[1], set0, object0, method0, arr_type.length, 2, true, 0);
                        goto label_42;
                    }
                label_34:
                    class2 = class1;
                    method1 = method0;
                    if(arr_type.length != 1 || type0 == Void.TYPE) {
                        throw new IllegalArgumentException("Unexpected signature for " + method1 + ".\n@ToJson method signatures may have one of the following structures:\n    <any access modifier> void toJson(JsonWriter writer, T value) throws <any>;\n    <any access modifier> void toJson(JsonWriter writer, T value, JsonAdapter<any> delegate, <any more delegates>) throws <any>;\n    <any access modifier> R toJson(T value) throws <any>;\n");
                    }
                    Set set1 = Util.jsonAnnotations(method1);
                    Set set2 = Util.jsonAnnotations(arr2_annotation[0]);
                    boolean z1 = Util.hasNullable(arr2_annotation[0]);
                    v4 = v;
                    b0 = new c(arr_type[0], set2, object0, method1, arr_type.length, z1, arr_type, type0, set2, set1);
                label_42:
                    e e0 = f.a(arrayList0, b0.a, b0.b);
                    if(e0 != null) {
                        throw new IllegalArgumentException("Conflicting @ToJson methods:\n    " + e0.d + "\n    " + b0.d);
                    }
                    arrayList0.add(b0);
                    method2 = method1;
                }
                else {
                    arr_method1 = arr_method;
                    v4 = v;
                    class2 = class1;
                    method2 = method0;
                }
                if(method2.isAnnotationPresent(FromJson.class)) {
                    method2.setAccessible(true);
                    Type type2 = method2.getGenericReturnType();
                    Set set3 = Util.jsonAnnotations(method2);
                    Type[] arr_type1 = method2.getGenericParameterTypes();
                    Annotation[][] arr2_annotation1 = method2.getParameterAnnotations();
                    if(arr_type1.length >= 1 && arr_type1[0] == JsonReader.class && type2 != Void.TYPE) {
                        int v5 = arr_type1.length;
                        int v6 = 1;
                        while(v6 < v5) {
                            Type type3 = arr_type1[v6];
                            if(!(type3 instanceof ParameterizedType) || ((ParameterizedType)type3).getRawType() != class2) {
                                goto label_69;
                            }
                            ++v6;
                        }
                        d0 = new b(type2, set3, object0, method2, arr_type1.length, 1, true, 1);
                    }
                    else {
                    label_69:
                        if(arr_type1.length != 1 || type2 == Void.TYPE) {
                            throw new IllegalArgumentException("Unexpected signature for " + method2 + ".\n@FromJson method signatures may have one of the following structures:\n    <any access modifier> R fromJson(JsonReader jsonReader) throws <any>;\n    <any access modifier> R fromJson(JsonReader jsonReader, JsonAdapter<any> delegate, <any more delegates>) throws <any>;\n    <any access modifier> R fromJson(T value) throws <any>;\n");
                        }
                        Set set4 = Util.jsonAnnotations(arr2_annotation1[0]);
                        boolean z2 = Util.hasNullable(arr2_annotation1[0]);
                        d0 = new d(type2, set3, object0, method2, arr_type1.length, z2, arr_type1, type2, set4, set3);
                    }
                    e e1 = f.a(arrayList1, d0.a, d0.b);
                    if(e1 != null) {
                        throw new IllegalArgumentException("Conflicting @FromJson methods:\n    " + e1.d + "\n    " + d0.d);
                    }
                    arrayList1.add(d0);
                }
                ++v1;
                arr_method = arr_method1;
                v = v4;
            }
            class0 = class0.getSuperclass();
        }
        if(arrayList0.isEmpty() && arrayList1.isEmpty()) {
            throw new IllegalArgumentException("Expected at least one @ToJson or @FromJson method on " + object0.getClass().getName());
        }
        return new f(arrayList0, arrayList1);
    }

    @Override  // com.squareup.moshi.JsonAdapter$Factory
    public final JsonAdapter create(Type type0, Set set0, Moshi moshi0) {
        e e0 = f.a(this.a, type0, set0);
        e e1 = f.a(this.b, type0, set0);
        JsonAdapter jsonAdapter0 = null;
        if(e0 == null && e1 == null) {
            return null;
        }
        if(e0 == null || e1 == null) {
            try {
                jsonAdapter0 = moshi0.nextAdapter(this, type0, set0);
            }
            catch(IllegalArgumentException illegalArgumentException0) {
                StringBuilder stringBuilder0 = a5.b.v("No ", (e0 == null ? "@ToJson" : "@FromJson"), " adapter for ");
                stringBuilder0.append(Util.typeAnnotatedWithAnnotations(type0, set0));
                throw new IllegalArgumentException(stringBuilder0.toString(), illegalArgumentException0);
            }
        }
        if(e0 != null) {
            e0.a(moshi0, this);
        }
        if(e1 != null) {
            e1.a(moshi0, this);
        }
        return new a(e0, jsonAdapter0, moshi0, e1, set0, type0);
    }
}

