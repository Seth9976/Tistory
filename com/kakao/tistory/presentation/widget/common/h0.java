package com.kakao.tistory.presentation.widget.common;

import androidx.compose.material.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.res.PainterResources_androidKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class h0 extends Lambda implements Function2 {
    public final int a;
    public final Modifier b;

    public h0(int v, Modifier modifier0) {
        this.a = v;
        this.b = modifier0;
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
            ComposerKt.traceEventStart(2011611093, v, -1, "com.kakao.tistory.presentation.widget.common.EndIcon.<anonymous> (CommonTextField.kt:202)");
        }
        Painter painter0 = PainterResources_androidKt.painterResource(this.a, ((Composer)object0), 0);
        long v1 = Color.Companion.getUnspecified-0d7_KjU();
        IconKt.Icon-ww6aTOc(painter0, null, this.b, v1, ((Composer)object0), 0xC38, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

