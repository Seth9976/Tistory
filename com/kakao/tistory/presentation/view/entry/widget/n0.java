package com.kakao.tistory.presentation.view.entry.widget;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.text.TextLayoutResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class n0 extends Lambda implements Function1 {
    public final MutableState a;

    public n0(MutableState mutableState0) {
        this.a = mutableState0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((TextLayoutResult)object0), "it");
        CommentKt.access$CommentContent$lambda$9$lambda$6(this.a, ((TextLayoutResult)object0));
        return Unit.INSTANCE;
    }
}

