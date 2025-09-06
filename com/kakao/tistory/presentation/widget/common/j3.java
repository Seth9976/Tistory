package com.kakao.tistory.presentation.widget.common;

import androidx.compose.material.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class j3 extends Lambda implements Function2 {
    public final int a;
    public final Integer b;

    public j3(int v, Integer integer0) {
        this.a = v;
        this.b = integer0;
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
            ComposerKt.traceEventStart(0x6553A7FF, v, -1, "com.kakao.tistory.presentation.widget.common.ToolbarButton.<anonymous> (TistoryToolbar.kt:119)");
        }
        Painter painter0 = PainterResources_androidKt.painterResource(this.a, ((Composer)object0), 0);
        ((Composer)object0).startReplaceGroup(631806880);
        String s = this.b == null ? null : StringResources_androidKt.stringResource(this.b.intValue(), ((Composer)object0), 0);
        ((Composer)object0).endReplaceGroup();
        IconKt.Icon-ww6aTOc(painter0, s, null, 0L, ((Composer)object0), 8, 12);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

