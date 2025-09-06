package com.kakao.tistory.presentation.screen.home.ui.slot;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Offset;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class f0 extends Lambda implements Function1 {
    public final MutableState a;

    public f0(MutableState mutableState0) {
        this.a = mutableState0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        CreatorKt.access$Creator$lambda$7(this.a, ((Offset)object0).unbox-impl());
        return Unit.INSTANCE;
    }
}

