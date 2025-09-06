package com.kakao.tistory.presentation.view;

import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.view.common.dialog.TistoryDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class h extends Lambda implements Function1 {
    public final SplashActivity a;

    public h(SplashActivity splashActivity0) {
        this.a = splashActivity0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((Unit)object0), "it");
        String s = this.a.getString(string.label_exception_fail_app_info_load_fail_title);
        Intrinsics.checkNotNullExpressionValue(s, "getString(...)");
        String s1 = this.a.getString(string.label_exception_fail_app_info_load_fail_message);
        g g0 = new g(this.a);
        String s2 = this.a.getString(string.label_dialog_ok);
        Intrinsics.checkNotNullExpressionValue(s2, "getString(...)");
        o o0 = new o(g0);
        p p0 = new p(this.a);
        TistoryDialog.INSTANCE.showOk(this.a, s, s1, false, s2, o0, p0);
        return Unit.INSTANCE;
    }
}

