package com.kakao.tistory.presentation.design.ui.text;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.ui.text.TextLayoutResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class b extends Lambda implements Function1 {
    public final float a;
    public final MutableFloatState b;

    public b(float f, MutableFloatState mutableFloatState0) {
        this.a = f;
        this.b = mutableFloatState0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((TextLayoutResult)object0), "result");
        float f = ((TextLayoutResult)object0).getLineBottom(0);
        SingleLineNumberKt.access$SingleLineCompactNumber_cf5BqRc$lambda$4(this.b, ((float)Math.ceil((this.a - f) / 2.0f)));
        return Unit.INSTANCE;
    }
}

