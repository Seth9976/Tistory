package com.kakao.tistory.presentation.widget.common;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.material3.TopAppBarState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.FloatRef;

public final class e5 extends Lambda implements Function1 {
    public final FloatRef a;
    public final TopAppBarState b;
    public final FloatRef c;

    public e5(FloatRef ref$FloatRef0, TopAppBarState topAppBarState0, FloatRef ref$FloatRef1) {
        this.a = ref$FloatRef0;
        this.b = topAppBarState0;
        this.c = ref$FloatRef1;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((AnimationScope)object0), "$this$animateDecay");
        float f = ((Number)((AnimationScope)object0).getValue()).floatValue() - this.a.element;
        float f1 = this.b.getHeightOffset();
        this.b.setHeightOffset(f1 + f);
        float f2 = Math.abs(f1 - this.b.getHeightOffset());
        this.a.element = ((Number)((AnimationScope)object0).getValue()).floatValue();
        this.c.element = ((Number)((AnimationScope)object0).getVelocity()).floatValue();
        if(Math.abs(f - f2) > 0.5f) {
            ((AnimationScope)object0).cancelAnimation();
        }
        return Unit.INSTANCE;
    }
}

