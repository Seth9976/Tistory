package com.kakao.tistory.presentation.view.common.base;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class i extends Lambda implements Function2 {
    public final TistoryComposeActivity a;

    public i(TistoryComposeActivity tistoryComposeActivity0) {
        this.a = tistoryComposeActivity0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        int v = ((Number)object1).intValue();
        if((v & 11) == 2 && ((Composer)object0).getSkipping()) {
            ((Composer)object0).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x1205C1D7, v, -1, "com.kakao.tistory.presentation.view.common.base.TistoryComposeActivity.onCreate.<anonymous>.<anonymous> (TistoryComposeActivity.kt:23)");
        }
        this.a.Content(Modifier.Companion, ((Composer)object0), 6);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

