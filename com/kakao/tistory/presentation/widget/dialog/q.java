package com.kakao.tistory.presentation.widget.dialog;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class q extends Lambda implements Function2 {
    public final String a;
    public final String b;
    public final int c;
    public final Function1 d;

    public q(String s, String s1, int v, Function1 function10) {
        this.a = s;
        this.b = s1;
        this.c = v;
        this.d = function10;
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
            ComposerKt.traceEventStart(0x8DD49E06, v, -1, "com.kakao.tistory.presentation.widget.dialog.DialogFactory.ShowOk.<anonymous> (TistoryComposeDialog.kt:83)");
        }
        TistoryComposeDialogKt.access$TistoryDialogView(this.a, this.b, null, this.c, false, this.d, ((Composer)object0), 0, 20);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

