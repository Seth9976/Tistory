package com.kakao.tistory.presentation.view.webview;

import android.app.Dialog;
import android.webkit.JsResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class c extends Lambda implements Function2 {
    public final JsResult a;

    public c(JsResult jsResult0) {
        this.a = jsResult0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        Intrinsics.checkNotNullParameter(((Dialog)object0), "dialog");
        switch(((Number)object1).intValue()) {
            case 1: {
                this.a.cancel();
                break;
            }
            case 2: {
                this.a.confirm();
            }
        }
        ((Dialog)object0).dismiss();
        return Unit.INSTANCE;
    }
}

