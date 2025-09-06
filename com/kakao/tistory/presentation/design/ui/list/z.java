package com.kakao.tistory.presentation.design.ui.list;

import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class z extends Lambda implements Function2 {
    public final TextStyle a;
    public final int b;
    public final int c;
    public final int d;

    public z(TextStyle textStyle0, int v, int v1, int v2) {
        this.a = textStyle0;
        this.b = v;
        this.c = v1;
        this.d = v2;
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
            ComposerKt.traceEventStart(0xC765BD4B, v, -1, "com.kakao.tistory.presentation.design.ui.list.EntryListItemInfo.<anonymous> (EntryListItemInfo.kt:99)");
        }
        BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), null, false, ComposableLambdaKt.rememberComposableLambda(1706345013, true, new y(this.a, this.b, this.c, this.d), ((Composer)object0), 54), ((Composer)object0), 0xC06, 6);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

