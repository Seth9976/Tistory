package com.kakao.tistory.presentation.widget.common;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.res.PainterResources_androidKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class g extends Lambda implements Function2 {
    public final int a;

    public g(int v) {
        this.a = v;
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
            ComposerKt.traceEventStart(0x4327CE37, v, -1, "com.kakao.tistory.presentation.widget.common.BlogFollowing.<anonymous>.<anonymous> (BlogFollowing.kt:58)");
        }
        Modifier modifier0 = SizeKt.size-3ABfNKs(Modifier.Companion, 28.0f);
        IconKt.Icon-ww6aTOc(PainterResources_androidKt.painterResource(this.a, ((Composer)object0), 0), null, modifier0, Color.Companion.getUnspecified-0d7_KjU(), ((Composer)object0), 0xDB8, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

