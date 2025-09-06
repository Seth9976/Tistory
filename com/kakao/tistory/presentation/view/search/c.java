package com.kakao.tistory.presentation.view.search;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.PainterResources_androidKt;
import com.kakao.tistory.presentation.R.drawable;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class c extends Lambda implements Function2 {
    public static final c a;

    static {
        c.a = new c();
    }

    public c() {
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
            ComposerKt.traceEventStart(0xD98B8069, v, -1, "com.kakao.tistory.presentation.view.search.ComposableSingletons$SearchToolbarKt.lambda-2.<anonymous> (SearchToolbar.kt:207)");
        }
        Modifier modifier0 = SizeKt.size-3ABfNKs(Modifier.Companion, 16.0f);
        IconKt.Icon-ww6aTOc(PainterResources_androidKt.painterResource(drawable.ic_input_setting_delete_a_os, ((Composer)object0), 0), null, modifier0, 0L, ((Composer)object0), 0xDB8, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

