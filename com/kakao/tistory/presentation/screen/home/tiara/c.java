package com.kakao.tistory.presentation.screen.home.tiara;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class c extends Lambda implements Function2 {
    public final HomeTiara a;
    public final LastSlotInfo b;
    public final int c;

    public c(HomeTiara homeTiara0, LastSlotInfo homeTiara$LastSlotInfo0, int v) {
        this.a = homeTiara0;
        this.b = homeTiara$LastSlotInfo0;
        this.c = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        this.a.TrackUsage(this.b, ((Composer)object0), RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
        return Unit.INSTANCE;
    }
}

