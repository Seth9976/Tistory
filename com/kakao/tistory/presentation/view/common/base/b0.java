package com.kakao.tistory.presentation.view.common.base;

import com.kakao.tistory.presentation.common.extension.NavigatorExtensionKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class b0 extends Lambda implements Function1 {
    public final TistoryToolbarActivity a;

    public b0(TistoryToolbarActivity tistoryToolbarActivity0) {
        this.a = tistoryToolbarActivity0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((Unit)object0), "it");
        NavigatorExtensionKt.goToSetting(this.a);
        return Unit.INSTANCE;
    }
}

