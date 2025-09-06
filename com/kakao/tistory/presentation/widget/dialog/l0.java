package com.kakao.tistory.presentation.widget.dialog;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class l0 extends Lambda implements Function2 {
    public static final l0 a;

    static {
        l0.a = new l0();
    }

    public l0() {
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        int v = ((Number)object1).intValue();
        ((Composer)object0).startReplaceGroup(0x2F66F0F4);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x2F66F0F4, v, -1, "com.kakao.tistory.presentation.widget.dialog.TistoryComposeBottomSheet.<anonymous> (TistoryComposeBottomSheet.kt:40)");
        }
        WindowInsets windowInsets0 = WindowInsetsKt.only-bOOhFvg(WindowInsets_androidKt.getSafeDrawing(WindowInsets.Companion, ((Composer)object0), 8), 0x20);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ((Composer)object0).endReplaceGroup();
        return windowInsets0;
    }
}

