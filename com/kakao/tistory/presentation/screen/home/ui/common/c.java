package com.kakao.tistory.presentation.screen.home.ui.common;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class c extends Lambda implements Function2 {
    public static final c a;

    static {
        c.a = new c();
    }

    public c() {
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
            ComposerKt.traceEventStart(0x90FBF2A6, v, -1, "com.kakao.tistory.presentation.screen.home.ui.common.ComposableSingletons$SlotGridKt.lambda-2.<anonymous> (SlotGrid.kt:46)");
        }
        for(int v1 = 0; v1 < 4; ++v1) {
            SlotGridKt.SlotGridItem-xfPyhaw(SlotGridKt.a, false, ComposableSingletons.SlotGridKt.INSTANCE.getLambda-1$presentation_prodRelease(), 0.0f, 0L, ((Composer)object0), 390, 26);
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

