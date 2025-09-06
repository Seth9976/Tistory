package com.kakao.tistory.presentation.screen.blog.main.ui;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.text.TextLayoutResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class z0 extends Lambda implements Function1 {
    public final MutableState a;

    public z0(MutableState mutableState0) {
        this.a = mutableState0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((TextLayoutResult)object0), "it");
        boolean z = ((TextLayoutResult)object0).getHasVisualOverflow();
        BlogMainInfoKt.access$Description$lambda$14(this.a, z);
        return Unit.INSTANCE;
    }
}

