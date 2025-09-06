package com.kakao.tistory.presentation.view.webview;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class u extends Lambda implements Function1 {
    public final CommonWebViewActivity a;

    public u(CommonWebViewActivity commonWebViewActivity0) {
        this.a = commonWebViewActivity0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        CommonWebViewActivity.access$getCommonWebViewModel(this.a).setUrl(((String)object0));
        return Unit.INSTANCE;
    }
}

