package com.kakao.tistory.presentation.view.toppost;

import com.kakao.tistory.presentation.viewmodel.TopEntriesSortType;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class f extends Lambda implements Function1 {
    public final TopPostListActivity a;

    public f(TopPostListActivity topPostListActivity0) {
        this.a = topPostListActivity0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((TopEntriesSortType)object0), "it");
        TopPostListActivity.access$getTopPostViewModel(this.a).onClickSortItem(((TopEntriesSortType)object0));
        return Unit.INSTANCE;
    }
}

