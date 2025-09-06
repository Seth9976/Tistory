package com.kakao.tistory.presentation.view.entry;

import androidx.compose.material.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.res.PainterResources_androidKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class p extends Lambda implements Function2 {
    public final int a;
    public final String b;

    public p(int v, String s) {
        this.a = v;
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
            ComposerKt.traceEventStart(120527304, v, -1, "com.kakao.tistory.presentation.view.entry.EntryViewActivity.DefaultIconButton.<anonymous> (EntryViewActivity.kt:517)");
        }
        Painter painter0 = PainterResources_androidKt.painterResource(this.a, ((Composer)object0), 0);
        long v1 = Color.Companion.getUnspecified-0d7_KjU();
        IconKt.Icon-ww6aTOc(painter0, this.b, null, v1, ((Composer)object0), 3080, 4);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

