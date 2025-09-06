package com.kakao.sdk.common.network;

import com.kakao.sdk.common.util.KakaoJson;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import md.c;
import okhttp3.OkHttpClient.Builder;
import okhttp3.logging.HttpLoggingInterceptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.CallAdapter.Factory;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import ub.a;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001J)\u0010\t\u001A\u00020\b2\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u00042\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nR\u001B\u0010\u0010\u001A\u00020\u000B8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001A\u0004\b\u000E\u0010\u000FR\u001B\u0010\u0014\u001A\u00020\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\r\u001A\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/kakao/sdk/common/network/ApiFactory;", "", "", "url", "Lokhttp3/OkHttpClient$Builder;", "clientBuilder", "Lretrofit2/CallAdapter$Factory;", "factory", "Lretrofit2/Retrofit;", "withClientAndAdapter", "(Ljava/lang/String;Lokhttp3/OkHttpClient$Builder;Lretrofit2/CallAdapter$Factory;)Lretrofit2/Retrofit;", "Lokhttp3/logging/HttpLoggingInterceptor;", "b", "Lkotlin/Lazy;", "getLoggingInterceptor", "()Lokhttp3/logging/HttpLoggingInterceptor;", "loggingInterceptor", "c", "getKapi", "()Lretrofit2/Retrofit;", "kapi", "common_release"}, k = 1, mv = {1, 4, 0})
public final class ApiFactory {
    public static final ApiFactory INSTANCE;
    public static final KProperty[] a;
    public static final Lazy b;
    public static final Lazy c;

    static {
        ApiFactory.a = new KProperty[]{Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ApiFactory.class), "loggingInterceptor", "getLoggingInterceptor()Lokhttp3/logging/HttpLoggingInterceptor;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ApiFactory.class), "kapi", "getKapi()Lretrofit2/Retrofit;"))};
        ApiFactory.INSTANCE = new ApiFactory();  // 初始化器: Ljava/lang/Object;-><init>()V
        ApiFactory.b = c.lazy(a.y);
        ApiFactory.c = c.lazy(a.x);
    }

    @NotNull
    public final Retrofit getKapi() {
        KProperty kProperty0 = ApiFactory.a[1];
        return (Retrofit)ApiFactory.c.getValue();
    }

    @NotNull
    public final HttpLoggingInterceptor getLoggingInterceptor() {
        KProperty kProperty0 = ApiFactory.a[0];
        return (HttpLoggingInterceptor)ApiFactory.b.getValue();
    }

    @NotNull
    public final Retrofit withClientAndAdapter(@NotNull String s, @NotNull Builder okHttpClient$Builder0, @Nullable Factory callAdapter$Factory0) {
        Intrinsics.checkParameterIsNotNull(s, "url");
        Intrinsics.checkParameterIsNotNull(okHttpClient$Builder0, "clientBuilder");
        retrofit2.Retrofit.Builder retrofit$Builder0 = new retrofit2.Retrofit.Builder().baseUrl(s).addConverterFactory(new KakaoRetrofitConverterFactory()).addConverterFactory(GsonConverterFactory.create(KakaoJson.INSTANCE.getBase())).client(okHttpClient$Builder0.build());
        if(callAdapter$Factory0 != null) {
            retrofit$Builder0.addCallAdapterFactory(callAdapter$Factory0);
        }
        Retrofit retrofit0 = retrofit$Builder0.build();
        Intrinsics.checkExpressionValueIsNotNull(retrofit0, "builder.build()");
        return retrofit0;
    }

    public static Retrofit withClientAndAdapter$default(ApiFactory apiFactory0, String s, Builder okHttpClient$Builder0, Factory callAdapter$Factory0, int v, Object object0) {
        if((v & 4) != 0) {
            callAdapter$Factory0 = null;
        }
        return apiFactory0.withClientAndAdapter(s, okHttpClient$Builder0, callAdapter$Factory0);
    }
}

