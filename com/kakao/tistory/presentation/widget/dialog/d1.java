package com.kakao.tistory.presentation.widget.dialog;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class d1 extends Lambda implements Function2 {
    public final String a;
    public final String b;
    public final boolean c;
    public final int d;
    public final int e;
    public final boolean f;
    public final Function0 g;
    public final Function0 h;

    public d1(String s, String s1, boolean z, int v, int v1, boolean z1, Function0 function00, Function0 function01) {
        this.a = s;
        this.b = s1;
        this.c = z;
        this.d = v;
        this.e = v1;
        this.f = z1;
        this.g = function00;
        this.h = function01;
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
            ComposerKt.traceEventStart(0x60244117, v, -1, "com.kakao.tistory.presentation.widget.dialog.TistoryAlertDialog.<anonymous> (TistoryComposeDialog.kt:191)");
        }
        String s = this.a;
        String s1 = this.b;
        Integer integer0 = this.c ? this.d : null;
        Integer integer1 = this.e;
        boolean z = this.f;
        ((Composer)object0).startReplaceGroup(0x1FBDA549);
        boolean z1 = ((Composer)object0).changed(this.g);
        boolean z2 = ((Composer)object0).changed(this.h);
        Function0 function00 = this.g;
        Function0 function01 = this.h;
        c1 c10 = ((Composer)object0).rememberedValue();
        if(z1 || z2 || c10 == Composer.Companion.getEmpty()) {
            c10 = new c1(function00, function01);
            ((Composer)object0).updateRememberedValue(c10);
        }
        ((Composer)object0).endReplaceGroup();
        TistoryComposeDialogKt.access$TistoryDialogView(s, s1, integer0, integer1, z, c10, ((Composer)object0), 0, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

