package com.kakao.tistory.presentation.view.webview;

import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class j extends Lambda implements Function0 {
    public final CommonWebView a;

    public j(CommonWebView commonWebView0) {
        this.a = commonWebView0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Context context0 = this.a.getContext();
        Intrinsics.checkNotNullExpressionValue(context0, "getContext(...)");
        return new CommonWebViewClient(context0);
    }
}

