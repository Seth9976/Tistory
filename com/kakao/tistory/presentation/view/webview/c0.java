package com.kakao.tistory.presentation.view.webview;

import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class c0 extends Lambda implements Function0 {
    public final EntryWebView a;

    public c0(EntryWebView entryWebView0) {
        this.a = entryWebView0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Context context0 = this.a.getContext();
        Intrinsics.checkNotNullExpressionValue(context0, "getContext(...)");
        return new CommonWebViewClient(context0);
    }
}

