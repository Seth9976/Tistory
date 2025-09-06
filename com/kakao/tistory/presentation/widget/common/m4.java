package com.kakao.tistory.presentation.widget.common;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;

public final class m4 extends Lambda implements Function3 {
    public final Function3 a;
    public final Function3 b;
    public final Function4 c;

    public m4(Function3 function30, Function3 function31, Function4 function40) {
        this.a = function30;
        this.b = function31;
        this.c = function40;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        float f = ((Number)object0).floatValue();
        int v = ((Number)object2).intValue();
        if((v & 14) == 0) {
            v |= (((Composer)object1).changed(f) ? 4 : 2);
        }
        if((v & 91) == 18 && ((Composer)object1).getSkipping()) {
            ((Composer)object1).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xF7F671D7, v, -1, "com.kakao.tistory.presentation.widget.common.TistoryTopAppBar.<anonymous> (TistoryTopAppBar.kt:41)");
        }
        ComposableLambda composableLambda0 = ComposableLambdaKt.rememberComposableLambda(0x46A57F97, true, new k4(this.b, f), ((Composer)object1), 54);
        ComposableLambda composableLambda1 = ComposableLambdaKt.rememberComposableLambda(0x7696C000, true, new l4(this.c, f), ((Composer)object1), 54);
        TistoryTopAppBarKt.TistoryTopAppBarLayout-ygeTB3I(f, this.a, composableLambda0, composableLambda1, 0L, 0.0f, 0L, 0.0f, 0.0f, ((Composer)object1), v & 14 | 0xD80, 0x1F0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

