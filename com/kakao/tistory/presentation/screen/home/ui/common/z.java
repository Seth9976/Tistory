package com.kakao.tistory.presentation.screen.home.ui.common;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class z extends Lambda implements Function2 {
    public final Function3 a;
    public final boolean b;

    public z(Function3 function30, boolean z) {
        this.a = function30;
        this.b = z;
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
            ComposerKt.traceEventStart(0xA79B9F9F, v, -1, "com.kakao.tistory.presentation.screen.home.ui.common.SlotEntryListItemWithBlog.<anonymous>.<anonymous> (SlotEntryListItem.kt:30)");
        }
        this.a.invoke(Boolean.valueOf(this.b), ((Composer)object0), 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

