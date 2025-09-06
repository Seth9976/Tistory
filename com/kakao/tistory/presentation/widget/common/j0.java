package com.kakao.tistory.presentation.widget.common;

import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class j0 extends Lambda implements Function1 {
    public final State a;

    public j0(State state0) {
        this.a = state0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((GraphicsLayerScope)object0), "$this$graphicsLayer");
        ((GraphicsLayerScope)object0).setRotationZ(CommonTextFieldKt.access$EndIcon$lambda$2(this.a));
        return Unit.INSTANCE;
    }
}

