package com.kakao.tistory.presentation.view.common.base;

import com.kakao.tistory.presentation.common.extension.NavigatorExtensionKt;
import com.kakao.tistory.presentation.main.navigation.MainCommand.GoMy;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class c0 extends Lambda implements Function1 {
    public final TistoryToolbarActivity a;

    public c0(TistoryToolbarActivity tistoryToolbarActivity0) {
        this.a = tistoryToolbarActivity0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((Unit)object0), "it");
        NavigatorExtensionKt.goToMain$default(this.a, null, null, GoMy.INSTANCE, 3, null);
        return Unit.INSTANCE;
    }
}

