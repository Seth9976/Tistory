package com.kakao.tistory.presentation.view.search;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class l extends Lambda implements Function0 {
    public final SearchActivity a;

    public l(SearchActivity searchActivity0) {
        this.a = searchActivity0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        SearchActivity.access$getSearchViewModel(this.a).onEditorAction(3);
        return Unit.INSTANCE;
    }
}

