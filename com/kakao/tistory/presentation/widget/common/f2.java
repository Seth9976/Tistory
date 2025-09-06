package com.kakao.tistory.presentation.widget.common;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.text.TextLayoutResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class f2 extends Lambda implements Function1 {
    public final Function1 a;
    public final MutableState b;

    public f2(Function1 function10, MutableState mutableState0) {
        this.a = function10;
        this.b = mutableState0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((TextLayoutResult)object0), "it");
        if(((TextLayoutResult)object0).getDidOverflowHeight()) {
            ReadMoreTextViewKt.access$ReadMoreTextView$lambda$2(this.b, true);
        }
        this.a.invoke(((TextLayoutResult)object0));
        return Unit.INSTANCE;
    }
}

