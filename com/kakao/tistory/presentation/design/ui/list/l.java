package com.kakao.tistory.presentation.design.ui.list;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import com.kakao.tistory.presentation.theme.TColor;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class l extends Lambda implements Function3 {
    public static final l a;

    static {
        l.a = new l();
    }

    public l() {
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        Intrinsics.checkNotNullParameter(((ColumnScope)object0), "$this$EntryGridItem");
        if((v & 81) == 16 && ((Composer)object1).getSkipping()) {
            ((Composer)object1).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-120850616, v, -1, "com.kakao.tistory.presentation.design.ui.list.ComposableSingletons$EntryListKt.lambda-1.<anonymous> (EntryList.kt:91)");
        }
        SpacerKt.Spacer(BackgroundKt.background-bw27NRU$default(SizeKt.size-3ABfNKs(Modifier.Companion, 20.0f), TColor.INSTANCE.getRed-0d7_KjU(), null, 2, null), ((Composer)object1), 6);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

