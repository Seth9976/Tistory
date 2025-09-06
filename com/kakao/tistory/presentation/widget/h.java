package com.kakao.tistory.presentation.widget;

import com.kakao.tistory.presentation.viewmodel.TopViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class h extends Lambda implements Function0 {
    public final Function0 a;
    public final TopViewModel b;

    public h(Function0 function00, TopViewModel topViewModel0) {
        this.a = function00;
        this.b = topViewModel0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Function0 function00 = this.a;
        if(function00 != null) {
            g g0 = new g(function00);
            this.b.onClickSort(g0);
            return Unit.INSTANCE;
        }
        this.b.onClickSort();
        return Unit.INSTANCE;
    }
}

