package com.kakao.tistory.presentation.common.graph;

import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.unit.Density;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class d0 extends Lambda implements Function1 {
    public final List a;
    public final Density b;
    public final float c;
    public final MutableState d;
    public final int e;
    public final long f;
    public final Function1 g;

    public d0(List list0, Density density0, float f, MutableState mutableState0, int v, long v1, Function1 function10) {
        this.a = list0;
        this.b = density0;
        this.c = f;
        this.d = mutableState0;
        this.e = v;
        this.f = v1;
        this.g = function10;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((LazyListScope)object0), "$this$LazyRow");
        if(this.a.isEmpty()) {
            LazyListScope.item$default(((LazyListScope)object0), null, null, ComposableLambdaKt.composableLambdaInstance(690691070, true, new z(this.b, this.c, this.d)), 3, null);
        }
        StatisticsBarGraphKt.StatisticsBarGraph.1.1.invoke..inlined.itemsIndexed.default.2 statisticsBarGraphKt$StatisticsBarGraph$1$1$invoke$$inlined$itemsIndexed$default$20 = new StatisticsBarGraphKt.StatisticsBarGraph.1.1.invoke..inlined.itemsIndexed.default.2(this.a);
        ComposableLambda composableLambda0 = ComposableLambdaKt.composableLambdaInstance(0xBEF78951, true, new StatisticsBarGraphKt.StatisticsBarGraph.1.1.invoke..inlined.itemsIndexed.default.3(this.a, this.e, this.f, this.g, this.b, this.c, this.d));
        ((LazyListScope)object0).items(this.a.size(), null, statisticsBarGraphKt$StatisticsBarGraph$1$1$invoke$$inlined$itemsIndexed$default$20, composableLambda0);
        return Unit.INSTANCE;
    }
}

