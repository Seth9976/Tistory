package com.kakao.tistory.presentation.widget.swipe;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;

public final class g extends Lambda implements Function2 {
    public final Object a;
    public final Function4 b;
    public final int c;
    public final Object d;
    public final int e;

    public g(Object object0, Function4 function40, int v, Object object1, int v1) {
        this.a = object0;
        this.b = function40;
        this.c = v;
        this.d = object1;
        this.e = v1;
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
            ComposerKt.traceEventStart(0x63F15CCC, v, -1, "com.kakao.tistory.presentation.widget.swipe.SwipeableItems.<anonymous> (LazyListExtension.kt:46)");
        }
        ((Composer)object0).startMovableGroup(1774380664, this.a);
        this.b.invoke(this.c, this.d, ((Composer)object0), ((int)((this.e >> 3 & 8) << 3)));
        ((Composer)object0).endMovableGroup();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

