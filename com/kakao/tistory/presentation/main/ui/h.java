package com.kakao.tistory.presentation.main.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class h extends Lambda implements Function3 {
    public final Function2 a;
    public final Function2 b;

    public h(Function2 function20, Function2 function21) {
        this.a = function20;
        this.b = function21;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        boolean z = ((Boolean)object0).booleanValue();
        int v = ((Number)object2).intValue();
        if((v & 14) == 0) {
            v |= (((Composer)object1).changed(z) ? 4 : 2);
        }
        if((v & 91) == 18 && ((Composer)object1).getSkipping()) {
            ((Composer)object1).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xB07D0F8D, v, -1, "com.kakao.tistory.presentation.main.ui.BottomBarItem.<anonymous>.<anonymous> (BottomBar.kt:82)");
        }
        switch(z) {
            case 0: {
                ((Composer)object1).startReplaceGroup(747951052);
                this.b.invoke(((Composer)object1), 0);
                ((Composer)object1).endReplaceGroup();
                break;
            }
            case 1: {
                ((Composer)object1).startReplaceGroup(747949780);
                this.a.invoke(((Composer)object1), 0);
                ((Composer)object1).endReplaceGroup();
                break;
            }
            default: {
                ((Composer)object1).startReplaceGroup(0x6605F27C);
                ((Composer)object1).endReplaceGroup();
            }
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

