package com.kakao.tistory.presentation.view.webview;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class t extends Lambda implements Function0 {
    public final CommonWebViewActivity a;

    public t(CommonWebViewActivity commonWebViewActivity0) {
        this.a = commonWebViewActivity0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.a.finish();
        return Unit.INSTANCE;
    }
}

