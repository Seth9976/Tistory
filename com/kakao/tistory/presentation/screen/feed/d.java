package com.kakao.tistory.presentation.screen.feed;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.kakao.tistory.presentation.widget.common.TistoryTopAppBarButtonKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class d extends Lambda implements Function2 {
    public final String a;
    public final Function0 b;
    public final Function0 c;

    public d(String s, Function0 function00, Function0 function01) {
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
            ComposerKt.traceEventStart(1530606584, v, -1, "com.kakao.tistory.presentation.screen.feed.FeedScreen.<anonymous>.<anonymous>.<anonymous> (FeedScreen.kt:104)");
        }
        String s = this.a;
        ((Composer)object0).startReplaceGroup(-1119065218);
        boolean z = ((Composer)object0).changed(this.b);
        Function0 function00 = this.b;
        b b0 = ((Composer)object0).rememberedValue();
        if(z || b0 == Composer.Companion.getEmpty()) {
            b0 = new b(function00);
            ((Composer)object0).updateRememberedValue(b0);
        }
        ((Composer)object0).endReplaceGroup();
        ((Composer)object0).startReplaceGroup(-1119060764);
        boolean z1 = ((Composer)object0).changed(this.c);
        Function0 function01 = this.c;
        c c0 = ((Composer)object0).rememberedValue();
        if(z1 || c0 == Composer.Companion.getEmpty()) {
            c0 = new c(function01);
            ((Composer)object0).updateRememberedValue(c0);
        }
        ((Composer)object0).endReplaceGroup();
        TistoryTopAppBarButtonKt.MainActions(s, false, b0, c0, ((Composer)object0), 0, 2);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

