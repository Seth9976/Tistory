package com.kakao.tistory.presentation.screen.notification;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.kakao.tistory.presentation.widget.common.TistoryTopAppBarButtonKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class o extends Lambda implements Function2 {
    public final String a;
    public final Function0 b;
    public final Function0 c;

    public o(String s, Function0 function00, Function0 function01) {
        this.a = s;
        this.b = function00;
        this.c = function01;
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
            ComposerKt.traceEventStart(0x19F54AB8, v, -1, "com.kakao.tistory.presentation.screen.notification.NotificationScreen.<anonymous>.<anonymous>.<anonymous> (NotificationScreen.kt:97)");
        }
        String s = this.a;
        ((Composer)object0).startReplaceGroup(0xC99959A6);
        boolean z = ((Composer)object0).changed(this.b);
        Function0 function00 = this.b;
        m m0 = ((Composer)object0).rememberedValue();
        if(z || m0 == Composer.Companion.getEmpty()) {
            m0 = new m(function00);
            ((Composer)object0).updateRememberedValue(m0);
        }
        ((Composer)object0).endReplaceGroup();
        ((Composer)object0).startReplaceGroup(0xC9996C0C);
        boolean z1 = ((Composer)object0).changed(this.c);
        Function0 function01 = this.c;
        n n0 = ((Composer)object0).rememberedValue();
        if(z1 || n0 == Composer.Companion.getEmpty()) {
            n0 = new n(function01);
            ((Composer)object0).updateRememberedValue(n0);
        }
        ((Composer)object0).endReplaceGroup();
        TistoryTopAppBarButtonKt.MainActions(s, false, m0, n0, ((Composer)object0), 0, 2);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

