package com.kakao.tistory.presentation.view.common.widget;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.kakao.tistory.domain.entity.User;
import com.kakao.tistory.presentation.theme.TistoryThemeKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class j extends Lambda implements Function2 {
    public final User a;
    public final boolean b;
    public final TistoryToolbar c;
    public final Function0 d;

    public j(User user0, boolean z, TistoryToolbar tistoryToolbar0, Function0 function00) {
        this.a = user0;
        this.b = z;
        this.c = tistoryToolbar0;
        this.d = function00;
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
            ComposerKt.traceEventStart(0xF88EC222, v, -1, "com.kakao.tistory.presentation.view.common.widget.TistoryToolbar.updateAppBarUserImage.<anonymous>.<anonymous>.<anonymous> (TistoryToolbar.kt:152)");
        }
        TistoryThemeKt.TistoryTheme(false, ComposableLambdaKt.rememberComposableLambda(0x2A9801F9, true, new i(this.a, this.b, this.c, this.d), ((Composer)object0), 54), ((Composer)object0), 0x30, 1);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

