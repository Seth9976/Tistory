package com.kakao.tistory.presentation.widget.common;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;

public final class x3 extends Lambda implements Function3 {
    public final Function3 a;
    public final Function2 b;
    public final Function3 c;
    public final Function3 d;
    public final long e;
    public final Function4 f;

    public x3(Function3 function30, Function2 function20, Function3 function31, Function3 function32, long v, Function4 function40) {
        this.a = function30;
        this.b = function20;
        this.c = function31;
        this.d = function32;
        this.e = v;
        this.f = function40;
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
            ComposerKt.traceEventStart(0xF3AF2531, v, -1, "com.kakao.tistory.presentation.widget.common.TistoryCollapsingTopAppBar.<anonymous> (TistoryTopAppBar.kt:75)");
        }
        ComposableLambda composableLambda0 = ComposableLambdaKt.rememberComposableLambda(0xE2869550, true, new w3(this.f, f), ((Composer)object1), 54);
        TistoryTopAppBarKt.access$TistoryCollapsingTopAppBarLayout-8L-wENs(this.a, this.b, this.c, composableLambda0, this.d, 0L, this.e, 0.0f, f, ((Composer)object1), v << 24 & 0xE000000 | 0xC00, 0xA0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

