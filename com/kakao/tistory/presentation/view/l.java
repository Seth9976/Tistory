package com.kakao.tistory.presentation.view;

import com.kakao.android.base.model.ErrorModel;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.view.common.dialog.TistoryDialog;
import com.kakao.tistory.presentation.viewmodel.SplashViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class l extends Lambda implements Function1 {
    public final SplashActivity a;
    public final SplashViewModel b;

    public l(SplashActivity splashActivity0, SplashViewModel splashViewModel0) {
        this.a = splashActivity0;
        this.b = splashViewModel0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((ErrorModel)object0), "it");
        this.a.o = true;
        k k0 = new k(this.b);
        this.a.getClass();
        String s = this.a.getString(string.label_dialog_ok);
        Intrinsics.checkNotNullExpressionValue(s, "getString(...)");
        o o0 = new o(k0);
        p p0 = new p(this.a);
        TistoryDialog.INSTANCE.showOk(this.a, ((ErrorModel)object0).getTitle(), ((ErrorModel)object0).getMessage(), false, s, o0, p0);
        return Unit.INSTANCE;
    }
}

