package com.kakao.tistory.presentation.screen.revenue;

import android.content.Context;
import com.kakao.tistory.presentation.common.extension.NavigatorExtensionKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class k extends Lambda implements Function0 {
    public final Context a;
    public final String b;

    public k(Context context0, String s) {
        this.a = context0;
        this.b = s;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        RevenueTiara.INSTANCE.trackClickCreator();
        NavigatorExtensionKt.goToWebView$default(this.a, this.b, false, false, false, false, 30, null);
        return Unit.INSTANCE;
    }
}

