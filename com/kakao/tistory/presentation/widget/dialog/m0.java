package com.kakao.tistory.presentation.widget.dialog;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import b;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class m0 extends Lambda implements Function3 {
    public final Function3 a;

    public m0(Function3 function30) {
        this.a = function30;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        Intrinsics.checkNotNullParameter(((ColumnScope)object0), "$this$ModalBottomSheet");
        if((v & 14) == 0) {
            v |= (((Composer)object1).changed(((ColumnScope)object0)) ? 4 : 2);
        }
        if((v & 91) == 18 && ((Composer)object1).getSkipping()) {
            ((Composer)object1).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1368513240, v, -1, "com.kakao.tistory.presentation.widget.dialog.TistoryComposeBottomSheet.<anonymous> (TistoryComposeBottomSheet.kt:43)");
        }
        b.a(12.0f, Modifier.Companion, ((Composer)object1), 6);
        this.a.invoke(((ColumnScope)object0), ((Composer)object1), ((int)(v & 14)));
        SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, 12.0f), ((Composer)object1), 6);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

