package com.kakao.tistory.presentation.design.ui.list;

import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.text.TextStyle;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class s extends Lambda implements Function2 {
    public final String a;
    public final TextStyle b;

    public s(String s, TextStyle textStyle0) {
        this.a = s;
        this.b = textStyle0;
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
            ComposerKt.traceEventStart(0xE0527A65, v, -1, "com.kakao.tistory.presentation.design.ui.list.EntryInfoCount.<anonymous> (EntryListItemInfo.kt:222)");
        }
        TextKt.Text--4IGK_g(this.a, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, this.b, ((Composer)object0), 0, 0xC00, 0xDFFE);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

