package com.kakao.tistory.presentation.widget.dialog;

import android.os.Bundle;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.navigation.NavBackStackEntry;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class v1 extends Lambda implements Function3 {
    public final Function0 a;
    public final Function0 b;
    public final Function0 c;

    public v1(Function0 function00, Function0 function01, Function0 function02) {
        this.a = function00;
        this.b = function01;
        this.c = function02;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        Intrinsics.checkNotNullParameter(((NavBackStackEntry)object0), "it");
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xA3B4EA17, v, -1, "com.kakao.tistory.presentation.widget.dialog.welcomeDialog.<anonymous> (WelcomeDialog.kt:53)");
        }
        Bundle bundle0 = ((NavBackStackEntry)object0).getArguments();
        String s = bundle0 == null ? null : bundle0.getString("userName");
        if(s == null) {
            s = "";
        }
        WelcomeDialogKt.WelcomeDialog(s, this.a, this.b, this.c, ((Composer)object1), 0, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

