package com.kakao.tistory.presentation.view.home;

import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class f extends Lambda implements Function1 {
    public final State a;
    public final RefererKeywordListActivity b;

    public f(State state0, RefererKeywordListActivity refererKeywordListActivity0) {
        this.a = state0;
        this.b = refererKeywordListActivity0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((LazyListScope)object0), "$this$LazyColumn");
        LazyListScope.item$default(((LazyListScope)object0), null, null, ComposableSingletons.RefererKeywordListActivityKt.INSTANCE.getLambda-1$presentation_prodRelease(), 3, null);
        LazyListScope.item$default(((LazyListScope)object0), null, null, ComposableSingletons.RefererKeywordListActivityKt.INSTANCE.getLambda-2$presentation_prodRelease(), 3, null);
        List list0 = RefererKeywordListActivity.access$Content$lambda$1(this.a);
        if(list0 == null) {
            list0 = CollectionsKt__CollectionsKt.emptyList();
        }
        ((LazyListScope)object0).items(list0.size(), null, new RefererKeywordListActivity.Content.1.invoke..inlined.items.default.3(RefererKeywordListActivity.Content.1.invoke..inlined.items.default.1.INSTANCE, list0), ComposableLambdaKt.composableLambdaInstance(0xDA480CDF, true, new RefererKeywordListActivity.Content.1.invoke..inlined.items.default.4(list0, this.b)));
        return Unit.INSTANCE;
    }
}

