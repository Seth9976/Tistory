package com.kakao.tistory.presentation.widget.common;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class k4 extends Lambda implements Function2 {
    public final Function3 a;
    public final float b;

    public k4(Function3 function30, float f) {
        this.a = function30;
        this.b = f;
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
            ComposerKt.traceEventStart(0x46A57F97, v, -1, "com.kakao.tistory.presentation.widget.common.TistoryTopAppBar.<anonymous>.<anonymous> (TistoryTopAppBar.kt:44)");
        }
        this.a.invoke(this.b, ((Composer)object0), 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

