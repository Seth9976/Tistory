package com.kakao.tistory.presentation.screen.home.ui.common;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class k extends Lambda implements Function2 {
    public static final k a;

    static {
        k.a = new k();
    }

    public k() {
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
            ComposerKt.traceEventStart(0x2E9EFA, v, -1, "com.kakao.tistory.presentation.screen.home.ui.common.ComposableSingletons$SlotMoreButtonKt.lambda-1.<anonymous> (SlotMoreButton.kt:86)");
        }
        SlotMoreButtonKt.SlotMoreButton(null, 1, 2, new SlotMoreButtonColor(Color.copy-wmQWz5c$default(0L, 0.08f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, null), j.a, ((Composer)object0), 28080, 1);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

