package com.kakao.tistory.presentation.view.common.base;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class l0 extends Lambda implements Function2 {
    public final TistoryToolbarComposeActivity a;

    public l0(TistoryToolbarComposeActivity tistoryToolbarComposeActivity0) {
        this.a = tistoryToolbarComposeActivity0;
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
            ComposerKt.traceEventStart(0x3ED216CF, v, -1, "com.kakao.tistory.presentation.view.common.base.TistoryToolbarComposeActivity.onCreate.<anonymous>.<anonymous> (TistoryToolbarComposeActivity.kt:24)");
        }
        this.a.Content(Modifier.Companion, ((Composer)object0), 6);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

