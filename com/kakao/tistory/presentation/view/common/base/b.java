package com.kakao.tistory.presentation.view.common.base;

import com.kakao.android.base.model.ErrorModel;
import com.kakao.tistory.presentation.common.extension.NavigatorExtensionKt;
import com.kakao.tistory.presentation.view.SplashActivity;
import com.kakao.tistory.presentation.view.common.dialog.TistoryDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class b extends Lambda implements Function1 {
    public final TistoryActivity a;

    public b(TistoryActivity tistoryActivity0) {
        this.a = tistoryActivity0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((ErrorModel)object0), "data");
        TistoryActivity tistoryActivity0 = this.a;
        if(!(tistoryActivity0 instanceof SplashActivity)) {
            a a0 = new a(this.a);
            TistoryDialog.showOk$default(TistoryDialog.INSTANCE, tistoryActivity0, ((ErrorModel)object0).getTitle(), ((ErrorModel)object0).getMessage(), false, null, a0, null, 80, null);
            return Unit.INSTANCE;
        }
        NavigatorExtensionKt.goToKakaoLogin$default(tistoryActivity0, null, 1, null);
        return Unit.INSTANCE;
    }
}

