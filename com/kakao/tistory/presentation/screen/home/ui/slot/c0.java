package com.kakao.tistory.presentation.screen.home.ui.slot;

import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class c0 extends Lambda implements Function3 {
    public static final c0 a;

    static {
        c0.a = new c0();
    }

    public c0() {
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        Intrinsics.checkNotNullParameter(((List)object0), "list");
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-323369380, v, -1, "com.kakao.tistory.presentation.screen.home.ui.slot.ComposableSingletons$CreatorKt.lambda-1.<anonymous> (Creator.kt:107)");
        }
        BoxWithConstraintsKt.BoxWithConstraints(null, null, false, ComposableLambdaKt.rememberComposableLambda(841408198, true, new b0(((List)object0)), ((Composer)object1), 54), ((Composer)object1), 0xC00, 7);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

