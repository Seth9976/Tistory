package com.kakao.tistory.presentation.widget.common;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.text.AnnotatedString;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class g3 extends Lambda implements Function3 {
    public final AnnotatedString a;

    public g3(AnnotatedString annotatedString0) {
        this.a = annotatedString0;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        Intrinsics.checkNotNullParameter(((AnimatedVisibilityScope)object0), "$this$AnimatedVisibility");
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1780858208, v, -1, "com.kakao.tistory.presentation.widget.common.TistoryToolbar.<anonymous>.<anonymous> (TistoryToolbar.kt:68)");
        }
        TistoryToolbarKt.access$ToolbarTitle(this.a, ((Composer)object1), 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

