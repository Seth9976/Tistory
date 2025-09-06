package com.kakao.tistory.presentation.common.graph;

import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.unit.Density;
import androidx.paging.compose.LazyPagingItems;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class t extends Lambda implements Function1 {
    public final LazyPagingItems a;
    public final int b;
    public final long c;
    public final long d;
    public final Function2 e;
    public final Density f;
    public final MutableState g;
    public final TweenBarGraphValue h;

    public t(LazyPagingItems lazyPagingItems0, int v, long v1, long v2, Function2 function20, Density density0, MutableState mutableState0, TweenBarGraphValue tweenBarGraphValue0) {
        this.a = lazyPagingItems0;
        this.b = v;
        this.c = v1;
        this.d = v2;
        this.e = function20;
        this.f = density0;
        this.g = mutableState0;
        this.h = tweenBarGraphValue0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((LazyListScope)object0), "$this$LazyRow");
        LazyListScope.items$default(((LazyListScope)object0), this.a.getItemCount(), null, null, ComposableLambdaKt.composableLambdaInstance(-901311910, true, new s(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h)), 6, null);
        return Unit.INSTANCE;
    }
}

