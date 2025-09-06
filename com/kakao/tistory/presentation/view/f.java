package com.kakao.tistory.presentation.view;

import com.kakao.tistory.domain.entity.common.RegulationLink;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.extension.ExtensionsKt;
import com.kakao.tistory.presentation.view.common.dialog.TistoryDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class f extends Lambda implements Function1 {
    public final SplashActivity a;

    public f(SplashActivity splashActivity0) {
        this.a = splashActivity0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((RegulationLink)object0), "it");
        CharSequence charSequence0 = ExtensionsKt.getRegulationClickableSpanMessage(((RegulationLink)object0), this.a);
        String s = this.a.getString(string.label_exception_regulation_title);
        Intrinsics.checkNotNullExpressionValue(s, "getString(...)");
        e e0 = new e(this.a);
        String s1 = this.a.getString(string.label_dialog_ok);
        Intrinsics.checkNotNullExpressionValue(s1, "getString(...)");
        o o0 = new o(e0);
        p p0 = new p(this.a);
        TistoryDialog.INSTANCE.showOk(this.a, s, charSequence0, false, s1, o0, p0);
        return Unit.INSTANCE;
    }
}

