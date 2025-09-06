package com.kakao.tistory.presentation.widget.dialog;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class c0 extends Lambda implements Function3 {
    public final String a;
    public final boolean b;

    public c0(String s, boolean z) {
        this.a = s;
        this.b = z;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        Intrinsics.checkNotNullParameter(((RowScope)object0), "$this$BottomSheetItem");
        if((v & 14) == 0) {
            v |= (((Composer)object1).changed(((RowScope)object0)) ? 4 : 2);
        }
        if((v & 91) == 18 && ((Composer)object1).getSkipping()) {
            ((Composer)object1).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x3F60207, v, -1, "com.kakao.tistory.presentation.widget.dialog.BottomSheetItem.<anonymous> (TistoryComposeBottomSheet.kt:118)");
        }
        Modifier modifier0 = RowScope.weight$default(((RowScope)object0), Modifier.Companion, 1.0f, false, 2, null);
        TistoryComposeBottomSheetKt.BottomSheetItemText(this.a, modifier0, this.b, ((Composer)object1), 0, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

