package com.kakao.tistory.presentation.view.webview;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class h extends Lambda implements Function0 {
    public final CommonWebView a;

    public h(CommonWebView commonWebView0) {
        this.a = commonWebView0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.a.getOnShowFileChooser().invoke();
        return Unit.INSTANCE;
    }
}

