package com.kakao.tistory.presentation.view.webview;

import android.app.Activity;
import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class b0 extends Lambda implements Function0 {
    public final EntryWebView a;

    public b0(EntryWebView entryWebView0) {
        this.a = entryWebView0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Context context0 = this.a.getContext();
        Intrinsics.checkNotNull(context0, "null cannot be cast to non-null type android.app.Activity");
        return new CommonFullScreenWebChromeClient(((Activity)context0));
    }
}

