package com.kakao.tistory.presentation.widget.common;

import androidx.compose.ui.graphics.GraphicsLayerScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class r4 extends Lambda implements Function1 {
    public final float a;

    public r4(float f) {
        this.a = f;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((GraphicsLayerScope)object0), "$this$graphicsLayer");
        ((GraphicsLayerScope)object0).setAlpha(this.a);
        return Unit.INSTANCE;
    }
}

