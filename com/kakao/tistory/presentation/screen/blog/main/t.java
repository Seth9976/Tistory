package com.kakao.tistory.presentation.screen.blog.main;

import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainUiState;
import com.kakao.tistory.presentation.screen.blog.main.contract.DialogType.Delete;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class t extends Lambda implements Function0 {
    public final BlogMainUiState a;
    public final Delete b;

    public t(BlogMainUiState blogMainUiState0, Delete dialogType$Delete0) {
        this.a = blogMainUiState0;
        this.b = dialogType$Delete0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.a.getOnDismissDialog().invoke();
        this.a.getDeleteEntry().invoke(this.b.getBlogName(), this.b.getEntryId());
        return Unit.INSTANCE;
    }
}

