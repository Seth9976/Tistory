package com.kakao.tistory.presentation.view.common.base;

import com.kakao.android.base.model.ErrorModel;
import com.kakao.tistory.presentation.TistoryMainActivity;
import com.kakao.tistory.presentation.view.common.dialog.TistoryDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class h extends Lambda implements Function1 {
    public final TistoryAppCompatActivity a;

    public h(TistoryAppCompatActivity tistoryAppCompatActivity0) {
        this.a = tistoryAppCompatActivity0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((ErrorModel)object0), "data");
        TistoryAppCompatActivity tistoryAppCompatActivity0 = this.a;
        if(!(tistoryAppCompatActivity0 instanceof TistoryMainActivity)) {
            g g0 = new g(this.a);
            TistoryDialog.showOk$default(TistoryDialog.INSTANCE, tistoryAppCompatActivity0, ((ErrorModel)object0).getTitle(), ((ErrorModel)object0).getMessage(), false, null, g0, null, 80, null);
        }
        return Unit.INSTANCE;
    }
}

