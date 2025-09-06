package com.kakao.tistory.presentation.view.search;

import com.kakao.tistory.presentation.viewmodel.TopViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

public final class f2 extends FunctionReferenceImpl implements Function0 {
    public f2(TopViewModel topViewModel0) {
        super(0, topViewModel0, TopViewModel.class, "onClickSort", "onClickSort()V", 0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ((TopViewModel)this.receiver).onClickSort();
        return Unit.INSTANCE;
    }
}

