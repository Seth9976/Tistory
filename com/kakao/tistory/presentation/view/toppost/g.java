package com.kakao.tistory.presentation.view.toppost;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class g extends Lambda implements Function0 {
    public final TopPostListActivity a;

    public g(TopPostListActivity topPostListActivity0) {
        this.a = topPostListActivity0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        TopPostListActivity.access$getTopPostViewModel(this.a).hideSortBottomSheet();
        return Unit.INSTANCE;
    }
}

