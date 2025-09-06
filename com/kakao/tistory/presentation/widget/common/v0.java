package com.kakao.tistory.presentation.widget.common;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class v0 extends Lambda implements Function4 {
    public static final v0 a;

    static {
        v0.a = new v0();
    }

    public v0() {
        super(4);
    }

    @Override  // kotlin.jvm.functions.Function4
    public final Object invoke(Object object0, Object object1, Object object2, Object object3) {
        ((Number)object1).floatValue();
        int v = ((Number)object3).intValue();
        Intrinsics.checkNotNullParameter(((RowScope)object0), "$this$null");
        if((v & 641) == 0x80 && ((Composer)object2).getSkipping()) {
            ((Composer)object2).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x4E0F464B, v, -1, "com.kakao.tistory.presentation.widget.common.ComposableSingletons$TistoryTopAppBarKt.lambda-3.<anonymous> (TistoryTopAppBar.kt:36)");
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

