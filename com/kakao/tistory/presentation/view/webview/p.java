package com.kakao.tistory.presentation.view.webview;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class p extends Lambda implements Function1 {
    public final CommonWebViewActivity a;

    public p(CommonWebViewActivity commonWebViewActivity0) {
        this.a = commonWebViewActivity0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((String)object0), "it");
        this.a.a(((String)object0));
        return Unit.INSTANCE;
    }
}

