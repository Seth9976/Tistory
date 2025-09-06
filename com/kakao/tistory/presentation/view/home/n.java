package com.kakao.tistory.presentation.view.home;

import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.kakao.tistory.data.model.StatisticsItem.RefererLog;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class n extends Lambda implements Function1 {
    public final RefererLogListActivity a;
    public final State b;

    public n(RefererLogListActivity refererLogListActivity0, State state0) {
        this.a = refererLogListActivity0;
        this.b = state0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((LazyListScope)object0), "$this$LazyColumn");
        LazyListScope.item$default(((LazyListScope)object0), null, null, ComposableLambdaKt.composableLambdaInstance(0x517281A8, true, new l(this.a)), 3, null);
        LazyListScope.item$default(((LazyListScope)object0), null, null, ComposableSingletons.RefererLogListActivityKt.INSTANCE.getLambda-1$presentation_prodRelease(), 3, null);
        RefererLog statisticsItem$RefererLog0 = RefererLogListActivity.access$RefererLogList$lambda$0(this.b);
        List list0 = statisticsItem$RefererLog0 == null ? null : statisticsItem$RefererLog0.getItems();
        if(list0 == null) {
            list0 = CollectionsKt__CollectionsKt.emptyList();
        }
        ((LazyListScope)object0).items(list0.size(), null, new RefererLogListActivity.RefererLogList.1.invoke..inlined.items.default.3(RefererLogListActivity.RefererLogList.1.invoke..inlined.items.default.1.INSTANCE, list0), ComposableLambdaKt.composableLambdaInstance(0xDA480CDF, true, new RefererLogListActivity.RefererLogList.1.invoke..inlined.items.default.4(list0, this.a)));
        return Unit.INSTANCE;
    }
}

