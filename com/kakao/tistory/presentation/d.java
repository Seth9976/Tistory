package com.kakao.tistory.presentation;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.kakao.tistory.presentation.theme.TistoryThemeKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class d extends Lambda implements Function2 {
    public static final d a;

    static {
        d.a = new d();
    }

    public d() {
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
            ComposerKt.traceEventStart(0xB73B0776, v, -1, "com.kakao.tistory.presentation.ComposableSingletons$TistoryMainActivityKt.lambda-2.<anonymous> (TistoryMainActivity.kt:26)");
        }
        TistoryThemeKt.TistoryTheme(false, ComposableSingletons.TistoryMainActivityKt.INSTANCE.getLambda-1$presentation_prodRelease(), ((Composer)object0), 0x30, 1);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

