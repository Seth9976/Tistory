package com.kakao.sdk.auth.network;

import com.kakao.sdk.common.network.ApiFactory;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import md.c;
import org.jetbrains.annotations.NotNull;
import retrofit2.Retrofit;
import tb.a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\"\u001F\u0010\u0006\u001A\u00020\u0001*\u00020\u00008FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001A\u0004\b\u0004\u0010\u0005\"\u001F\u0010\t\u001A\u00020\u0001*\u00020\u00008FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u0003\u001A\u0004\b\b\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/kakao/sdk/common/network/ApiFactory;", "Lretrofit2/Retrofit;", "b", "Lkotlin/Lazy;", "getRxKapiWithOAuth", "(Lcom/kakao/sdk/common/network/ApiFactory;)Lretrofit2/Retrofit;", "rxKapiWithOAuth", "c", "getRxKauth", "rxKauth", "auth-rx_release"}, k = 2, mv = {1, 4, 0})
public final class RxApiFactoryKt {
    public static final KProperty[] a;
    public static final Lazy b;
    public static final Lazy c;

    static {
        RxApiFactoryKt.a = new KProperty[]{Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinPackage(RxApiFactoryKt.class, "auth-rx_release"), "rxKapiWithOAuth", "getRxKapiWithOAuth(Lcom/kakao/sdk/common/network/ApiFactory;)Lretrofit2/Retrofit;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinPackage(RxApiFactoryKt.class, "auth-rx_release"), "rxKauth", "getRxKauth(Lcom/kakao/sdk/common/network/ApiFactory;)Lretrofit2/Retrofit;"))};
        RxApiFactoryKt.b = c.lazy(a.z);
        RxApiFactoryKt.c = c.lazy(a.A);
    }

    @NotNull
    public static final Retrofit getRxKapiWithOAuth(@NotNull ApiFactory apiFactory0) {
        Intrinsics.checkParameterIsNotNull(apiFactory0, "$this$rxKapiWithOAuth");
        KProperty kProperty0 = RxApiFactoryKt.a[0];
        return (Retrofit)RxApiFactoryKt.b.getValue();
    }

    @NotNull
    public static final Retrofit getRxKauth(@NotNull ApiFactory apiFactory0) {
        Intrinsics.checkParameterIsNotNull(apiFactory0, "$this$rxKauth");
        KProperty kProperty0 = RxApiFactoryKt.a[1];
        return (Retrofit)RxApiFactoryKt.c.getValue();
    }
}

