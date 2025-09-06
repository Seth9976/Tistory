package com.kakao.tistory.presentation.view.login;

import com.kakao.tistory.presentation.common.extension.NavigatorExtensionKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class v extends Lambda implements Function1 {
    public final KakaoLoginActivity a;

    public v(KakaoLoginActivity kakaoLoginActivity0) {
        this.a = kakaoLoginActivity0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((List)object0), "it");
        NavigatorExtensionKt.goToSignUp$default(this.a, null, null, false, ((List)object0), 3, null);
        return Unit.INSTANCE;
    }
}

