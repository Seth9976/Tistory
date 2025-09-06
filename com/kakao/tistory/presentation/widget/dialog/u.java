package com.kakao.tistory.presentation.widget.dialog;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class u extends Lambda implements Function2 {
    public final String a;
    public final String b;
    public final Integer c;
    public final Integer d;
    public final boolean e;
    public final Function1 f;

    public u(String s, String s1, Integer integer0, Integer integer1, boolean z, Function1 function10) {
        this.a = s;
        this.b = s1;
        this.c = integer0;
        this.d = integer1;
        this.e = z;
        this.f = function10;
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
            ComposerKt.traceEventStart(0x639E8529, v, -1, "com.kakao.tistory.presentation.widget.dialog.DialogFactory.ShowOkCancel.<anonymous> (TistoryComposeDialog.kt:98)");
        }
        TistoryComposeDialogKt.access$TistoryDialogView(this.a, this.b, this.c, this.d, this.e, this.f, ((Composer)object0), 0, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

