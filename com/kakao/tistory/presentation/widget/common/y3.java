package com.kakao.tistory.presentation.widget.common;

import androidx.compose.ui.graphics.GraphicsLayerScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class y3 extends Lambda implements Function1 {
    public final float a;

    public y3(float f) {
        this.a = f;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((GraphicsLayerScope)object0), "$this$placeWithLayer");
        ((GraphicsLayerScope)object0).setScaleX(this.a);
        ((GraphicsLayerScope)object0).setScaleY(this.a);
        ((GraphicsLayerScope)object0).setTransformOrigin-__ExYCQ(0x3F800000L);
        return Unit.INSTANCE;
    }
}

