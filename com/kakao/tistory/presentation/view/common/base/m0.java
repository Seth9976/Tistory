package com.kakao.tistory.presentation.view.common.base;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.kakao.tistory.presentation.theme.TistoryThemeKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class m0 extends Lambda implements Function2 {
    public final TistoryToolbarComposeActivity a;

    public m0(TistoryToolbarComposeActivity tistoryToolbarComposeActivity0) {
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
            ComposerKt.traceEventStart(0xFAE24F86, v, -1, "com.kakao.tistory.presentation.view.common.base.TistoryToolbarComposeActivity.onCreate.<anonymous> (TistoryToolbarComposeActivity.kt:23)");
        }
        TistoryThemeKt.TistoryTheme(false, ComposableLambdaKt.rememberComposableLambda(0x3ED216CF, true, new l0(this.a), ((Composer)object0), 54), ((Composer)object0), 0x30, 1);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

