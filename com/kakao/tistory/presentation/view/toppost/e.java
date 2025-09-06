package com.kakao.tistory.presentation.view.toppost;

import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class e extends Lambda implements Function1 {
    public final State a;

    public e(State state0) {
        this.a = state0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((LazyListScope)object0), "$this$LazyColumn");
        List list0 = TopPostListActivity.access$Content$lambda$6$lambda$4(this.a);
        if(list0 == null) {
            list0 = CollectionsKt__CollectionsKt.emptyList();
        }
        ((LazyListScope)object0).items(list0.size(), null, new TopPostListActivity.Content.1.2.1.invoke..inlined.itemsIndexed.default.2(list0), ComposableLambdaKt.composableLambdaInstance(0xBEF78951, true, new TopPostListActivity.Content.1.2.1.invoke..inlined.itemsIndexed.default.3(list0)));
        return Unit.INSTANCE;
    }
}

