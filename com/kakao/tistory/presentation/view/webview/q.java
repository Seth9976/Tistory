package com.kakao.tistory.presentation.view.webview;

import com.kakao.tistory.presentation.common.extension.NavigatorExtensionKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class q extends Lambda implements Function1 {
    public final CommonWebViewActivity a;

    public q(CommonWebViewActivity commonWebViewActivity0) {
        this.a = commonWebViewActivity0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((String)object0), "it");
        NavigatorExtensionKt.goToShareIntent(this.a, "", ((String)object0));
        return Unit.INSTANCE;
    }
}

