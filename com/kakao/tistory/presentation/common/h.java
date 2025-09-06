package com.kakao.tistory.presentation.common;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import androidx.room.a;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class h extends Lambda implements Function3 {
    public final float a;

    public h(float f) {
        this.a = f;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v = a.c(((Number)object2), ((Modifier)object0), "$this$composed", ((Composer)object1), -1591548103);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1591548103, v, -1, "com.kakao.tistory.presentation.common.topInsetsHeight.<anonymous> (TistoryWindowInsets.kt:55)");
        }
        Modifier modifier0 = SizeKt.height-3ABfNKs(((Modifier)object0), Dp.constructor-impl(WindowInsetsKt.asPaddingValues(TistoryWindowInsets.INSTANCE.getTop(((Composer)object1), 6), ((Composer)object1), 0).calculateTopPadding-D9Ej5fM() + this.a));
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ((Composer)object1).endReplaceGroup();
        return modifier0;
    }
}

