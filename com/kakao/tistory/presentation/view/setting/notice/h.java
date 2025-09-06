package com.kakao.tistory.presentation.view.setting.notice;

import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.State;
import androidx.paging.compose.LazyPagingItems;
import com.kakao.tistory.presentation.view.common.PagingItemListKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class h extends Lambda implements Function1 {
    public final LazyPagingItems a;
    public final State b;

    public h(LazyPagingItems lazyPagingItems0, State state0) {
        this.a = lazyPagingItems0;
        this.b = state0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((LazyListScope)object0), "$this$LazyColumn");
        List list0 = SettingNoticeListActivity.access$SettingNoticeContent$lambda$2$lambda$1(this.b).getItems();
        Function3 function30 = ComposableSingletons.SettingNoticeListActivityKt.INSTANCE.getLambda-2$presentation_prodRelease();
        PagingItemListKt.pagingItemList$default(((LazyListScope)object0), this.a, list0, 0, function30, 4, null);
        return Unit.INSTANCE;
    }
}

