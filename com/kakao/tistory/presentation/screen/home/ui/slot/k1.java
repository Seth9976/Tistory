package com.kakao.tistory.presentation.screen.home.ui.slot;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.text.TextLayoutResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class k1 extends Lambda implements Function1 {
    public final MutableState a;

    public k1(MutableState mutableState0) {
        this.a = mutableState0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((TextLayoutResult)object0), "it");
        FocusKt.access$FocusMark$lambda$2(this.a, ((TextLayoutResult)object0).getFirstBaseline());
        return Unit.INSTANCE;
    }
}

