package com.kakao.tistory.presentation.view.exception;

import android.content.Context;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.extension.NavigatorExtensionKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class b extends Lambda implements Function0 {
    public final TistoryErrorView a;

    public b(TistoryErrorView tistoryErrorView0) {
        this.a = tistoryErrorView0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Context context0 = this.a.getContext();
        Intrinsics.checkNotNullExpressionValue(context0, "getContext(...)");
        String s = this.a.getContext().getResources().getString(string.web_link_faq);
        Intrinsics.checkNotNullExpressionValue(s, "getString(...)");
        NavigatorExtensionKt.goToWebView$default(context0, s, false, false, false, false, 30, null);
        return Unit.INSTANCE;
    }
}

