package com.kakao.tistory.presentation.view.webview;

import android.app.Dialog;
import android.webkit.JsResult;
import com.kakao.tistory.presentation.screen.feed.t;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class e extends Lambda implements Function2 {
    public final JsResult a;

    public e(JsResult jsResult0) {
        this.a = jsResult0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        t.a(((Number)object1), ((Dialog)object0), "dialog");
        this.a.cancel();
        return Unit.INSTANCE;
    }
}

