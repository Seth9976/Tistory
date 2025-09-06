package com.kakao.tistory.presentation.widget.common;

import androidx.compose.material3.TopAppBarScrollBehavior;
import androidx.compose.material3.TopAppBarState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class b5 extends Lambda implements Function1 {
    public final TopAppBarScrollBehavior a;

    public b5(TopAppBarScrollBehavior topAppBarScrollBehavior0) {
        this.a = topAppBarScrollBehavior0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        TopAppBarState topAppBarState0 = this.a.getState();
        topAppBarState0.setHeightOffset(topAppBarState0.getHeightOffset() + ((Number)object0).floatValue());
        return Unit.INSTANCE;
    }
}

