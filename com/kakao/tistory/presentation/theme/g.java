package com.kakao.tistory.presentation.theme;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.room.a;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class g extends Lambda implements Function3 {
    public final float a;
    public final int b;
    public final Integer c;
    public final float d;

    public g(float f, int v, Integer integer0, float f1) {
        this.a = f;
        this.b = v;
        this.c = integer0;
        this.d = f1;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v = a.c(((Number)object2), ((Modifier)object0), "$this$composed", ((Composer)object1), 0x9C93E30F);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x9C93E30F, v, -1, "com.kakao.tistory.presentation.theme.roundedBackground.<anonymous> (Modifier.kt:37)");
        }
        Modifier modifier0 = BackgroundKt.background-bw27NRU$default(ClipKt.clip(((Modifier)object0), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(this.a)), ColorResources_androidKt.colorResource(this.b, ((Composer)object1), 0), null, 2, null);
        Integer integer0 = this.c;
        float f = this.d;
        float f1 = this.a;
        ((Composer)object1).startReplaceGroup(-1490600340);
        if(integer0 != null) {
            modifier0 = BorderKt.border(modifier0, BorderStrokeKt.BorderStroke-cXLIe8U(f, ColorResources_androidKt.colorResource(((int)integer0), ((Composer)object1), 0)), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(f1));
        }
        ((Composer)object1).endReplaceGroup();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ((Composer)object1).endReplaceGroup();
        return modifier0;
    }
}

