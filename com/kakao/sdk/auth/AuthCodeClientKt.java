package com.kakao.sdk.auth;

import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import md.c;
import org.jetbrains.annotations.NotNull;
import sb.a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u001F\u0010\u0006\u001A\u00020\u0001*\u00020\u00008FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001A\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/kakao/sdk/auth/AuthCodeClient$Companion;", "Lcom/kakao/sdk/auth/RxAuthCodeClient;", "b", "Lkotlin/Lazy;", "getRx", "(Lcom/kakao/sdk/auth/AuthCodeClient$Companion;)Lcom/kakao/sdk/auth/RxAuthCodeClient;", "rx", "auth-rx_release"}, k = 2, mv = {1, 4, 0})
@JvmName(name = "AuthCodeClientKt")
public final class AuthCodeClientKt {
    public static final KProperty[] a;
    public static final Lazy b;

    static {
        AuthCodeClientKt.a = new KProperty[]{Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinPackage(AuthCodeClientKt.class, "auth-rx_release"), "rx", "getRx(Lcom/kakao/sdk/auth/AuthCodeClient$Companion;)Lcom/kakao/sdk/auth/RxAuthCodeClient;"))};
        AuthCodeClientKt.b = c.lazy(a.A);
    }

    @NotNull
    public static final RxAuthCodeClient getRx(@NotNull Companion authCodeClient$Companion0) {
        Intrinsics.checkParameterIsNotNull(authCodeClient$Companion0, "$this$rx");
        KProperty kProperty0 = AuthCodeClientKt.a[0];
        return (RxAuthCodeClient)AuthCodeClientKt.b.getValue();
    }
}

