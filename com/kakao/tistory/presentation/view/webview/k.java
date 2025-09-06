package com.kakao.tistory.presentation.view.webview;

import android.view.MotionEvent;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class k extends Lambda implements Function1 {
    public final CommonWebView a;

    public k(CommonWebView commonWebView0) {
        this.a = commonWebView0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((MotionEvent)object0), "it");
        return Boolean.valueOf(this.a.super.onTouchEvent(((MotionEvent)object0)));
    }
}

