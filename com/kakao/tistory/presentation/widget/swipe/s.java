package com.kakao.tistory.presentation.widget.swipe;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.unit.IntSize;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class s extends Lambda implements Function1 {
    public final MutableState a;

    public s(MutableState mutableState0) {
        this.a = mutableState0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        SwipeableItemKt.access$SwipeableItem_OadGlvw$lambda$13$lambda$3(this.a, IntSize.getHeight-impl(((IntSize)object0).unbox-impl()));
        return Unit.INSTANCE;
    }
}

