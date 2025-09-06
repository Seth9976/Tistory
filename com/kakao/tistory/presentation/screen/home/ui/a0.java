package com.kakao.tistory.presentation.screen.home.ui;

import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class a0 extends Lambda implements Function1 {
    public final State a;

    public a0(State state0) {
        this.a = state0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((LazyListScope)object0), "$this$LazyColumn");
        List list0 = HomeSlotListKt.access$SingleLane$lambda$2(this.a);
        ((LazyListScope)object0).items(list0.size(), (z.a == null ? null : new HomeSlotListKt.SingleLane.3.1.invoke..inlined.itemsIndexed.1(z.a, list0)), new HomeSlotListKt.SingleLane.3.1.invoke..inlined.itemsIndexed.2(list0), ComposableLambdaKt.composableLambdaInstance(0xBEF78951, true, new HomeSlotListKt.SingleLane.3.1.invoke..inlined.itemsIndexed.3(list0, this.a)));
        ((LazyListScope)object0).item("CopyRight", "CopyRight", ComposableSingletons.HomeSlotListKt.INSTANCE.getLambda-3$presentation_prodRelease());
        return Unit.INSTANCE;
    }
}

