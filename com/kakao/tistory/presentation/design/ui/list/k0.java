package com.kakao.tistory.presentation.design.ui.list;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class k0 extends Lambda implements Function2 {
    public final int a;
    public final Integer b;
    public final String c;
    public final boolean d;
    public final Visibility e;

    public k0(int v, Integer integer0, String s, boolean z, Visibility entryListUiState$Visibility0) {
        this.a = v;
        this.b = integer0;
        this.c = s;
        this.d = z;
        this.e = entryListUiState$Visibility0;
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
            ComposerKt.traceEventStart(875191390, v, -1, "com.kakao.tistory.presentation.design.ui.list.EntryListItem.<anonymous> (EntryList.kt:129)");
        }
        EntryListItemInfoKt.EntryListItemInfo(this.a, this.b, this.c, this.d, this.e, ((Composer)object0), 0, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

