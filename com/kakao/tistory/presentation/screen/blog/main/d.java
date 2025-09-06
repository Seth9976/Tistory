package com.kakao.tistory.presentation.screen.blog.main;

import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainUiState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class d extends Lambda implements Function0 {
    public final Function0 a;
    public final BlogMainUiState b;

    public d(Function0 function00, BlogMainUiState blogMainUiState0) {
        this.a = function00;
        this.b = blogMainUiState0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.a.invoke();
        this.b.getRefresh().invoke();
        return Unit.INSTANCE;
    }
}

