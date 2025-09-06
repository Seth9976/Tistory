package com.kakao.tistory.presentation.viewmodel;

import android.content.Context;
import com.kakao.sdk.auth.AuthCodeClient;
import com.kakao.sdk.auth.AuthCodeClientKt;
import com.kakao.sdk.auth.RxAuthCodeClient;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class c2 extends Lambda implements Function1 {
    public final Context a;

    public c2(Context context0) {
        this.a = context0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((Boolean)object0), "it");
        return ((Boolean)object0).booleanValue() ? RxAuthCodeClient.authorizeWithKakaoTalk$default(AuthCodeClientKt.getRx(AuthCodeClient.Companion), this.a, 0, null, null, 14, null) : RxAuthCodeClient.authorizeWithKakaoAccount$default(AuthCodeClientKt.getRx(AuthCodeClient.Companion), this.a, null, null, null, null, null, 62, null);
    }
}

