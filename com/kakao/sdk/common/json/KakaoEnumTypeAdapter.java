package com.kakao.sdk.common.json;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000B\u001A\u00020\n2\b\u0010\b\u001A\u0004\u0018\u00010\u00072\u0006\u0010\t\u001A\u00028\u0000H\u0016¢\u0006\u0004\b\u000B\u0010\fJ\u001B\u0010\u000F\u001A\u0004\u0018\u00018\u00002\b\u0010\u000E\u001A\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000F\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/kakao/sdk/common/json/KakaoEnumTypeAdapter;", "T", "Lcom/google/gson/TypeAdapter;", "Ljava/lang/Class;", "enumClass", "<init>", "(Ljava/lang/Class;)V", "Lcom/google/gson/stream/JsonWriter;", "out", "value", "", "write", "(Lcom/google/gson/stream/JsonWriter;Ljava/lang/Object;)V", "Lcom/google/gson/stream/JsonReader;", "in", "read", "(Lcom/google/gson/stream/JsonReader;)Ljava/lang/Object;", "common_release"}, k = 1, mv = {1, 4, 0})
public final class KakaoEnumTypeAdapter extends TypeAdapter {
    public final Class a;

    public KakaoEnumTypeAdapter(@NotNull Class class0) {
        Intrinsics.checkParameterIsNotNull(class0, "enumClass");
        super();
        this.a = class0;
    }

    @Override  // com.google.gson.TypeAdapter
    @Nullable
    public Object read(@Nullable JsonReader jsonReader0) {
        Pair pair1;
        Pair pair0;
        Object object0 = null;
        if((jsonReader0 == null ? null : jsonReader0.peek()) == JsonToken.NULL) {
            jsonReader0.nextNull();
            return null;
        }
        JsonToken jsonToken0 = jsonReader0 == null ? null : jsonReader0.peek();
        if(jsonToken0 == null) {
        label_13:
            pair1 = new Pair(null, null);
        }
        else {
            switch(jsonToken0) {
                case 1: {
                    pair0 = new Pair(jsonReader0.nextLong(), null);
                    break;
                }
                case 2: {
                    pair0 = new Pair(null, jsonReader0.nextString());
                    break;
                }
                default: {
                    goto label_13;
                }
            }
            pair1 = pair0;
        }
        Class class0 = this.a;
        Object[] arr_object = class0.getEnumConstants();
        if(arr_object != null) {
            int v = 0;
            while(v < arr_object.length) {
                object0 = arr_object[v];
                try {
                    if(object0 == null) {
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.Enum<*>");
                    }
                    String s = ((Enum)object0).name();
                    Field field0 = class0.getField(s);
                    Class class1 = SerializedName.class;
                    if(pair1.getFirst() != null) {
                        SerializedName serializedName0 = (SerializedName)field0.getAnnotation(class1);
                        if(serializedName0 != null) {
                            Long long0 = (Long)pair1.getFirst();
                            if(long0 != null && ((long)long0) == Long.parseLong(serializedName0.value())) {
                                return object0;
                            }
                        }
                    }
                    else if(pair1.getSecond() != null) {
                        if(Intrinsics.areEqual(((String)pair1.getSecond()), s)) {
                            return object0;
                        }
                        SerializedName serializedName1 = (SerializedName)field0.getAnnotation(class1);
                        if(serializedName1 != null && Intrinsics.areEqual(((String)pair1.getSecond()), serializedName1.value())) {
                            return object0;
                        }
                    }
                    UnknownValue unknownValue0 = (UnknownValue)field0.getAnnotation(UnknownValue.class);
                    ++v;
                    continue;
                }
                catch(NoSuchFieldException noSuchFieldException0) {
                }
                throw new IOException(noSuchFieldException0);
            }
        }
        if(object0 == null) {
            throw new IOException("No matching enum field");
        }
        return object0;
    }

    @Override  // com.google.gson.TypeAdapter
    public void write(@Nullable JsonWriter jsonWriter0, Object object0) {
        if(object0 == null) {
            if(jsonWriter0 != null) {
                jsonWriter0.nullValue();
            }
            return;
        }
        Class class0 = this.a;
        boolean z = class0.isAnnotationPresent(IntEnum.class);
        Object[] arr_object = class0.getEnumConstants();
        if(arr_object != null) {
            int v = 0;
            while(v < arr_object.length) {
                Object object1 = arr_object[v];
                try {
                    if(object1 == null) {
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.Enum<*>");
                    }
                    SerializedName serializedName0 = (SerializedName)class0.getField(((Enum)object1).name()).getAnnotation(SerializedName.class);
                    if(serializedName0 != null && Intrinsics.areEqual(object1, object0)) {
                        if(z) {
                            if(jsonWriter0 != null) {
                                jsonWriter0.value(Integer.parseInt(serializedName0.value()));
                                return;
                            }
                        }
                        else if(jsonWriter0 != null) {
                            jsonWriter0.value(serializedName0.value());
                        }
                        return;
                    }
                    ++v;
                    continue;
                }
                catch(NoSuchFieldException noSuchFieldException0) {
                }
                throw new IOException(noSuchFieldException0);
            }
        }
        if(jsonWriter0 != null) {
            jsonWriter0.value(object0.toString());
        }
    }
}

