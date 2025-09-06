package com.kakao.tistory.presentation.common.graph;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class k extends Lambda implements Function2 {
    public static final k a;

    static {
        k.a = new k();
    }

    public k() {
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
            ComposerKt.traceEventStart(0xDD109036, v, -1, "com.kakao.tistory.presentation.common.graph.ComposableSingletons$BlogTwinBarGraphKt.lambda-1.<anonymous> (BlogTwinBarGraph.kt:85)");
        }
        BlogTwinBarGraphKt.BlogTwinBarGraph(BlogTwinBarGraphKt.getBlogGraphDummyItem(), SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), ((Composer)object0), 56, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

