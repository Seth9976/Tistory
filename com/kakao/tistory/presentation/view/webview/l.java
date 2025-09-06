package com.kakao.tistory.presentation.view.webview;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class l extends Lambda implements Function0 {
    public final CommonWebView a;

    public l(CommonWebView commonWebView0) {
        this.a = commonWebView0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        k k0 = new k(this.a);
        return new WebViewNestedScrollingHelper(this.a, k0);
    }
}

