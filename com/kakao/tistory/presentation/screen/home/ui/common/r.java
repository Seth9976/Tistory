package com.kakao.tistory.presentation.screen.home.ui.common;

import androidx.compose.ui.geometry.CornerRadiusKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class r extends Lambda implements Function1 {
    public static final r a;

    static {
        r.a = new r();
    }

    public r() {
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((ContentDrawScope)object0), "$this$drawWithContent");
        PlaceHolderKt.a(((ContentDrawScope)object0), CornerRadiusKt.CornerRadius$default(Size.getHeight-impl(((ContentDrawScope)object0).getSize-NH-jbRc()), 0.0f, 2, null), 0L, 0L, 13);
        return Unit.INSTANCE;
    }
}

