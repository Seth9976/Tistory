package com.kakao.sdk.common.util;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.kakao.sdk.common.json.KakaoTypeAdapterFactory;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001J/\u0010\b\u001A\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001A\u00020\u00032\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\b\u0010\tJ+\u0010\r\u001A\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001A\u00020\u00032\u0006\u0010\u000B\u001A\u00020\n2\u0006\u0010\f\u001A\u00020\n¢\u0006\u0004\b\r\u0010\u000EJ\u001B\u0010\u0010\u001A\u00020\u0003\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u000F\u001A\u00028\u0000¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0012\u001A\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001A\u00020\u00032\u0006\u0010\u000B\u001A\u00020\n¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0019\u001A\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001C\u001A\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u001A\u0010\u0016\u001A\u0004\b\u001B\u0010\u0018¨\u0006\u001D"}, d2 = {"Lcom/kakao/sdk/common/util/KakaoJson;", "", "T", "", "string", "Ljava/lang/Class;", "type", "", "listFromJson", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/util/List;", "Ljava/lang/reflect/Type;", "type1", "type2", "parameterizedFromJson", "(Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)Ljava/lang/Object;", "model", "toJson", "(Ljava/lang/Object;)Ljava/lang/String;", "fromJson", "(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;", "Lcom/google/gson/Gson;", "a", "Lcom/google/gson/Gson;", "getBase", "()Lcom/google/gson/Gson;", "base", "b", "getPretty", "pretty", "common_release"}, k = 1, mv = {1, 4, 0})
public final class KakaoJson {
    public static final KakaoJson INSTANCE;
    public static final Gson a;
    public static final Gson b;

    static {
        KakaoJson.INSTANCE = new KakaoJson();  // 初始化器: Ljava/lang/Object;-><init>()V
        KakaoJson.kakaoExclusionStrategy.1 kakaoJson$kakaoExclusionStrategy$10 = new KakaoJson.kakaoExclusionStrategy.1();  // 初始化器: Ljava/lang/Object;-><init>()V
        GsonBuilder gsonBuilder0 = new GsonBuilder().registerTypeAdapterFactory(new KakaoTypeAdapterFactory()).setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).addSerializationExclusionStrategy(kakaoJson$kakaoExclusionStrategy$10).addDeserializationExclusionStrategy(kakaoJson$kakaoExclusionStrategy$10);
        Gson gson0 = gsonBuilder0.create();
        Intrinsics.checkExpressionValueIsNotNull(gson0, "internalBuilder.create()");
        KakaoJson.a = gson0;
        Gson gson1 = gsonBuilder0.setPrettyPrinting().create();
        Intrinsics.checkExpressionValueIsNotNull(gson1, "internalBuilder.setPrettyPrinting().create()");
        KakaoJson.b = gson1;
    }

    public final Object fromJson(@NotNull String s, @NotNull Type type0) {
        Intrinsics.checkParameterIsNotNull(s, "string");
        Intrinsics.checkParameterIsNotNull(type0, "type1");
        return KakaoJson.a.fromJson(s, type0);
    }

    @NotNull
    public final Gson getBase() {
        return KakaoJson.a;
    }

    @NotNull
    public final Gson getPretty() {
        return KakaoJson.b;
    }

    @NotNull
    public final List listFromJson(@NotNull String s, @NotNull Class class0) {
        Intrinsics.checkParameterIsNotNull(s, "string");
        Intrinsics.checkParameterIsNotNull(class0, "type");
        TypeToken typeToken0 = TypeToken.getParameterized(List.class, new Type[]{class0});
        Intrinsics.checkExpressionValueIsNotNull(typeToken0, "TypeToken.getParameterized(List::class.java, type)");
        Object object0 = KakaoJson.a.fromJson(s, typeToken0.getType());
        Intrinsics.checkExpressionValueIsNotNull(object0, "base.fromJson(string, Ty…::class.java, type).type)");
        return (List)object0;
    }

    public final Object parameterizedFromJson(@NotNull String s, @NotNull Type type0, @NotNull Type type1) {
        Intrinsics.checkParameterIsNotNull(s, "string");
        Intrinsics.checkParameterIsNotNull(type0, "type1");
        Intrinsics.checkParameterIsNotNull(type1, "type2");
        TypeToken typeToken0 = TypeToken.getParameterized(type0, new Type[]{type1});
        Intrinsics.checkExpressionValueIsNotNull(typeToken0, "TypeToken.getParameterized(type1, type2)");
        return KakaoJson.a.fromJson(s, typeToken0.getType());
    }

    @NotNull
    public final String toJson(Object object0) {
        String s = KakaoJson.a.toJson(object0);
        Intrinsics.checkExpressionValueIsNotNull(s, "base.toJson(model)");
        return s;
    }
}

