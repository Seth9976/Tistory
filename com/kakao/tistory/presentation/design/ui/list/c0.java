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

public final class c0 extends Lambda implements Function2 {
    public final TextStyle a;
    public final boolean b;
    public final Visibility c;
    public final int d;
    public final Integer e;
    public final String f;

    public c0(TextStyle textStyle0, boolean z, Visibility entryListUiState$Visibility0, int v, Integer integer0, String s) {
        this.a = textStyle0;
        this.b = z;
        this.c = entryListUiState$Visibility0;
        this.d = v;
        this.e = integer0;
        this.f = s;
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
            ComposerKt.traceEventStart(0xB04D2B69, v, -1, "com.kakao.tistory.presentation.design.ui.list.EntryListItemInfo.<anonymous> (EntryListItemInfo.kt:147)");
        }
        BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), null, false, ComposableLambdaKt.rememberComposableLambda(0xB11744D3, true, new b0(this.a, this.b, this.c, this.d, this.e, this.f), ((Composer)object0), 54), ((Composer)object0), 0xC06, 6);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

