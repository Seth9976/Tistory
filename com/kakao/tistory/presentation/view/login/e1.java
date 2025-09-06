package com.kakao.tistory.presentation.view.login;

import com.kakao.tistory.presentation.common.extension.NavigatorExtensionKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class e1 extends Lambda implements Function1 {
    public final TistroyLoginActivity a;

    public e1(TistroyLoginActivity tistroyLoginActivity0) {
        this.a = tistroyLoginActivity0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((Unit)object0), "it");
        String s = this.a.k;
        NavigatorExtensionKt.goToMain$default(this.a, s, null, null, 6, null);
        this.a.finish();
        return Unit.INSTANCE;
    }
}

