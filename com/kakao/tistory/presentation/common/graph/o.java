package com.kakao.tistory.presentation.common.graph;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import com.kakao.tistory.presentation.theme.ModifierKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class o extends Lambda implements Function3 {
    public static final o a;

    static {
        o.a = new o();
    }

    public o() {
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        Intrinsics.checkNotNullParameter(((AnimatedVisibilityScope)object0), "$this$AnimatedVisibility");
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-608523730, v, -1, "com.kakao.tistory.presentation.common.graph.ComposableSingletons$TistoryBarGraphKt.lambda-1.<anonymous> (TistoryBarGraph.kt:365)");
        }
        BoxKt.Box(SizeKt.fillMaxSize$default(BackgroundKt.background-bw27NRU(ModifierKt.shape-8ww4TTg$default(PaddingKt.padding-3ABfNKs(Modifier.Companion, 3.0f), RoundedCornerShapeKt.RoundedCornerShape-0680j_4(30.0f), 0L, null, 5.0f, 4, null), 0L, RoundedCornerShapeKt.RoundedCornerShape-0680j_4(30.0f)), 0.0f, 1, null), ((Composer)object1), 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

