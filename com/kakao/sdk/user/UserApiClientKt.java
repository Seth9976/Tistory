package com.kakao.sdk.user;

import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import md.c;
import org.jetbrains.annotations.NotNull;
import xb.a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u001F\u0010\u0006\u001A\u00020\u0001*\u00020\u00008FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001A\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/kakao/sdk/user/UserApiClient$Companion;", "Lcom/kakao/sdk/user/RxUserApiClient;", "b", "Lkotlin/Lazy;", "getRx", "(Lcom/kakao/sdk/user/UserApiClient$Companion;)Lcom/kakao/sdk/user/RxUserApiClient;", "rx", "user-rx_release"}, k = 2, mv = {1, 4, 0})
@JvmName(name = "UserApiClientKt")
public final class UserApiClientKt {
    public static final KProperty[] a;
    public static final Lazy b;

    static {
        UserApiClientKt.a = new KProperty[]{Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinPackage(UserApiClientKt.class, "user-rx_release"), "rx", "getRx(Lcom/kakao/sdk/user/UserApiClient$Companion;)Lcom/kakao/sdk/user/RxUserApiClient;"))};
        UserApiClientKt.b = c.lazy(a.z);
    }

    @NotNull
    public static final RxUserApiClient getRx(@NotNull Companion userApiClient$Companion0) {
        Intrinsics.checkParameterIsNotNull(userApiClient$Companion0, "$this$rx");
        KProperty kProperty0 = UserApiClientKt.a[0];
        return (RxUserApiClient)UserApiClientKt.b.getValue();
    }
}

