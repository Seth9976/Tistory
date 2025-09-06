package com.kakao.tistory.presentation.screen.blog.main.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class e4 extends Lambda implements Function2 {
    public static final e4 a;

    static {
        e4.a = new e4();
    }

    public e4() {
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
            ComposerKt.traceEventStart(-308120774, v, -1, "com.kakao.tistory.presentation.screen.blog.main.ui.ComposableSingletons$BlogMainOthersMenuBottomSheetKt.lambda-1.<anonymous> (BlogMainOthersMenuBottomSheet.kt:49)");
        }
        BlogMainOthersMenuBottomSheetKt.BlogMainOthersMenuBottomSheet(false, b4.a, false, c4.a, d4.a, ((Composer)object0), 28086);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

