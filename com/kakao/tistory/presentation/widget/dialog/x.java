package com.kakao.tistory.presentation.widget.dialog;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import c;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class x extends Lambda implements Function3 {
    public final Function3 a;
    public final Function3 b;
    public final Function3 c;

    public x(Function3 function30, Function3 function31, Function3 function32) {
        this.a = function30;
        this.b = function31;
        this.c = function32;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        Intrinsics.checkNotNullParameter(((RowScope)object0), "$this$BottomSheetItemSpace");
        if((v & 14) == 0) {
            v |= (((Composer)object1).changed(((RowScope)object0)) ? 4 : 2);
        }
        if((v & 91) == 18 && ((Composer)object1).getSkipping()) {
            ((Composer)object1).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xE0DF88DF, v, -1, "com.kakao.tistory.presentation.widget.dialog.BottomSheetItem.<anonymous> (TistoryComposeBottomSheet.kt:62)");
        }
        Function3 function30 = this.a;
        ((Composer)object1).startReplaceGroup(0xAC184550);
        if(function30 != null) {
            function30.invoke(((RowScope)object0), ((Composer)object1), ((int)(v & 14)));
            c.a(8.0f, Modifier.Companion, ((Composer)object1), 6);
        }
        ((Composer)object1).endReplaceGroup();
        this.b.invoke(((RowScope)object0), ((Composer)object1), ((int)(v & 14)));
        Function3 function31 = this.c;
        if(function31 != null) {
            SpacerKt.Spacer(SizeKt.width-3ABfNKs(Modifier.Companion, 8.0f), ((Composer)object1), 6);
            function31.invoke(((RowScope)object0), ((Composer)object1), ((int)(v & 14)));
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

