package com.kakao.keditor.delegate;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.kakao.keditor.exception.MissingJsonConverterException;
import com.squareup.moshi.Moshi.Builder;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001A\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\u001A\n\u0010\u0000\u001A\u0006\u0012\u0002\b\u00030\u0001\u001A\u001C\u0010\u0002\u001A\u0004\u0018\u0001H\u0003\"\u0006\b\u0000\u0010\u0003\u0018\u0001*\u00020\u0004H\u0086\b¢\u0006\u0002\u0010\u0005\u001A&\u0010\u0006\u001A\u00020\u0004\"\u0006\b\u0000\u0010\u0003\u0018\u0001*\u0002H\u00032\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\bH\u0086\b¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"jsonConverterClass", "Ljava/lang/Class;", "toJsonObject", "T", "", "(Ljava/lang/String;)Ljava/lang/Object;", "toJsonString", "adapter", "", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;", "keditor_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class JsonConverterKt {
    @NotNull
    public static final Class jsonConverterClass() {
        try {
            Intrinsics.checkNotNull(Moshi.class);
            return Moshi.class;
        }
        catch(Exception unused_ex) {
            Intrinsics.checkNotNull(Gson.class);
            return Gson.class;
        }
    }

    public static final Object toJsonObject(String s) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        Class class0 = JsonConverterKt.jsonConverterClass();
        boolean z = Intrinsics.areEqual(class0, Moshi.class);
        Class class1 = Object.class;
        if(z) {
            Moshi moshi0 = new Builder().add(new KotlinJsonAdapterFactory()).build();
            Intrinsics.reifiedOperationMarker(4, "T");
            return moshi0.adapter(class1).fromJson(s);
        }
        if(!Intrinsics.areEqual(class0, Gson.class)) {
            throw new MissingJsonConverterException();
        }
        Gson gson0 = new GsonBuilder().create();
        Intrinsics.reifiedOperationMarker(4, "T");
        return gson0.fromJson(s, class1);
    }

    public static final String toJsonString(Object object0, Object object1) {
        String s;
        Class class0 = JsonConverterKt.jsonConverterClass();
        if(Intrinsics.areEqual(class0, Gson.class)) {
            s = new GsonBuilder().create().toJson(object0);
            Intrinsics.checkNotNull(s);
            return s;
        }
        if(!Intrinsics.areEqual(class0, Moshi.class)) {
            throw new MissingJsonConverterException();
        }
        Builder moshi$Builder0 = new Builder().add(new KotlinJsonAdapterFactory());
        if(object1 != null) {
            moshi$Builder0.add(object1);
        }
        Moshi moshi0 = moshi$Builder0.build();
        Intrinsics.reifiedOperationMarker(4, "T");
        s = moshi0.adapter(Object.class).toJson(object0);
        Intrinsics.checkNotNull(s);
        return s;
    }

    public static String toJsonString$default(Object object0, Object object1, int v, Object object2) {
        String s;
        if((v & 1) != 0) {
            object1 = null;
        }
        Class class0 = JsonConverterKt.jsonConverterClass();
        if(Intrinsics.areEqual(class0, Gson.class)) {
            s = new GsonBuilder().create().toJson(object0);
            Intrinsics.checkNotNull(s);
            return s;
        }
        if(!Intrinsics.areEqual(class0, Moshi.class)) {
            throw new MissingJsonConverterException();
        }
        Builder moshi$Builder0 = new Builder().add(new KotlinJsonAdapterFactory());
        if(object1 != null) {
            moshi$Builder0.add(object1);
        }
        Moshi moshi0 = moshi$Builder0.build();
        Intrinsics.reifiedOperationMarker(4, "T");
        s = moshi0.adapter(Object.class).toJson(object0);
        Intrinsics.checkNotNull(s);
        return s;
    }
}

