package com.kakao.tistory.presentation.widget.swipe;

import androidx.compose.ui.graphics.GraphicsLayerScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class r extends Lambda implements Function1 {
    public final CommonSwipeState a;

    public r(CommonSwipeState commonSwipeState0) {
        this.a = commonSwipeState0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((GraphicsLayerScope)object0), "$this$graphicsLayer");
        ((GraphicsLayerScope)object0).setTranslationX(((Number)this.a.getDragOffsetX().getValue()).floatValue());
        return Unit.INSTANCE;
    }
}

