package com.kakao.tistory.presentation.view.webview;

import com.kakao.tistory.presentation.common.extension.NavigatorExtensionKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class s extends Lambda implements Function0 {
    public final CommonWebViewActivity a;

    public s(CommonWebViewActivity commonWebViewActivity0) {
        this.a = commonWebViewActivity0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        NavigatorExtensionKt.goToChooser(this.a, "File", 2400);
        return Unit.INSTANCE;
    }
}

