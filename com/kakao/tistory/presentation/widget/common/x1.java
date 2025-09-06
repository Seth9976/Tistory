package com.kakao.tistory.presentation.widget.common;

import androidx.compose.runtime.State;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class x1 extends Lambda implements Function1 {
    public final float a;
    public final State b;

    public x1(float f, State state0) {
        this.a = f;
        this.b = state0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        int v = ((Number)object0).intValue();
        if(v == PageIndicatorKt.access$PageIndicator$lambda$6$lambda$3(this.b)) {
            return (float)(1.0f - Math.abs(this.a));
        }
        if(v == PageIndicatorKt.access$PageIndicator$lambda$6$lambda$3(this.b) + 1) {
            float f = this.a;
            if(f > 0.0f) {
                return f;
            }
        }
        if(v == PageIndicatorKt.access$PageIndicator$lambda$6$lambda$3(this.b) - 1) {
            return this.a < 0.0f ? ((float)(-this.a)) : 0.0f;
        }
        return 0.0f;
    }
}

