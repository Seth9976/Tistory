package com.kakao.tistory.presentation.widget.dialog;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class a0 extends Lambda implements Function3 {
    public final Integer a;

    public a0(Integer integer0) {
        this.a = integer0;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        Intrinsics.checkNotNullParameter(((RowScope)object0), "$this$BottomSheetItem");
        if((v & 81) == 16 && ((Composer)object1).getSkipping()) {
            ((Composer)object1).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x92F91D5D, v, -1, "com.kakao.tistory.presentation.widget.dialog.BottomSheetItem.<anonymous> (TistoryComposeBottomSheet.kt:89)");
        }
        Integer integer0 = this.a;
        if(integer0 != null) {
            TistoryComposeBottomSheetKt.BottomSheetItemIcon(integer0.intValue(), ((Composer)object1), 0);
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

