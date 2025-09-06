package com.kakao.tistory.presentation.common;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Dp;
import androidx.room.a;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class g extends Lambda implements Function3 {
    public final boolean a;
    public final float b;
    public final long c;
    public final Shape d;

    public g(boolean z, float f, long v, Shape shape0) {
        this.a = z;
        this.b = f;
        this.c = v;
        this.d = shape0;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v = a.c(((Number)object2), ((Modifier)object0), "$this$composed", ((Composer)object1), 0x6A4179E9);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x6A4179E9, v, -1, "com.kakao.tistory.presentation.common.bottomInsetsHeight.<anonymous> (TistoryWindowInsets.kt:44)");
        }
        PaddingValues paddingValues0 = WindowInsetsKt.asPaddingValues(TistoryWindowInsetsKt.getBottomInsets(this.a, ((Composer)object1), 0), ((Composer)object1), 0);
        Modifier modifier0 = PaddingKt.padding(BackgroundKt.background-bw27NRU(SizeKt.height-3ABfNKs(((Modifier)object0), Dp.constructor-impl(paddingValues0.calculateBottomPadding-D9Ej5fM() + this.b)), this.c, this.d), paddingValues0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ((Composer)object1).endReplaceGroup();
        return modifier0;
    }
}

