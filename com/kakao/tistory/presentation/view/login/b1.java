package com.kakao.tistory.presentation.view.login;

import androidx.compose.material.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.PainterResources_androidKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class b1 extends Lambda implements Function2 {
    public final Integer a;

    public b1(Integer integer0) {
        this.a = integer0;
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
            ComposerKt.traceEventStart(0xB469E92A, v, -1, "com.kakao.tistory.presentation.view.login.TistroyLoginActivity.TistoryLoginTextField.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TistroyLoginActivity.kt:503)");
        }
        IconKt.Icon-ww6aTOc(PainterResources_androidKt.painterResource(((int)this.a), ((Composer)object0), 0), null, Modifier.Companion, 0L, ((Composer)object0), 0xDB8, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

