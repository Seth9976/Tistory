package com.kakao.tistory.presentation.view.login;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.kakao.tistory.presentation.view.common.widget.TistoryToolbar.AppBarHomeAsUpButtonType.BackBlack;
import com.kakao.tistory.presentation.widget.common.TistoryToolbarKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class z extends Lambda implements Function2 {
    public final TistroyLoginActivity a;

    public z(TistroyLoginActivity tistroyLoginActivity0) {
        this.a = tistroyLoginActivity0;
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
            ComposerKt.traceEventStart(0x30E5720D, v, -1, "com.kakao.tistory.presentation.view.login.TistroyLoginActivity.Content.<anonymous> (TistroyLoginActivity.kt:130)");
        }
        y y0 = new y(this.a);
        TistoryToolbarKt.TistoryToolbar("", false, true, BackBlack.INSTANCE, y0, null, null, null, ((Composer)object0), 0xD86, 0xE2);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

