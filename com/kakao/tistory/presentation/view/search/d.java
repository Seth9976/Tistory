package com.kakao.tistory.presentation.view.search;

import androidx.compose.material.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.res.PainterResources_androidKt;
import com.kakao.tistory.presentation.R.drawable;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class d extends Lambda implements Function2 {
    public static final d a;

    static {
        d.a = new d();
    }

    public d() {
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
            ComposerKt.traceEventStart(0xA6477B0B, v, -1, "com.kakao.tistory.presentation.view.search.ComposableSingletons$SearchToolbarKt.lambda-3.<anonymous> (SearchToolbar.kt:225)");
        }
        IconKt.Icon-ww6aTOc(PainterResources_androidKt.painterResource(drawable.ic_bar_search, ((Composer)object0), 0), null, null, Color.Companion.getUnspecified-0d7_KjU(), ((Composer)object0), 0xC38, 4);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

