package com.kakao.tistory.presentation;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.kakao.tistory.presentation.main.MainAppKt;
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
            ComposerKt.traceEventStart(0x50E6328D, v, -1, "com.kakao.tistory.presentation.ComposableSingletons$TistoryMainActivityKt.lambda-1.<anonymous> (TistoryMainActivity.kt:27)");
        }
        MainAppKt.MainApp(null, ((Composer)object0), 0, 1);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

