package com.kakao.tistory.presentation.screen.home;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.kakao.tistory.presentation.widget.common.TistoryTopAppBarButtonKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class q extends Lambda implements Function3 {
    public final String a;
    public final Function0 b;
    public final Function0 c;

    public q(String s, Function0 function00, Function0 function01) {
        this.a = s;
        this.b = function00;
        this.c = function01;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        ((Number)object0).floatValue();
        int v = ((Number)object2).intValue();
        if((v & 81) == 16 && ((Composer)object1).getSkipping()) {
            ((Composer)object1).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x7093B4C8, v, -1, "com.kakao.tistory.presentation.screen.home.HomeTopAppBar.<anonymous> (HomeScreen.kt:179)");
        }
        String s = this.a;
        ((Composer)object1).startReplaceGroup(0x5E7D7FFB);
        boolean z = ((Composer)object1).changed(this.b);
        Function0 function00 = this.b;
        o o0 = ((Composer)object1).rememberedValue();
        if(z || o0 == Composer.Companion.getEmpty()) {
            o0 = new o(function00);
            ((Composer)object1).updateRememberedValue(o0);
        }
        ((Composer)object1).endReplaceGroup();
        ((Composer)object1).startReplaceGroup(0x5E7D91E1);
        boolean z1 = ((Composer)object1).changed(this.c);
        Function0 function01 = this.c;
        p p0 = ((Composer)object1).rememberedValue();
        if(z1 || p0 == Composer.Companion.getEmpty()) {
            p0 = new p(function01);
            ((Composer)object1).updateRememberedValue(p0);
        }
        ((Composer)object1).endReplaceGroup();
        TistoryTopAppBarButtonKt.MainActions(s, false, o0, p0, ((Composer)object1), 0, 2);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

