package com.kakao.tistory.presentation.screen.home.ui.slot;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class a0 extends Lambda implements Function3 {
    public static final a0 a;

    static {
        a0.a = new a0();
    }

    public a0() {
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        Intrinsics.checkNotNullParameter(((List)object0), "list");
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-880882602, v, -1, "com.kakao.tistory.presentation.screen.home.ui.slot.ComposableSingletons$CategoryKt.lambda-1.<anonymous> (Category.kt:87)");
        }
        CategoryKt.access$EntryList(((List)object0), ((Composer)object1), 8);
        SpacerKt.Spacer(SizeKt.height-3ABfNKs(Modifier.Companion, 10.0f), ((Composer)object1), 6);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

