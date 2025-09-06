package com.kakao.tistory.presentation.design.ui.text;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class a extends Lambda implements Function1 {
    public final MutableFloatState a;

    public a(MutableFloatState mutableFloatState0) {
        this.a = mutableFloatState0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((GraphicsLayerScope)object0), "$this$graphicsLayer");
        ((GraphicsLayerScope)object0).setTranslationY(SingleLineNumberKt.access$SingleLineCompactNumber_cf5BqRc$lambda$3(this.a));
        return Unit.INSTANCE;
    }
}

