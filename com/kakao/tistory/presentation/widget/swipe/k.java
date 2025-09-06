package com.kakao.tistory.presentation.widget.swipe;

import androidx.compose.ui.layout.Placeable.PlacementScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class k extends Lambda implements Function1 {
    public static final k a;

    static {
        k.a = new k();
    }

    public k() {
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((PlacementScope)object0), "$this$layout");
        return Unit.INSTANCE;
    }
}

