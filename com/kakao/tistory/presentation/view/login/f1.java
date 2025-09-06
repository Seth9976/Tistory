package com.kakao.tistory.presentation.view.login;

import com.kakao.tistory.presentation.common.extension.NavigatorExtensionKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class f1 extends Lambda implements Function1 {
    public final TistroyLoginActivity a;

    public f1(TistroyLoginActivity tistroyLoginActivity0) {
        this.a = tistroyLoginActivity0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((Unit)object0), "it");
        NavigatorExtensionKt.goToAccountMigration(this.a, Boolean.TRUE);
        this.a.finish();
        return Unit.INSTANCE;
    }
}

