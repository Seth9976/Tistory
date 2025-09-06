package com.kakao.tistory.presentation.main.ui;

import androidx.compose.foundation.layout.SizeKt;
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

public final class c extends Lambda implements Function2 {
    public final Integer a;
    public final String b;

    public c(Integer integer0, String s) {
        this.a = integer0;
        this.b = s;
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
            ComposerKt.traceEventStart(0x1CBF240F, v, -1, "com.kakao.tistory.presentation.main.ui.BottomBarIconItem.<anonymous> (BottomBar.kt:108)");
        }
        Integer integer0 = this.a;
        if(integer0 != null) {
            Painter painter0 = PainterResources_androidKt.painterResource(((int)integer0), ((Composer)object0), 0);
            Modifier modifier0 = SizeKt.size-3ABfNKs(Modifier.Companion, 27.0f);
            long v1 = Color.Companion.getUnspecified-0d7_KjU();
            IconKt.Icon-ww6aTOc(painter0, this.b, modifier0, v1, ((Composer)object0), 0xD88, 0);
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

