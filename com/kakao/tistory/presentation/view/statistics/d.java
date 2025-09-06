package com.kakao.tistory.presentation.view.statistics;

import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class d extends Lambda implements Function1 {
    public final RefererEtcListFragment a;
    public final State b;

    public d(RefererEtcListFragment refererEtcListFragment0, State state0) {
        this.a = refererEtcListFragment0;
        this.b = state0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((LazyListScope)object0), "$this$LazyColumn");
        LazyListScope.item$default(((LazyListScope)object0), null, null, ComposableLambdaKt.composableLambdaInstance(0x805E1747, true, new c(this.a)), 3, null);
        List list0 = RefererEtcListFragment.access$Content$lambda$0(this.b);
        Intrinsics.checkNotNullExpressionValue(list0, "access$Content$lambda$0(...)");
        ((LazyListScope)object0).items(list0.size(), null, new RefererEtcListFragment.Content.1.invoke..inlined.items.default.3(RefererEtcListFragment.Content.1.invoke..inlined.items.default.1.INSTANCE, list0), ComposableLambdaKt.composableLambdaInstance(0xDA480CDF, true, new RefererEtcListFragment.Content.1.invoke..inlined.items.default.4(list0, this.a)));
        return Unit.INSTANCE;
    }
}

