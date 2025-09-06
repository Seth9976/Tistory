package com.kakao.tistory.presentation.view.search;

import com.kakao.tistory.domain.entity.SortItem;
import com.kakao.tistory.presentation.viewmodel.TopViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class d0 extends Lambda implements Function1 {
    public final TopViewModel a;

    public d0(TopViewModel topViewModel0) {
        this.a = topViewModel0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((SortItem)object0), "it");
        TopViewModel.updateSort$default(this.a, ((SortItem)object0), null, 2, null);
        return Unit.INSTANCE;
    }
}

