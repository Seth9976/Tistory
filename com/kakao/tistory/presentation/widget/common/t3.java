package com.kakao.tistory.presentation.widget.common;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.res.PainterResources_androidKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class t3 extends Lambda implements Function2 {
    public final int a;
    public final String b;
    public final long c;

    public t3(int v, String s, long v1) {
        this.a = v;
        this.b = s;
        this.c = v1;
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
            ComposerKt.traceEventStart(0xD0B763BB, v, -1, "com.kakao.tistory.presentation.widget.common.TopAppBarIconButton.<anonymous> (TistoryTopAppBarButton.kt:135)");
        }
        Painter painter0 = PainterResources_androidKt.painterResource(this.a, ((Composer)object0), 0);
        Modifier modifier0 = SizeKt.size-3ABfNKs(Modifier.Companion, 24.0f);
        IconKt.Icon-ww6aTOc(painter0, this.b, modifier0, this.c, ((Composer)object0), 392, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

