package com.kakao.tistory.presentation.widget.common;

import androidx.compose.ui.graphics.GraphicsLayerScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class z3 extends Lambda implements Function1 {
    public final float a;
    public final float b;

    public z3(float f, float f1) {
        this.a = f;
        this.b = f1;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((GraphicsLayerScope)object0), "$this$placeWithLayer");
        ((GraphicsLayerScope)object0).setScaleX(this.a);
        ((GraphicsLayerScope)object0).setScaleY(this.a);
        ((GraphicsLayerScope)object0).setTransformOrigin-__ExYCQ(0L);
        ((GraphicsLayerScope)object0).setAlpha(1.0f - this.b);
        return Unit.INSTANCE;
    }
}

