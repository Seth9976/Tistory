package com.kakao.tistory.presentation.view.common.base;

import com.kakao.android.base.model.ErrorModel;
import com.kakao.tistory.presentation.view.common.dialog.TistoryDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class f extends Lambda implements Function1 {
    public final TistoryAppCompatActivity a;

    public f(TistoryAppCompatActivity tistoryAppCompatActivity0) {
        this.a = tistoryAppCompatActivity0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((ErrorModel)object0), "data");
        e e0 = new e(this.a);
        TistoryDialog.showOk$default(TistoryDialog.INSTANCE, this.a, ((ErrorModel)object0).getTitle(), ((ErrorModel)object0).getMessage(), false, null, e0, null, 80, null);
        return Unit.INSTANCE;
    }
}

