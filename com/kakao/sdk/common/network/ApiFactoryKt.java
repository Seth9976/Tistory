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
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import ub.a;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u001A!\u0010\u0006\u001A\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u00012\u0006\u0010\u0004\u001A\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\"\u001F\u0010\f\u001A\u00020\u0005*\u00020\u00008FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001A\u0004\b\n\u0010\u000B\"\u001F\u0010\u0011\u001A\u00020\r*\u00020\u00008FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000E\u0010\t\u001A\u0004\b\u000F\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/kakao/sdk/common/network/ApiFactory;", "", "url", "Lokhttp3/OkHttpClient$Builder;", "clientBuilder", "Lretrofit2/Retrofit;", "withClient", "(Lcom/kakao/sdk/common/network/ApiFactory;Ljava/lang/String;Lokhttp3/OkHttpClient$Builder;)Lretrofit2/Retrofit;", "b", "Lkotlin/Lazy;", "getRxKapi", "(Lcom/kakao/sdk/common/network/ApiFactory;)Lretrofit2/Retrofit;", "rxKapi", "Lokhttp3/logging/HttpLoggingInterceptor;", "c", "getLoggingInterceptor", "(Lcom/kakao/sdk/common/network/ApiFactory;)Lokhttp3/logging/HttpLoggingInterceptor;", "loggingInterceptor", "common-rx_release"}, k = 2, mv = {1, 4, 0})
public final class ApiFactoryKt {
    public static final KProperty[] a;
    public static final Lazy b;
    public static final Lazy c;

    static {
        ApiFactoryKt.a = new KProperty[]{Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinPackage(ApiFactoryKt.class, "common-rx_release"), "rxKapi", "getRxKapi(Lcom/kakao/sdk/common/network/ApiFactory;)Lretrofit2/Retrofit;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinPackage(ApiFactoryKt.class, "common-rx_release"), "loggingInterceptor", "getLoggingInterceptor(Lcom/kakao/sdk/common/network/ApiFactory;)Lokhttp3/logging/HttpLoggingInterceptor;"))};
        ApiFactoryKt.b = c.lazy(a.A);
        ApiFactoryKt.c = c.lazy(a.z);
    }

    @NotNull
    public static final HttpLoggingInterceptor getLoggingInterceptor(@NotNull ApiFactory apiFactory0) {
        Intrinsics.checkParameterIsNotNull(apiFactory0, "$this$loggingInterceptor");
        KProperty kProperty0 = ApiFactoryKt.a[1];
        return (HttpLoggingInterceptor)ApiFactoryKt.c.getValue();
    }

    @NotNull
    public static final Retrofit getRxKapi(@NotNull ApiFactory apiFactory0) {
        Intrinsics.checkParameterIsNotNull(apiFactory0, "$this$rxKapi");
        KProperty kProperty0 = ApiFactoryKt.a[0];
        return (Retrofit)ApiFactoryKt.b.getValue();
    }

    @NotNull
    public static final Retrofit withClient(@NotNull ApiFactory apiFactory0, @NotNull String s, @NotNull Builder okHttpClient$Builder0) {
        Intrinsics.checkParameterIsNotNull(apiFactory0, "$this$withClient");
        Intrinsics.checkParameterIsNotNull(s, "url");
        Intrinsics.checkParameterIsNotNull(okHttpClient$Builder0, "clientBuilder");
        Retrofit retrofit0 = new retrofit2.Retrofit.Builder().baseUrl(s).addCallAdapterFactory(RxJava2CallAdapterFactory.create()).addConverterFactory(new KakaoRetrofitConverterFactory()).addConverterFactory(GsonConverterFactory.create(KakaoJson.INSTANCE.getBase())).client(okHttpClient$Builder0.build()).build();
        Intrinsics.checkExpressionValueIsNotNull(retrofit0, "Retrofit.Builder().baseU…build())\n        .build()");
        return retrofit0;
    }
}

