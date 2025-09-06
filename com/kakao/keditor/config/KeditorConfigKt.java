package com.kakao.keditor.config;

import android.content.Context;
import androidx.room.a;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.kakao.keditor.Keditor;
import com.kakao.keditor.delegate.JsonConverterKt;
import com.kakao.keditor.exception.MissingJsonConverterException;
import com.kakao.keditor.plugin.KeditorPlugin;
import com.kakao.keditor.standard.KeditorStandardKt;
import com.squareup.moshi.Moshi.Builder;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map;
import kotlin.Metadata;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000*\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A4\u0010\u0000\u001A\u0004\u0018\u0001H\u0001\"\u0006\b\u0000\u0010\u0001\u0018\u0001*\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0003\u001A\u00020\u00042\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u0001H\u0001H\u0086\b¢\u0006\u0002\u0010\u0006\u001A\"\u0010\u0007\u001A\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t\u0018\u00010\b*\u00020\n2\u0006\u0010\u000B\u001A\u00020\u0004H\u0000\u001A$\u0010\f\u001A\u0004\u0018\u0001H\u0001\"\u0006\b\u0000\u0010\u0001\u0018\u0001*\u00020\r2\u0006\u0010\u000B\u001A\u00020\u0004H\u0086\b¢\u0006\u0002\u0010\u000E¨\u0006\u000F"}, d2 = {"config", "T", "Lcom/kakao/keditor/plugin/KeditorPlugin;", "key", "", "defaultValue", "(Lcom/kakao/keditor/plugin/KeditorPlugin;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "loadConfig", "", "", "Lcom/kakao/keditor/Keditor;", "fileName", "loadJsonFromAssert", "Landroid/content/Context;", "(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/Object;", "keditor_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nKeditorConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KeditorConfig.kt\ncom/kakao/keditor/config/KeditorConfigKt\n+ 2 JsonConverter.kt\ncom/kakao/keditor/delegate/JsonConverterKt\n+ 3 Keditor.kt\ncom/kakao/keditor/Keditor\n*L\n1#1,17:1\n13#1,3:18\n13#2,12:21\n13#2,12:33\n136#3,12:45\n*S KotlinDebug\n*F\n+ 1 KeditorConfig.kt\ncom/kakao/keditor/config/KeditorConfigKt\n*L\n11#1:18,3\n11#1:21,12\n15#1:33,12\n17#1:45,12\n*E\n"})
public final class KeditorConfigKt {
    public static final Object config(KeditorPlugin keditorPlugin0, String s, Object object0) {
        Object object1;
        Intrinsics.checkNotNullParameter(keditorPlugin0, "<this>");
        Intrinsics.checkNotNullParameter(s, "key");
        Keditor keditor0 = Keditor.INSTANCE;
        Integer integer0 = keditorPlugin0.getEditorId();
        if(KeditorStandardKt.getOr(keditor0.getLocalConfigs(), integer0, null) != null && ((Map)a.g(keditor0, integer0)).containsKey(s)) {
            object1 = ((Map)a.g(keditor0, integer0)).get(s);
            Intrinsics.reifiedOperationMarker(2, "T");
            return object1 == null ? null : object1;
        }
        object1 = keditor0.getConfig().get(s);
        Intrinsics.reifiedOperationMarker(2, "T");
        return object1 == null ? null : object1;
    }

    public static Object config$default(KeditorPlugin keditorPlugin0, String s, Object object0, int v, Object object1) {
        Object object2;
        Intrinsics.checkNotNullParameter(keditorPlugin0, "<this>");
        Intrinsics.checkNotNullParameter(s, "key");
        Keditor keditor0 = Keditor.INSTANCE;
        Integer integer0 = keditorPlugin0.getEditorId();
        if(KeditorStandardKt.getOr(keditor0.getLocalConfigs(), integer0, null) != null && ((Map)a.g(keditor0, integer0)).containsKey(s)) {
            object2 = ((Map)a.g(keditor0, integer0)).get(s);
            Intrinsics.reifiedOperationMarker(2, "T");
            return object2 == null ? null : object2;
        }
        object2 = keditor0.getConfig().get(s);
        Intrinsics.reifiedOperationMarker(2, "T");
        return object2 == null ? null : object2;
    }

    @Nullable
    public static final Map loadConfig(@NotNull Keditor keditor0, @NotNull String s) {
        String s1;
        Intrinsics.checkNotNullParameter(keditor0, "<this>");
        Intrinsics.checkNotNullParameter(s, "fileName");
        InputStream inputStream0 = keditor0.getContext().getAssets().open(s);
        Intrinsics.checkNotNullExpressionValue(inputStream0, "open(...)");
        BufferedReader bufferedReader0 = new BufferedReader(new InputStreamReader(inputStream0, Charsets.UTF_8), 0x2000);
        try {
            s1 = TextStreamsKt.readText(bufferedReader0);
        }
        catch(Throwable throwable0) {
            CloseableKt.closeFinally(bufferedReader0, throwable0);
            throw throwable0;
        }
        CloseableKt.closeFinally(bufferedReader0, null);
        Class class0 = JsonConverterKt.jsonConverterClass();
        boolean z = Intrinsics.areEqual(class0, Moshi.class);
        Class class1 = Map.class;
        if(z) {
            return (Map)new Builder().add(new KotlinJsonAdapterFactory()).build().adapter(class1).fromJson(s1);
        }
        if(!Intrinsics.areEqual(class0, Gson.class)) {
            throw new MissingJsonConverterException();
        }
        return (Map)new GsonBuilder().create().fromJson(s1, class1);
    }

    public static final Object loadJsonFromAssert(Context context0, String s) {
        String s1;
        Intrinsics.checkNotNullParameter(context0, "<this>");
        Intrinsics.checkNotNullParameter(s, "fileName");
        InputStream inputStream0 = context0.getAssets().open(s);
        Intrinsics.checkNotNullExpressionValue(inputStream0, "open(...)");
        BufferedReader bufferedReader0 = new BufferedReader(new InputStreamReader(inputStream0, Charsets.UTF_8), 0x2000);
        try {
            s1 = TextStreamsKt.readText(bufferedReader0);
        }
        catch(Throwable throwable0) {
            CloseableKt.closeFinally(bufferedReader0, throwable0);
            throw throwable0;
        }
        CloseableKt.closeFinally(bufferedReader0, null);
        Class class0 = JsonConverterKt.jsonConverterClass();
        boolean z = Intrinsics.areEqual(class0, Moshi.class);
        Class class1 = Object.class;
        if(z) {
            Moshi moshi0 = new Builder().add(new KotlinJsonAdapterFactory()).build();
            Intrinsics.reifiedOperationMarker(4, "T");
            return moshi0.adapter(class1).fromJson(s1);
        }
        if(!Intrinsics.areEqual(class0, Gson.class)) {
            throw new MissingJsonConverterException();
        }
        Gson gson0 = new GsonBuilder().create();
        Intrinsics.reifiedOperationMarker(4, "T");
        return gson0.fromJson(s1, class1);
    }
}

