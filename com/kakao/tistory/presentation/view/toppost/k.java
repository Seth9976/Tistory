package com.kakao.tistory.presentation.view.toppost;

import com.kakao.tistory.presentation.viewmodel.TopEntriesSortType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class k extends Lambda implements Function0 {
    public final Function1 a;
    public final TopEntriesSortType b;

    public k(Function1 function10, TopEntriesSortType topEntriesSortType0) {
        this.a = function10;
        this.b = topEntriesSortType0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.a.invoke(this.b);
        return Unit.INSTANCE;
    }
}

