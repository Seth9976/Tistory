package com.kakao.tistory.presentation.view.search;

import com.kakao.tistory.presentation.viewmodel.SearchViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

public final class k extends FunctionReferenceImpl implements Function0 {
    public k(SearchViewModel searchViewModel0) {
        super(0, searchViewModel0, SearchViewModel.class, "onClickGoToAllSearch", "onClickGoToAllSearch()V", 0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ((SearchViewModel)this.receiver).onClickGoToAllSearch();
        return Unit.INSTANCE;
    }
}

