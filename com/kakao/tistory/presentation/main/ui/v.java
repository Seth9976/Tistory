package com.kakao.tistory.presentation.main.ui;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class v extends Lambda implements Function3 {
    public final long a;

    public v(long v) {
        this.a = v;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        Intrinsics.checkNotNullParameter(((BoxScope)object0), "$this$BottomBarIconItem");
        if((v & 14) == 0) {
            v |= (((Composer)object1).changed(((BoxScope)object0)) ? 4 : 2);
        }
        if((v & 91) == 18 && ((Composer)object1).getSkipping()) {
            ((Composer)object1).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xB19CD238, v, -1, "com.kakao.tistory.presentation.main.ui.MainBottomBar.<anonymous>.<anonymous>.<anonymous> (MainBottomBar.kt:85)");
        }
        MainBottomBarKt.access$BottomBarItemBadge(((BoxScope)object0), this.a, ((Composer)object1), v & 14);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

