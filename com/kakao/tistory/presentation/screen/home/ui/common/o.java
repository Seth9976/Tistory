package com.kakao.tistory.presentation.screen.home.ui.common;

import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class o extends Lambda implements Function1 {
    public static final o a;

    static {
        o.a = new o();
    }

    public o() {
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((ContentDrawScope)object0), "$this$drawWithContent");
        PlaceHolderKt.a(((ContentDrawScope)object0), 0L, 0L, 0L, 15);
        return Unit.INSTANCE;
    }
}

