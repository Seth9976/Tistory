package com.kakao.tistory.presentation.common.graph;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.unit.Density;
import androidx.paging.compose.LazyPagingItems;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class s extends Lambda implements Function4 {
    public final LazyPagingItems a;
    public final int b;
    public final long c;
    public final long d;
    public final Function2 e;
    public final Density f;
    public final MutableState g;
    public final TweenBarGraphValue h;

    public s(LazyPagingItems lazyPagingItems0, int v, long v1, long v2, Function2 function20, Density density0, MutableState mutableState0, TweenBarGraphValue tweenBarGraphValue0) {
        this.a = lazyPagingItems0;
        this.b = v;
        this.c = v1;
        this.d = v2;
        this.e = function20;
        this.f = density0;
        this.g = mutableState0;
        this.h = tweenBarGraphValue0;
        super(4);
    }

    @Override  // kotlin.jvm.functions.Function4
    public final Object invoke(Object object0, Object object1, Object object2, Object object3) {
        int v = ((Number)object1).intValue();
        int v1 = ((Number)object3).intValue();
        Intrinsics.checkNotNullParameter(((LazyItemScope)object0), "$this$items");
        if((v1 & 0x70) == 0) {
            v1 |= (((Composer)object2).changed(v) ? 0x20 : 16);
        }
        if((v1 & 721) == 0x90 && ((Composer)object2).getSkipping()) {
            ((Composer)object2).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-901311910, v1, -1, "com.kakao.tistory.presentation.common.graph.RevenueTwinBarGraph.<anonymous>.<anonymous>.<anonymous> (RevenueTwinBarGraph.kt:50)");
        }
        Object object4 = this.a.get(v);
        if(((BarGraphItem)object4) != null) {
            long v2 = this.c;
            long v3 = this.d;
            Function2 function20 = this.e;
            Density density0 = this.f;
            MutableState mutableState0 = this.g;
            TweenBarGraphValue tweenBarGraphValue0 = this.h;
            boolean z = this.b == v;
            ((Composer)object2).startReplaceGroup(-1976195480);
            boolean z1 = ((Composer)object2).changed(function20);
            p p0 = ((Composer)object2).rememberedValue();
            if((v1 & 0x70) == 0x20 || z1 || p0 == Composer.Companion.getEmpty()) {
                p0 = new p(function20, v);
                ((Composer)object2).updateRememberedValue(p0);
            }
            ((Composer)object2).endReplaceGroup();
            TistoryBarGraphKt.TistoryBarGraphItem-vRFhKjU(null, z, ((BarGraphItem)object4), v2, v3, p0, ComposableLambdaKt.rememberComposableLambda(-600746031, true, new r(density0, mutableState0, z, tweenBarGraphValue0, v2), ((Composer)object2), 54), ((Composer)object2), 0x180000, 1);
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

