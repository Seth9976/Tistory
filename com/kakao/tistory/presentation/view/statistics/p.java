package com.kakao.tistory.presentation.view.statistics;

import com.kakao.tistory.domain.entity.SortItem;
import com.kakao.tistory.domain.entity.entry.EntryItem;
import com.kakao.tistory.presentation.viewmodel.TopViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class p extends Lambda implements Function1 {
    public final TopViewModel a;
    public final EntryItem b;

    public p(TopViewModel topViewModel0, EntryItem entryItem0) {
        this.a = topViewModel0;
        this.b = entryItem0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((SortItem)object0), "it");
        o o0 = new o(this.b, ((SortItem)object0));
        this.a.updateSort(((SortItem)object0), o0);
        return Unit.INSTANCE;
    }
}

