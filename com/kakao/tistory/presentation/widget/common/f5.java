package com.kakao.tistory.presentation.widget.common;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.material3.TopAppBarState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class f5 extends Lambda implements Function1 {
    public final TopAppBarState a;

    public f5(TopAppBarState topAppBarState0) {
        this.a = topAppBarState0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((AnimationScope)object0), "$this$animateTo");
        float f = ((Number)((AnimationScope)object0).getValue()).floatValue();
        this.a.setHeightOffset(f);
        return Unit.INSTANCE;
    }
}

