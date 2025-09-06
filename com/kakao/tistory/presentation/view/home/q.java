package com.kakao.tistory.presentation.view.home;

import com.kakao.tistory.presentation.common.extension.NavigatorExtensionKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class q extends Lambda implements Function1 {
    public final RefererLogListActivity a;

    public q(RefererLogListActivity refererLogListActivity0) {
        this.a = refererLogListActivity0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((String)object0), "it");
        NavigatorExtensionKt.goToWebView$default(this.a, ((String)object0), false, false, false, false, 30, null);
        return Unit.INSTANCE;
    }
}

